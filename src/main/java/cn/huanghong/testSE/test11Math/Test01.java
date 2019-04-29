package cn.huanghong.testSE.test11Math;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-08 13:35
 */
public class Test01 {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        System.out.println(Math.floor(a/b));
        System.out.println(a%b);
        System.out.println(a%b>0?Math.floor(a/b)+1:Math.floor(a/b));
    }
}
