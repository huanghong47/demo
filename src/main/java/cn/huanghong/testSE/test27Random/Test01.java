package cn.huanghong.testSE.test27Random;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-03 10:24
 */
public class Test01 {
    public static void main(String[] args) {
        String[] str = { "故障", "火警"};
        int random = (int) ( Math.random () * 2 );
        System.out.println(str[random]);
    }
}
