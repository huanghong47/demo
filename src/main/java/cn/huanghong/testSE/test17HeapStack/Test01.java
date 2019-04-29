package cn.huanghong.testSE.test17HeapStack;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-29 10:29
 */
public class Test01 {
    public static final String message = "taobao";

    public static void main(String[] args) {
//        String a = "tao"+"bao";
//        String b = "tao";
//        String c = "bao";
//        System.out.println(a == message);
//        System.out.println((b+c) == message);
        String a = "abc"+"edf";
        String b = "abc";
        String c = "edf";
        String d = "abcedf";

        System.out.println(a==d);
        System.out.println((b+c)==d);
    }

}
