package cn.huanghong.testSE.test11Math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-10-18 15:53
 */
public class Test04 {
    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal("2");
        BigDecimal v2 = new BigDecimal("");
//        BigDecimal b1 = v1.subtract(v2);
//
//        BigDecimal divide = b1.divide(v2, 4, RoundingMode.HALF_UP);//四舍五入
//        BigDecimal result = divide.multiply(new BigDecimal("100"));
//        System.out.println(result);
//        String a = result.setScale(2,RoundingMode.HALF_UP).toString();
//        System.out.println(a);
        System.out.println(v2.toString());
    }
}
