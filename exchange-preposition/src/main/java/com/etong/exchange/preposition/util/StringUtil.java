package com.etong.exchange.preposition.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("restriction")
public class StringUtil {

	@SuppressWarnings({ "rawtypes", "unused" })
	/**
	 * 空字符串检验
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isBlank(final Object obj) {
		if (obj == null) {
			return true;
		} else if (obj instanceof String) {
			String str = obj.toString();
			if (str == null || str.trim().equals("") || str.trim().equalsIgnoreCase("null")) {
				return true;
			} else {
				return false;
			}
		} else if (obj instanceof List) {
			List list = (List) obj;
			if (list == null || list.size() == 0) {
				return true;
			} else {
				return false;
			}
		} else if (obj instanceof Set) {
			Set set = (Set) obj;
			if (set == null || set.size() == 0) {
				return true;
			} else {
				return false;
			}
		} else if (obj instanceof Integer) {
			Integer integer = (Integer) obj;
			if (integer == null) {
				return true;
			} else {
				return false;
			}
		} else if (obj instanceof String[]) {
			String[] o = (String[]) obj;
			if (o == null || o.length == 0) {
				return true;
			} else {
				return false;
			}
		} else if (obj instanceof Double) {
			Double integer = (Double) obj;
			if (integer == null) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	/**
	 * 判断是否是空字符串, 不为空返回 true
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(final Object obj) {
		return !isBlank(obj);
	}

	/**
	 * <pre>
	 * 说   明: 都不为空，才返回TRUE
	 * @param objects
	 * @return
	 * 创建者: 陈    林(Vickey)
	 * 日   期: 2014-6-25下午4:02:33
	 * </pre>
	 */
	public static boolean isNotBlankAnd(Object... objects) {
		if (isBlank(objects)) {
			return false;
		}
		int count = 0;
		for (Object obj : objects) {
			if (isBlank(obj)) {
				return false;
			}
			count++;
		}
		// 不为空的数量等于总数量
		if (count == objects.length) {
			return true;
		}
		return false;
	}

