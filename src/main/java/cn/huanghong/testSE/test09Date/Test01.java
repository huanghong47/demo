package cn.huanghong.testSE.test09Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-04 09:50
 */
public class Test01 {
    public static List<Date> findDates(Date dStart, Date dEnd) {
        Calendar cStart = Calendar.getInstance();
        cStart.setTime(dStart);

        List dateList = new ArrayList();
        //别忘了，把起始日期加上
        dateList.add(dStart);
        // 此日期是否在指定日期之后
        while (dEnd.after(cStart.getTime())) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            cStart.add(Calendar.DAY_OF_MONTH, 1);
            dateList.add(cStart.getTime());
        }
        return dateList;
    }

    public static Integer dateToWeek(String datetime) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Integer[] weekDays = {7, 1, 2, 3, 4, 5, 6};
        Calendar cal = Calendar.getInstance();
        Date date;
        try {
            date = sdf.parse(datetime);
            cal.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        return weekDays[w];
    }

    public static void main(String[] args) {
//        String dStart = "2018-01-03";
//        String dEnd = "2018-03-01";
//        List<Date>list = findDates(DateTimeUtil.string2Date(dStart,DateTimeUtil.DATETIME_FORMAT_03),DateTimeUtil.string2Date(dEnd,DateTimeUtil.DATETIME_FORMAT_03));
//        for (Date date : list) {
//            System.out.println(DateTimeUtil.date2String(date,DateTimeUtil.DATETIME_FORMAT_03));
//        }
        System.out.println(dateToWeek("2019-04-04"));
    }
}
