package cn.huanghong.testSE.test29Set;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-28 10:27
 */
public class Test01 {
    public static void main(String[] args) {
        List<String>uuids = new ArrayList<String>(){
            {
                add("123456");
                add("123456");
                add("123456");
                add("789456");
                add("789456");
            }
        };

        List<String>uuids2 = new ArrayList<String>(){
            {
                add("123456");
                add("123456");
                add("123456");
                add("789456");
                add("78945654");
            }
        };

        Set<String>uuids3 = new HashSet<>();
        uuids3.addAll(uuids);
        uuids3.addAll(uuids2);

        System.out.println(uuids3.size());
        System.out.println(JSON.toJSONString(uuids3));
    }
}

