/*
Navicat MySQL Data Transfer

Source Server         : Local
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-11-29 17:06:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_exam_report
-- ----------------------------
DROP TABLE IF EXISTS `tb_exam_report`;
CREATE TABLE `tb_exam_report` (
  `ID` varchar(100) NOT NULL COMMENT '系统主键',
  `EXAM_NO` varchar(100) NOT NULL COMMENT '体检编号',
  `REPORT_NO` varchar(100) NOT NULL COMMENT '报告单号',
  `REPORT_NAME` varchar(100) NOT NULL COMMENT '报告名称',
  `EXAM_DOCTOR_CODE` varchar(100) DEFAULT NULL COMMENT '检查医生代码',
  `EXAM_DOCTOR_NAME` varchar(100) DEFAULT NULL COMMENT '检查医生名称',
  `EXAM_TIME` varchar(20) DEFAULT NULL COMMENT '检查时间',
  `REPORT_DOCTOR_CODE` varchar(100) DEFAULT NULL COMMENT '报告医生代码',
  `REPORT_DOCTOR_NAME` varchar(100) DEFAULT NULL COMMENT '报告医生名称',
  `REPORT_TIME` varchar(20) DEFAULT NULL COMMENT '报告时间',
  `VERIFY_DOCTOR_CODE` varchar(100) DEFAULT NULL COMMENT '审核医生代码',
  `VERIFY_DOCTOR_NAME` varchar(100) DEFAULT NULL COMMENT '审核医生名称',
  `VERIFY_TIME` varchar(20) DEFAULT NULL COMMENT '审核时间',
  `CHECKPOINT` varchar(100) DEFAULT NULL COMMENT '检查部位',
  `METHOD` varchar(100) DEFAULT NULL COMMENT '检查方法',
  `FINDING` text COMMENT '检查所见',
  `CONCLUSION` text COMMENT '检查结论',
  `INSTITUTION_CODE` varchar(30) DEFAULT NULL COMMENT '机构代码',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `IMAGES` varchar(100) DEFAULT NULL COMMENT '检查影像，多个图片已逗号(,)分隔',
  `department_code` varchar(50) DEFAULT NULL COMMENT '科室代码',
  `department_name` varchar(50) DEFAULT NULL COMMENT '科室名称',
  PRIMARY KEY (`ID`),
  KEY `idx_tb_exam_report_institution` (`INSTITUTION_CODE`) USING BTREE,
  KEY `idx_tb_exam_report_exam_no` (`EXAM_NO`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='检查报告';

-- ----------------------------
-- Table structure for tb_lab_index
-- ----------------------------
DROP TABLE IF EXISTS `tb_lab_index`;
CREATE TABLE `tb_lab_index` (
  `ID` varchar(100) NOT NULL COMMENT '系统主键',
  `EXAM_NO` varchar(100) NOT NULL COMMENT '体检编号',
  `REPORT_NO` varchar(100) NOT NULL COMMENT '报告单号',
  `INDEX_CODE` varchar(100) DEFAULT NULL COMMENT '检验指标代码',
  `INDEX_NAME` varchar(100) NOT NULL COMMENT '检验指标名称',
  `INDEX_RESULT` varchar(100) DEFAULT NULL COMMENT '检验指标结果',
  `REFERENCE_RANGE` varchar(100) DEFAULT NULL COMMENT '参考值范围',
  `MEASURE_UNIT` varchar(100) DEFAULT NULL COMMENT '计量单位',
  `UNUSUAL_PROMPT` varchar(100) DEFAULT NULL COMMENT '异常提示，0：正常；1：异常偏高；2：异常偏低；3：无法识别的异常',
  `INSTITUTION_CODE` varchar(30) DEFAULT NULL COMMENT '机构代码',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`),
  KEY `idx_tb_lab_index_institution` (`INSTITUTION_CODE`) USING BTREE,
  KEY `idx_tb_lab_index_report_no` (`REPORT_NO`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='检验指标';

-- ----------------------------
-- Table structure for tb_lab_report
-- ----------------------------
DROP TABLE IF EXISTS `tb_lab_report`;
CREATE TABLE `tb_lab_report` (
  `ID` varchar(100) NOT NULL COMMENT '系统主键',
  `EXAM_NO` varchar(100) NOT NULL COMMENT '体检编号',
  `REPORT_NO` varchar(100) NOT NULL COMMENT '报告单号',
  `REPORT_NAME` varchar(100) NOT NULL COMMENT '报告名称',
  `EXAM_DOCTOR_CODE` varchar(100) DEFAULT NULL COMMENT '检查医生代码',
  `EXAM_DOCTOR_NAME` varchar(100) DEFAULT NULL COMMENT '检查医生名称',
  `EXAM_TIME` varchar(20) DEFAULT NULL COMMENT '检查时间',
  `REPORT_DOCTOR_CODE` varchar(100) DEFAULT NULL COMMENT '报告医生代码',
  `REPORT_DOCTOR_NAME` varchar(100) DEFAULT NULL COMMENT '报告医生名称',
  `REPORT_TIME` varchar(20) DEFAULT NULL COMMENT '报告时间',
  `VERIFY_DOCTOR_CODE` varchar(100) DEFAULT NULL COMMENT '审核医生代码',
  `VERIFY_DOCTOR_NAME` varchar(100) DEFAULT NULL COMMENT '审核医生名称',
  `VERIFY_TIME` varchar(20) DEFAULT NULL COMMENT '审核时间',
  `SPECIMEN_CODE` varchar(100) DEFAULT NULL COMMENT '标本代码',
  `SPECIMEN_NAME` varchar(100) DEFAULT NULL COMMENT '标本名称',
  `INSTITUTION_CODE` varchar(30) DEFAULT NULL COMMENT '机构代码',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `exam_opinion` varchar(500) DEFAULT NULL COMMENT '检查意见',
  `department_code` varchar(50) DEFAULT NULL COMMENT '科室代码',
  `department_name` varchar(50) DEFAULT NULL COMMENT '科室名称',
  PRIMARY KEY (`ID`),
  KEY `idx_tb_lab_report_institution` (`INSTITUTION_CODE`) USING BTREE,
  KEY `idx_tb_lab_report_exam_no` (`EXAM_NO`) USING BTREE,
  KEY `idx_tb_lab_report_report_no` (`REPORT_NO`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='检验报告';

-- ----------------------------
-- Table structure for tb_medical_item
-- ----------------------------
DROP TABLE IF EXISTS `tb_medical_item`;
CREATE TABLE `tb_medical_item` (
  `ID` varchar(100) NOT NULL COMMENT '系统主键',
  `CODE` varchar(100) NOT NULL COMMENT '项目代码',
  `NAME` varchar(100) NOT NULL COMMENT '项目名称',
  `PRICE` varchar(100) DEFAULT NULL COMMENT '项目金额',
  `GENDER` int(11) DEFAULT NULL COMMENT '性别标识',
  `MARITAL` int(11) DEFAULT NULL COMMENT '婚姻状态',
  `SUIT` varchar(100) DEFAULT NULL COMMENT '适宜人群',
  `DESCRIPTION` varchar(100) DEFAULT NULL COMMENT '详细说明',
  `REMARK` text COMMENT '临床意义',
  `INSTITUTION_CODE` varchar(30) DEFAULT NULL COMMENT '机构代码',
  `CREATE_TIME` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `ITEM_SHOW` int(11) DEFAULT '0' COMMENT '是否作为加项显示；0：显示；1：隐藏',
  `ITEM_PRICE_SHOW` int(2) DEFAULT '0' COMMENT '是否显示；0：显示；1：隐藏',
  `PROJECT_SHOW` int(2) DEFAULT '0' COMMENT '项目在套餐列表显示；0：显示；1：隐藏',
  `alias_name` varchar(255) DEFAULT NULL COMMENT '别名',
  `sort` int(11) DEFAULT NULL COMMENT '序号',
  `ISPOP` int(2) DEFAULT '0' COMMENT '是否弹窗提示，0：是；1：否',
  `POP_TEXT` varchar(255) DEFAULT NULL COMMENT '弹窗信息',
  PRIMARY KEY (`ID`),
  KEY `IDX_TB_MEDICAL_ITEM_CODE_INSTITUTON` (`CODE`,`INSTITUTION_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='体检项目';

-- ----------------------------
-- Table structure for tb_medical_item_category
-- ----------------------------
DROP TABLE IF EXISTS `tb_medical_item_category`;
CREATE TABLE `tb_medical_item_category` (
  `ID` varchar(100) NOT NULL COMMENT '系统主键',
  `CODE` varchar(100) DEFAULT NULL COMMENT '分类代码',
  `NAME` varchar(100) NOT NULL COMMENT '分类名称',
  `AVATAR` varchar(100) DEFAULT NULL COMMENT '分类图标',
  `INSTITUTION_CODE` varchar(30) DEFAULT NULL COMMENT '机构代码',
  `CREATE_TIME` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `SORT` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='体检项目分类';

-- ----------------------------
-- Table structure for tb_medical_item_category_link
-- ----------------------------
DROP TABLE IF EXISTS `tb_medical_item_category_link`;
CREATE TABLE `tb_medical_item_category_link` (
  `ID` varchar(100) NOT NULL COMMENT '系统主键',
  `CATEGORY_ID` varchar(100) NOT NULL COMMENT '分类代码',
  `ITEM_CODE` varchar(100) NOT NULL COMMENT '项目代码',
  `INSTITUTION_CODE` varchar(30) DEFAULT NULL COMMENT '机构代码',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目分类关联';

-- ----------------------------
-- Table structure for tb_medical_package
-- ----------------------------
DROP TABLE IF EXISTS `tb_medical_package`;
CREATE TABLE `tb_medical_package` (
  `ID` varchar(100) NOT NULL COMMENT '系统主键',
  `CODE` varchar(100) NOT NULL COMMENT '套餐代码',
  `NAME` varchar(100) NOT NULL COMMENT '套餐名称',
  `PRICE` varchar(100) DEFAULT NULL COMMENT '套餐金额',
  `GENDER` int(11) NOT NULL COMMENT '性别标识 性别，0：不限；1：男；2：女',
  `MARITAL` int(11) DEFAULT NULL COMMENT '婚姻标识 婚姻标识，0：不限；1：未婚；2：已婚',
  `SUIT` varchar(100) DEFAULT NULL COMMENT '适宜人群',
  `DESCRIPTION` varchar(100) DEFAULT NULL COMMENT '详细说明',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '备注信息',
  `AVATAR` varchar(100) DEFAULT NULL COMMENT '套餐图标',
  `NOTICE` text COMMENT '体检须知',
  `DEL_FLAG` int(11) NOT NULL COMMENT '删除标记',
  `INSTITUTION_CODE` varchar(30) DEFAULT NULL COMMENT '机构代码',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `SORT` int(11) DEFAULT NULL COMMENT '排序',
  `CATEGORY` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='体检套餐';

-- ----------------------------
-- Table structure for tb_medical_package_item_link
-- ----------------------------
DROP TABLE IF EXISTS `tb_medical_package_item_link`;
CREATE TABLE `tb_medical_package_item_link` (
  `ID` varchar(100) NOT NULL COMMENT '系统主键',
  `PACKAGE_CODE` varchar(100) DEFAULT NULL COMMENT '套餐代码',
  `ITEM_CODE` varchar(100) DEFAULT NULL COMMENT '项目代码',
  `INSTITUTION_CODE` varchar(30) DEFAULT NULL COMMENT '机构代码',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`),
  KEY `IDX_TB_MEDICAL_PACKAGE_ITEM_LINK_PACKAGE_CODE_INSTITUTON` (`PACKAGE_CODE`,`INSTITUTION_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='套餐项目关联';

-- ----------------------------
-- Table structure for tb_medical_preposition
-- ----------------------------
DROP TABLE IF EXISTS `tb_medical_preposition`;
CREATE TABLE `tb_medical_preposition` (
  `id` int(11) NOT NULL,
  `base_url` varchar(100) NOT NULL COMMENT '前置机对应体检机构地址',
  `institution_code` int(10) NOT NULL COMMENT '体检机构编码',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前置机配置';

-- ----------------------------
-- Table structure for tb_medical_preposition_model
-- ----------------------------
DROP TABLE IF EXISTS `tb_medical_preposition_model`;
CREATE TABLE `tb_medical_preposition_model` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `method_name` varchar(100) DEFAULT NULL COMMENT '本地方法名称',
  `request_model_code` text COMMENT '请求模板',
  `response_model_code` text COMMENT '响应模板',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `institution_code` varchar(40) DEFAULT NULL COMMENT '体检机构代码',
  `model_name` varchar(40) DEFAULT NULL COMMENT '1.用于存储WebService 对应的接口名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_medical_preposition_model_link
-- ----------------------------
DROP TABLE IF EXISTS `tb_medical_preposition_model_link`;
CREATE TABLE `tb_medical_preposition_model_link` (
  `id` int(11) NOT NULL,
  `medical_preposition_id` int(11) DEFAULT NULL,
  `medical_interface_id` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_medical_report
-- ----------------------------
DROP TABLE IF EXISTS `tb_medical_report`;
CREATE TABLE `tb_medical_report` (
  `ID` varchar(100) NOT NULL COMMENT '系统主键',
  `EXAM_NO` varchar(100) NOT NULL COMMENT '体检编号',
  `EXAM_DATE` varchar(100) NOT NULL COMMENT '体检日期',
  `REPORT_NO` varchar(100) NOT NULL COMMENT '报告单号',
  `REPORT_TIME` varchar(20) NOT NULL COMMENT '报告时间',
  `VERIFY_TIME` varchar(20) NOT NULL COMMENT '审核时间',
  `IDENTITY_TYPE` int(11) NOT NULL COMMENT '体检人证件类型',
  `IDENTITY` varchar(100) NOT NULL COMMENT '体检人证件号码',
  `NAME` varchar(100) DEFAULT NULL COMMENT '体检人姓名',
  `GENDER` varchar(100) DEFAULT NULL COMMENT '体检人性别，0：不限；1：男；2：女',
  `AGE` varchar(100) DEFAULT NULL COMMENT '体检人年龄',
  `BIRTH_DATE` varchar(100) DEFAULT NULL COMMENT '体检人出生日期',
  `PHONE` varchar(100) DEFAULT NULL COMMENT '体检人联系电话',
  `CHIEF_DOCTOR_CODE` varchar(100) DEFAULT NULL COMMENT '总检医生代码',
  `CHIEF_DOCTOR_NAME` varchar(100) DEFAULT NULL COMMENT '总检医生名称',
  `VERIFY_DOCTOR_CODE` varchar(100) DEFAULT NULL COMMENT '审核医生代码',
  `VERIFY_DOCTOR_NAME` varchar(100) DEFAULT NULL COMMENT '审核医生名称',
  `SUMMARY` text COMMENT '体检报告综述',
  `SUGGESTION` text COMMENT '体检报告建议',
  `CONCLUSION` text COMMENT '体检报告结论',
  `PACKAGE_CODE` varchar(100) DEFAULT NULL COMMENT '套餐代码',
  `PACKAGE_NAME` varchar(100) DEFAULT NULL COMMENT '套餐名称',
  `ITEMS` text COMMENT '体检项目，体检套餐外的自选加项部分, 格式：[{code:String:项目代码, name:String:项目名称}]',
  `INSTITUTION_CODE` varchar(30) DEFAULT NULL COMMENT '机构代码',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `USER_ID` varchar(100) DEFAULT NULL COMMENT '用户ID',
  `GET_REPORT_DATE` date DEFAULT NULL COMMENT '报告获取日期',
  `status` varchar(2) DEFAULT NULL COMMENT '总检状态：0-未总检，1/null-已总检',
  `health_prescription` text COMMENT '保健处方',
  PRIMARY KEY (`ID`),
  KEY `idx_tb_medical_report_institution` (`INSTITUTION_CODE`) USING BTREE,
  KEY `idx_tb_medical_report_exam_no` (`EXAM_NO`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='体检报告';

-- ----------------------------
-- Table structure for tb_personal
-- ----------------------------
DROP TABLE IF EXISTS `tb_personal`;
CREATE TABLE `tb_personal` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL COMMENT '姓名',
  `identity` varchar(40) NOT NULL,
  `identity_type` bigint(10) DEFAULT '0' COMMENT '证件类型，0：身份证',
  `marital` bigint(10) DEFAULT NULL COMMENT '婚姻标识，0：不限；1：未婚；2：已婚',
  `gender` bigint(10) DEFAULT NULL COMMENT '性别，0：不限；1：男；2：女',
  `age` bigint(10) DEFAULT NULL,
  `birth_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '生日',
  `phone` varchar(32) DEFAULT NULL COMMENT '联系手机',
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `institution_code` varchar(255) NOT NULL COMMENT '机构代码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='体检人员';

-- ----------------------------
-- Table structure for tb_personal_appointment
-- ----------------------------
DROP TABLE IF EXISTS `tb_personal_appointment`;
CREATE TABLE `tb_personal_appointment` (
  `ID` varchar(100) NOT NULL COMMENT '系统主键',
  `USER_ID` varchar(100) DEFAULT NULL COMMENT '用户ID；用户自己网上预约时，用户ID不为空；后台管理员代为预约时，用户ID为空',
  `APPOINT_DATE` varchar(100) NOT NULL COMMENT '预约日期',
  `APPOINT_TIME` varchar(20) DEFAULT NULL COMMENT '预约时间段',
  `PACKAGE_CODE` varchar(100) DEFAULT NULL COMMENT '套餐代码',
  `PACKAGE_NAME` varchar(100) DEFAULT NULL COMMENT '套餐名称',
  `ITEMS` text COMMENT '体检项目，体检套餐外的自选加项部分, 格式：[{code:String:项目代码, name:String:项目名称}]',
  `STATUS` int(11) NOT NULL COMMENT '预约状态，0：已预约；1：已取消',
  `OPERATE_TIME` varchar(20) NOT NULL COMMENT '预约操作时间',
  `CANCEL_TIME` varchar(20) DEFAULT NULL COMMENT '预约取消时间',
  `INSTITUTION_CODE` varchar(30) DEFAULT NULL COMMENT '机构代码',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '更新时间',
  `PACKAGE_ID` varchar(100) DEFAULT NULL,
  `PRICE` varchar(100) DEFAULT NULL,
  `EXAM_NO` varchar(100) DEFAULT NULL,
  `ORDER_NO` varchar(30) NOT NULL DEFAULT '-1' COMMENT '订单编号',
  `PLUS_ITEMS` text COMMENT '体检加项',
  `MINUS_ITEMS` text COMMENT '体检减项',
  `SOURCE` int(11) unsigned DEFAULT NULL COMMENT '预约来源；0/null：网上预约；1：电话预约；2：现场预约；99：其它',
  `postcode` varchar(10) DEFAULT NULL COMMENT '邮编',
  PRIMARY KEY (`ID`),
  KEY `idx_tb_personal_appointment_institution` (`INSTITUTION_CODE`) USING BTREE,
  KEY `idx_tb_personal_appointment_user_id` (`USER_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='个人预约';

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` varchar(100) NOT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `crater_time` datetime DEFAULT NULL,
  `last_modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