	/**
	 * <pre>
	 * 说   明: 只要其中一个为空，就返回TRUE
	 * @param objects
	 * @return
	 * 创建者: 陈    林(Vickey)
	 * 日   期: 2014-6-25下午4:02:48
	 * </pre>
	 */
	public static boolean isBlankOr(Object... objects) {
		for (Object obj : objects) {
			if (isBlank(obj)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 去掉字符串 中空格
	 * 
	 * @param text
	 * @return text
	 */
	public static String delSpace(String str) {
		str = str.replace(" ", "");
		return str;
	}

	/**
	 * 验证邮箱号输入是否合法
	 * 
	 * @param strEmail
	 * @return
	 */
	public static boolean isEmail(String strEmail) {
		String strPattern = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern p = Pattern.compile(strPattern);
		Matcher m = p.matcher(strEmail);
		return m.matches();
	}

	/**
	 * 验证手机号输入是否合法
	 * 
	 * @param strMobile
	 * @return
	 */
	public static boolean isMobile(String strMobile) {
		Pattern p = Pattern.compile("^[1][3,4,5,8][0-9]{9}$");
		Matcher m = p.matcher(strMobile);
		return m.matches();
	}

	/**
	 * 电话号码验证
	 * 
	 * @param str
	 * @return 验证通过返回true
	 */
	public static boolean isPhone(String str) {
		Pattern p1 = null, p2 = null;
		Matcher m = null;
		boolean b = false;
		p1 = Pattern.compile("^[0][1-9]{2,3}-[0-9]{5,10}$"); // 验证带区号的
		p2 = Pattern.compile("^[1-9]{1}[0-9]{5,8}$"); // 验证没有区号的
		if (str.length() > 9) {
			m = p1.matcher(str);
			b = m.matches();
		} else {
			m = p2.matcher(str);
			b = m.matches();
		}
		return b;
	}

	/**
	 * 转换字符串编码为UTF-8
	 * 
	 * @param txt
	 *            字符串参数
	 * @return 转换后的字符串
	 */
	public static String toUTF8(String txt) {
		String reStr = null;
		try {
			if (txt == null)
				reStr = null;
			else
				reStr = new String(txt.getBytes("ISO8859-1"), "UTF-8");
		} catch (Exception ex) {
			return null;
		}
		return reStr;
	}

	/**
	 * 将日期转换成字符串
	 * 
	 * @param pattern
	 * @param date
	 * @return
	 */
	public static final String getDateStr(String pattern, Date date) {

		if (isBlank(pattern))
			pattern = "yyyy-MM-dd HH:mm:ss";

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String str = sdf.format(date);
		sdf = null;
		return str;
	}

	/**
	 * 获得36位的唯一UUID
	 * 
	 * @return
	 */
	public static String getUUTDString() {
		return UUID.randomUUID().toString();
	}

	@SuppressWarnings("rawtypes")
	public static String listToString(List list, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if (i < list.size() - 1) {
				sb.append(separator);
			}
		}
		return sb.toString();
	}

	public static String getStringRandom(int length) {

		String val = "";
		Random random = new Random();

		// 参数length，表示生成几位随机数
		for (int i = 0; i < length; i++) {
			val += String.valueOf(random.nextInt(10));
		}
		return val;
	}

	/**
	 * 大陆手机号码11位数，匹配格式：前三位固定格式+后8位任意数 此方法中前三位格式有： 13+任意数 15+除4的任意数 18+除1和4的任意数
	 * 17+除9的任意数 147
	 */
	public static boolean isMobileNO(String str) {
		String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
		Pattern p = Pattern.compile(regExp);
		Matcher m = p.matcher(str);
		return m.matches();
	}

	public final static String IMAGE_STORE = "d:/peppa/image";

	public static void upload(String base64) {
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			// Base64解码
			byte[] b = decoder.decodeBuffer(base64);
			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {// 调整异常数据
					b[i] += 256;
				}
			}

			String url = "avatar/" + UUID.randomUUID().toString() + ".jpg";

			OutputStream out = new FileOutputStream(IMAGE_STORE + "/" + url);
			out.write(b);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String download(String url) {
		InputStream in = null;
		byte[] data = null;
		// 读取图片字节数组
		try {
			in = new FileInputStream(IMAGE_STORE + "/" + url);
			data = new byte[in.available()];
			in.read(data);
			in.close();

			// 对字节数组Base64编码
			BASE64Encoder encoder = new BASE64Encoder();
			String base64 = encoder.encode(data);// 返回Base64编码过的字节数组字符串
			base64 = base64.replaceAll("\r\n", "");

			System.out.println(base64);
			return base64;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String encode2Utf8(String value) {
		try {
			if (isNotBlank(value)) {
				return URLEncoder.encode(value, "UTF-8");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return "";
	}

	public static String convertBreak2Html(String str) {
		str = str.replaceAll("\\r\\n", "<br>");
		return str;
	}

	public static Integer toGender(String gender) {
		if (!gender.equals("")) {
			if (gender.equals("不限")) {
				return 0;
			} else if (gender.equals("男")) {
				return 1;
			} else if (gender.equals("女")) {
				return 2;
			}
		}

		return 0;
	}

	public static Integer toMarital(String marital) {
		if (!marital.equals("")) {
			if (marital.equals("不限")) {
				return 0;
			} else if (marital.equals("未婚")) {
				return 1;
			} else if (marital.equals("已婚")) {
				return 2;
			}
		}

		return 0;
	}

	public static String toGenderS(Integer gender) {
		if (gender != null) {
			if (gender == 1) {
				return "男";
			} else if (gender == 2) {
				return "女";
			}

		}

		return "不限";
	}

	public static String toMaritalS(Integer marital) {
		if (marital != null) {
			if (marital == 1) {
				return "未婚";
			} else if (marital == 2) {
				return "已婚";
			}

		}

		return "不限";
	}

	public static Map<String, String> sortString(String str) {
		Map<String, String> sortedMap = new TreeMap<String, String>();

		String[] ss = str.split(",");

		for (String s : ss) {
			sortedMap.put(s, "");
		}

		String min = null;
		String max = null;

		StringBuilder sb = new StringBuilder();

		Iterator<String> it = sortedMap.keySet().iterator();
		boolean isFirst = true;
		while (it.hasNext()) {
			String key = it.next();

			if (isFirst) {
				min = key;
			} else {
				sb.append(",");
			}

			sb.append(key);
			max = key;

			isFirst = false;
		}

		Map<String, String> map = new HashMap<String, String>();
		map.put("min", min);
		map.put("max", max);
		map.put("all", sb.toString());

		return map;
	}

	public String formatPrice(String price) {
		if (StringUtil.isNotBlank(price)) {
			try {
				Double d = Double.valueOf(price);
				DecimalFormat df = new DecimalFormat("######0.00");
				return df.format(d);
			} catch (Exception e) {
			}
		}

		return "";
	}

	public static int comparePrice(String price1, String price2) {
		Double d1 = Double.valueOf(price1);
		Double d2 = Double.valueOf(price2);

		return d1.compareTo(d2);
	}

	public static void main(String[] args) {
		String str = "2018-05-02,2018-05-01,2018-05-03";
		Map<String, String> map = sortString(str);

		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static Map stringJsonToMapByLimitOne(String str){
		if(str.charAt(0) == '['){
			return (Map) JSONObject.parseObject(JSONArray.parseArray(str).get(0).toString());
		}
		return JSONObject.parseObject(str);

	}
}
