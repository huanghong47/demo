package cn.huanghong.testSE.test20Map;

import cn.huanghong.testSE.test09Date.ParamUtil;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-05 10:52
 */
public class Test01 {
    public static void main(String[] args) {
//        Map<String,String> map = null;
//        if(map.isEmpty()){
//            System.out.println("1111111111");
//        }

//        Map<String,String> map = null;
//        String year = (String)map.get("year");
//        if(ParamUtil.isBlank(year)){
//            System.out.println("1111111111");
//        }

        Map<String,Object> map = new HashMap<>();
        map.put("a",1);
        String a = (String)map.get("a");
        System.out.println(a);
    }
}
