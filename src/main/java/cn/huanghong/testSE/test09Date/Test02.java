package cn.huanghong.testSE.test09Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-09-10 10:54
 */
public class Test02 {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        c.setTime(DateTimeUtil.string2Date("2020-02-29",DateTimeUtil.DATETIME_FORMAT_03));
//        c.add(Calendar.YEAR, -1);
//        Date y = c.getTime();
//        System.out.println(DateTimeUtil.date2String(y,DateTimeUtil.DATETIME_FORMAT_03));
        Date d1 = DateTimeUtil.string2Date("2019-06-01","yyyy-MM");

        Date d2 = DateTimeUtil.string2Date("2019-08-01","yyyy-MM");

        Calendar dd = Calendar.getInstance();//定义日期实例

        dd.setTime(d1);//设置日期起始时间

        while (dd.getTime().before(d2)) {//判断是否到结束日期
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
            String str = sdf.format(dd.getTime());
            System.out.println(str);
            dd.add(Calendar.MONTH, 1);//进行当前日期月份加1
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String str = sdf.format(dd.getTime());
        System.out.println(str);
        dd.add(Calendar.MONTH, 1);//进行当前日期月份加1

    }
}
