package cn.huanghong.testSE.test02Str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-14 14:22
 */
public class StringTest {
    public static void main1(String[] args) {
        String a = "{}";
        String b = a.substring(1,a.lastIndexOf("}"));
//        if("".equals(b)){
//            System.out.println("1111111");
//        }
        System.out.println(b);
    }



    /**
     * String转成list
     * @param param
     * @param reg
     * @return
     */
    public static List<String> stringSplitList(String param, String reg){
        if("".equals(param) || null == param){
            return null;
        }
//        if(isBlank(reg)){
//
//        }
        return new ArrayList<>(Arrays.asList(param.split(reg)));
    }


    public static void main(String[] args) {
//        List<String> strs = stringSplitList("a",",");
//        System.out.println(strs.get(0));
        String name = "黄洪";
        if(name.contains("皇")){
            System.out.println("============");
        }
    }
}
