package cn.huanghong.testSE.test14List;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-10-18 16:55
 */
public class Test05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(){
            {
                add("1");
                add("2");
                add("3");
            }
        };

        System.out.println(JSON.toJSONString(list));

        list.remove(list.get(0));
        list.add("4");
        System.out.println(JSON.toJSONString(list));
    }
}
