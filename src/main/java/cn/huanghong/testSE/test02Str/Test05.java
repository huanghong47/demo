package cn.huanghong.testSE.test02Str;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-06 16:31
 */
public class Test05 {
    public static void main(String[] args) {
        String s = "1,2,3,4,5";
        String [] strings = s.split(",");
        System.out.println(strings[strings.length-1]);
    }
}
