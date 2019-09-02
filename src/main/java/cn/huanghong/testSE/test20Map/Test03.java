package cn.huanghong.testSE.test20Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-08-26 09:43
 */
public class Test03 {
    public static void main(String[] args) {
//        Map<Integer,Test02>map = new HashMap<>();
//        map.put(1,null);
//        map.put(2,null);
//        map.put(3,null);
//        map.put(4,null);
//
//        for (Integer integer : map.keySet()) {
//            System.out.println(integer);
//        }
//        String time = System.currentTimeMillis()+"";
//        String times = time.substring(0,time.length()-3);
//        System.out.println(times);

//        String a = ",1,,";
//        String[]arr = a.split(",");
//        System.out.println(arr.length);

        StringBuffer sb = new StringBuffer();
        sb.append(",1");
        sb.append(",");
        System.out.println(sb.lastIndexOf(","));
        System.out.println(sb.length()-1);
        if(sb.length() > 0 && (sb.lastIndexOf(","))==(sb.length()-1)){
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
        }
    }
}
