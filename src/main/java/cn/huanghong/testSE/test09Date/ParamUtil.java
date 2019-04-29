package cn.huanghong.testSE.test09Date;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 后端参数验证工具类
 * @author Liulin.Sun
 * @since 2017-4-5 14:33:29
 *
 */
public class ParamUtil {


	/**
	 * String转成list（分割by“,”）
	 * @param param
	 * @return
	 */
	public static List<String> stringSplitList(String param){
		return stringSplitList(param, ",");
	}

	/**
	 * String转成list<Long></>（分割by“,”）
	 * @param param
	 * @return
	 */
	public static List<Long> stringSplitListLong(String param){
		if(ParamUtil.isBlank(param)){
			return new ArrayList<>();
		}
		List<String>listString = stringSplitList(param, ",");
		List<Long>listLong = new ArrayList<>();
		for (String s : listString) {
			listLong.add(ParamUtil.string2Long(s));
		}
		return listLong;
	}

	/**
	 * String转成list
	 * @param param
	 * @param reg
	 * @return
	 */
	public static List<String> stringSplitList(String param, String reg){
		if(isBlank(param) || isBlank(reg)){
			return null;
		}
		return new ArrayList<>(Arrays.asList(param.split(reg)));
	}

	/**
	 * String强转Int
	 * @param param
	 * @return
	 */
	public static int string2Int(Object param){
		if(isBlank(param))
			return 0;
		try {
			return Integer.parseInt(param.toString());
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * String强转Long
	 * @param param
	 * @return
	 */
	public static long string2Long(Object param){
		if (isBlank(param))
			return 0;
		try {
			return Long.parseLong(param.toString());
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * Array转List
	 * @param array
	 * @return
	 */
	public static <T> List<T> array2List(T[] array){
		return Arrays.asList(array);
	}

	/**
	 * List转Array
	 * @param list
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T[] list2Array(List<T> list){
		if(isNotBlank(list)){
			T[] desc = (T[]) new Object[list.size()];
			return list.toArray(desc);
		}else{
			return null;
		}
	}

	/**
	 * Set转Array
	 * @param oSet
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T[] set2Array(Set<T> oSet) {
		if(isNotBlank(oSet)){
			T[] desc = (T[]) new Object[oSet.size()];
			return oSet.toArray(desc);
		}else{
			return null;
		}
	}

	/**
	 * 去除html标签
	 * @param htmlStr
	 * @return
	 */
	public static String delHTMLTag(String htmlStr){
		String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式
		String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //定义style的正则表达式
		String regEx_html="<[^>]+>"; //定义HTML标签的正则表达式

		Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE);
		Matcher m_script=p_script.matcher(htmlStr);
		htmlStr=m_script.replaceAll(""); //过滤script标签

		Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE);
		Matcher m_style=p_style.matcher(htmlStr);
		htmlStr=m_style.replaceAll(""); //过滤style标签

		Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE);
		Matcher m_html=p_html.matcher(htmlStr);
		htmlStr=m_html.replaceAll(""); //过滤html标签

		return htmlStr.trim(); //返回文本字符串
	}

	/**
	 * 正则匹配
	 * @param param
	 * @param reg
	 * @return
	 */
	public static boolean regMathch(String param, String reg){
		if (isBlank(param)) {
			return false;
		}
		if (isBlank(reg)) {
			return true;
		}
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(param);
		return matcher.matches();
	}

	/**
	 * 生成36位UUID（带“-”）
	 * @return
	 */
	public static String generateUUID_36(){
		return UUID.randomUUID().toString();
	}

	/**
	 * 生成32位UUID（不带“-”）
	 * @return
	 */
	public static String generateUUID_32(){
		return UUID.randomUUID().toString().replace("-", "");
	}

	/**
	 * 验证是否为空参
	 * @param longObj
	 * @return
	 */
	public static boolean isBlank(Long longObj){
		if(null == longObj || 0 == longObj){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 验证是否为空参
	 * @param StringObj
	 * @return
	 */
	public static boolean isBlank(Object StringObj){
		if(null == StringObj || "".equals(StringObj.toString().trim())){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 验证结果集是否含有有效内容
	 * @param listResult
	 * @return
	 */
	public static boolean isNotBlank(List<? extends Object> listResult){
		if(null != listResult && !listResult.isEmpty()){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 验证结果集是否含有有效内容
	 * @param mapResult
	 * @return
	 */
	public static boolean isNotBlank(Map<? extends Object, ? extends Object> mapResult){
		if(null != mapResult && !mapResult.isEmpty()){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 验证结果集是否含有有效内容
	 * @param oSet
	 * @return
	 */
	public static boolean isNotBlank(Set<? extends Object> oSet){
		if(null != oSet && !oSet.isEmpty()){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 验证非空参
	 * @param StringObj
	 * @return
	 */
	public static boolean isNotBlank(Object StringObj){
		if(!isBlank(StringObj)){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 数字验证
	 *
	 * @param str
	 * @return
	 */
	public static boolean isDigital(String str) {
		return str == null || "".equals(str) ? false : str.matches("^[0-9]*$");
	}
//
//	/**
//	 * map内容累加
//	 * @return
//	 */
//	public static <T> Map<T, String> putMapAppend(Map<T, String> map, T key, String appendValue){
//		if (null == map)
//			map = new HashedMap();
//		if (map.isEmpty() || isBlank(map.get(key)))
//			map.put(key, appendValue);
//		else{
//			map.put(key, map.get(key) + appendValue);
//		}
//		return map;
//	}



}
