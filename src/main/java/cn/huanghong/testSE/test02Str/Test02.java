package cn.huanghong.testSE.test02Str;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-22 19:16
 */
public class Test02 {
    public static void main(String[] args) {
        String str = "/sys/{productKey}/{deviceName}/thing/event/{tsl.event.identifier}/post";
        System.out.println(str.contains("property"));
    }
}
