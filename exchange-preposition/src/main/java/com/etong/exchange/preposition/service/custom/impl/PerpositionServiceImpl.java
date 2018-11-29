package com.etong.exchange.preposition.service.custom.impl;

import com.alibaba.fastjson.JSONObject;
import com.etong.exchange.preposition.dao.general.*;
import com.etong.exchange.preposition.entity.*;
import com.etong.exchange.preposition.entity.custom.MedicalPackageDTO;
import com.etong.exchange.preposition.entity.custom.PersonalAppointmentDTO;
import com.etong.exchange.preposition.entity.example.*;
import com.etong.exchange.preposition.service.custom.PrepositionService;
import com.etong.exchange.preposition.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class PerpositionServiceImpl implements PrepositionService {

    @Value("${baseModelParam.INSTITUTION_CODE}")
    public String institutionCode;

    //-----------------------------套餐体检项相关
    @Autowired
    private MedicalItemCategoryLinkMapper medicalItemCategoryLinkMapper;

    @Autowired
    private MedicalItemCategoryMapper medicalItemCategoryMapper;

    @Autowired
    private MedicalItemMapper medicalItemMapper;

    @Autowired
    private MedicalPackageMapper medicalPackageMapper;

    @Autowired
    private MedicalPackageItemLinkMapper medicalPackageItemLinkMapper;
    //-----------------------------套餐体检项相关END
    //-----------------------------报告相关
    @Autowired
    private MedicalReportMapper medicalReportMapper;

    @Autowired
    private LabIndexMapper labIndexMapper;

    @Autowired
    private ExamReportMapper examReportMapper;

    @Autowired
    private LabReportMapper labReportMapper;
    //-----------------------------报告相关END

    //-----------------预约相关
    @Autowired
    private PersonalMapper personalMapper;

    @Autowired
    private PersonalAppointmentMapper personalAppointmentMapper;

    @Transactional
    @Override
    public boolean updateRemotePackages(List<MedicalPackage> httpPackageList) {
        log.info("同步套餐》》前置机》》》》》》》》》》");
        if(null == httpPackageList || httpPackageList.isEmpty()){
            return false;
        }
        MedicalPackageExample packageExample = new MedicalPackageExample();
        packageExample.createCriteria().andInstitutionCodeEqualTo(institutionCode);
        medicalPackageMapper.deleteByExample(packageExample);

        MedicalPackageItemLinkExample medicalPackageItemLinkExample = new MedicalPackageItemLinkExample();
        medicalPackageItemLinkExample.createCriteria().andInstitutionCodeEqualTo(institutionCode);
        medicalPackageItemLinkMapper.deleteByExample(medicalPackageItemLinkExample);

        httpPackageList.forEach(packageNode->{
            MedicalPackageDTO paramPackageDTO = new MedicalPackageDTO();
            BeanUtils.copyProperties(packageNode,paramPackageDTO);
            paramPackageDTO.setId(UUID.randomUUID().toString());
            paramPackageDTO.setInstitutionCode(institutionCode);
            medicalPackageMapper.insert(paramPackageDTO);
            packageNode.getItems().forEach(item->{

                MedicalPackageItemLink packageItemLink = new MedicalPackageItemLink();
                packageItemLink.setId(UUID.randomUUID().toString());
                packageItemLink.setInstitutionCode(institutionCode);
                packageItemLink.setItemCode(item.getCode());
                packageItemLink.setPackageCode(packageNode.getCode());

                medicalPackageItemLinkMapper.insert(packageItemLink);


            });


        });

        return true;
    }

    @Transactional
    @Override
    public boolean updateRemoteItems(List<MedicalItemCategory> httpCateList) {
        //etong  subProxy
        // 1.synItems: 2.synPackages
        // 1.1 delete cateItemLink cateItem
        log.info("同步体检项》》前置机》》》》》》》》》》");
        if(null == httpCateList || httpCateList.isEmpty()){
            return false;
        }
        medicalItemCategoryLinkMapper.deleteByHosCode(institutionCode);
        medicalItemCategoryMapper.deleteByHosCode(institutionCode);
        medicalItemMapper.deleteByHosCode(institutionCode);

        httpCateList.forEach(cateGroy->{
            String cateId = UUID.randomUUID().toString();
            cateGroy.setId(cateId);
            cateGroy.setInstitutionCode(institutionCode);

            medicalItemCategoryMapper.insert(cateGroy);


            cateGroy.getItems().forEach(item->{
                MedicalItemCategoryLink categoryLink = new MedicalItemCategoryLink();
                categoryLink.setId(UUID.randomUUID().toString());
                categoryLink.setCategoryId(cateId);
                categoryLink.setInstitutionCode(institutionCode);
                categoryLink.setItemCode(item.getCode());
                medicalItemCategoryLinkMapper.insert(categoryLink);

                item.setId(UUID.randomUUID().toString());
                item.setInstitutionCode(institutionCode);
                medicalItemMapper.insertSelective(item);

            });
        });



        return true;
    }

    @Transactional
    @Override
    public boolean savePersonalAppointment(PersonalAppointment appointmentReuslt) {
        //根据体检编号 查询记录用身份信息
        //报告用体检编号
//        测试
//        appointmentReuslt.setExamNo("1811060011");

        if(null == appointmentReuslt.getExamNo() && !StringUtil.isNotBlank(appointmentReuslt.getExamNo()) ||
                "0".equals(appointmentReuslt.getExamNo())){
            log.info("体检编号不存在,或是无效的,前置机不再记录该信息.ExamNo:"+appointmentReuslt.getExamNo());
            //如果返回的体检编号不存在则预约失败
            return false;
        }
        //基于体检机构预约成功的情况下执行
        PersonalExample personalExample = new PersonalExample();
        personalExample.createCriteria().andIdEqualTo(appointmentReuslt.getUserId());
        if(personalMapper.countByExample(personalExample) == 0){
            Personal personal = new Personal();
            BeanUtils.copyProperties(appointmentReuslt,personal);
            personal.setId(appointmentReuslt.getUserId());
            personal.setGender(Long.valueOf(appointmentReuslt.getGender()));
            personal.setMarital(Long.valueOf(appointmentReuslt.getMarital()));
            personal.setAge(Long.valueOf(appointmentReuslt.getAge()));
            personal.setInstitutionCode(institutionCode);
            personalMapper.insert(personal);
        }
        PersonalAppointmentExample personalAppointmentExample = new PersonalAppointmentExample();
        //唯一校验为 hosCode+体检编号
        personalAppointmentExample.createCriteria().andIdEqualTo(appointmentReuslt.getExamNo() + institutionCode);
        if(personalAppointmentMapper.countByExample(personalAppointmentExample) == 0 ) {
            PersonalAppointmentDTO personalAppointmentDTO = new PersonalAppointmentDTO();
            BeanUtils.copyProperties(appointmentReuslt, personalAppointmentDTO);
            personalAppointmentDTO.setId(appointmentReuslt.getExamNo() + institutionCode);
            //预约状态，0：已预约；1：已取消
            personalAppointmentDTO.setStatus(0);
            personalAppointmentDTO.setAppointDate(appointmentReuslt.getAppointDate());
            log.info("预约记录:" + JSONObject.toJSONString(personalAppointmentDTO));
            personalAppointmentMapper.insert(personalAppointmentDTO);
        }

        return true;
    }

    @Override
    public void cancelPersonalAppointment(PersonalAppointment appointment) {
        PersonalAppointmentExample personalAppointmentExample = new PersonalAppointmentExample();
        //唯一校验为 hosCode+体检编号
        personalAppointmentExample.createCriteria().andIdEqualTo(appointment.getExamNo() + institutionCode);

        PersonalAppointmentDTO personalAppointmentDTO = new PersonalAppointmentDTO();
        personalAppointmentDTO.setStatus(1);
        personalAppointmentMapper.updateByExampleSelective(personalAppointmentDTO,personalAppointmentExample);
    }

    @Transactional
    @Override
    public boolean updateRemoteReports(List<MedicalReport> reports) {
        if(null == reports || reports.isEmpty()){
            return false;
        }
//        MedicalReportMapper medicalReportMapper;
//        LabIndexMapper labIndexMapper;
//        ExamReportMapper examReportMapper;
//        LabReportMapper labReportMapper;
        String examNo = reports.get(0).getExamNo();

        MedicalReportExample reportExample = new MedicalReportExample();
        reportExample.createCriteria().andExamNoEqualTo(examNo).andInstitutionCodeEqualTo(institutionCode);
        medicalReportMapper.deleteByExample(reportExample);

        LabIndexExample labIndexExample = new LabIndexExample();
        labIndexExample.createCriteria().andExamNoEqualTo(examNo).andInstitutionCodeEqualTo(institutionCode);
        labIndexMapper.deleteByExample(labIndexExample);

        ExamReportExample examReportExample = new ExamReportExample();
        examReportExample.createCriteria().andExamNoEqualTo(examNo).andInstitutionCodeEqualTo(institutionCode);
        examReportMapper.deleteByExample(examReportExample);

        LabReportExample labReportExample = new LabReportExample();
        labReportExample.createCriteria().andExamNoEqualTo(examNo).andInstitutionCodeEqualTo(institutionCode);
        labReportMapper.deleteByExample(labReportExample);

        //插入
        reports.forEach(report->{
            report.setId(UUID.randomUUID().toString());
            report.setInstitutionCode(institutionCode);

            medicalReportMapper.insert(report);
            report.getExamReports().forEach(examReport -> {
                examReport.setId(UUID.randomUUID().toString());
                examReport.setInstitutionCode(institutionCode);
                examReportMapper.insert(examReport);
            });

            report.getLabReports().forEach(labReport->{
                labReport.setId(UUID.randomUUID().toString());
                labReport.setInstitutionCode(institutionCode);

                labReportMapper.insert(labReport);
                labReport.getLabIndexes().forEach(labIndex -> {
                    labIndex.setId(UUID.randomUUID().toString());

                    labIndex.setInstitutionCode(institutionCode);
                    labIndexMapper.insert(labIndex);
                });
            });

        });
        return true;
    }


}
