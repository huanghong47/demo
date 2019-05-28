package cn.huanghong.testSE.test24StaticFinal;

import java.util.Date;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-27 10:09
 */
public class Test01 {
    private static final Date time;
    static{
        time = new Date();
    }
    private static final Integer i = 2;
    private static final int j = 3;

    public static Date getTime() {
        return time;
    }

    public static Integer getI() {
        return i;
    }

    public static int getJ() {
        return j;
    }

    public static void change(){


    }
}
