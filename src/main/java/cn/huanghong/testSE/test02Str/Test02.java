package cn.huanghong.testSE.test02Str;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-22 19:16
 */
public class Test02 {
    public static String a;
    public static void main(String[] args) {
//        String str = "/sys/{productKey}/{deviceName}/thing/event/{tsl.event.identifier}/post";
//        System.out.println(str.contains("property"));
//
//        String str = "http://boccaccio.3322.org:7381/emsog/base64img/2019-04-26/66a0840da27d4389a403f7499f9f6db2.jpg";
//        String str2 = str.substring(str.lastIndexOf("http://boccaccio.3322.org:7381/emsog/"));
//        System.out.println(str2);

        packparam();
        System.out.println(a);
    }

    public static void packparam(){
        Test02.a = "1";
    }
}
