package cn.huanghong.testSE.test02Str;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-31 08:52
 */
public class StrTest02 {

    public static void main(String[] args) {
        String i = "1";
        i = i.substring(0,i.length()-1)+(Integer.valueOf(i.substring(i.length()-1))+1);
        System.out.println(i);


    }
}
