package cn.huanghong.testSE.test20Map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-28 14:33
 */
public class Test02 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String>maps = new ConcurrentHashMap<>();
        maps.put(1,"aaaa");
        maps.put(2,"bbbb");
        maps.put(3,"cccc");
        maps.put(4,"dddd");
        for (Map.Entry<Integer,String>entry:maps.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("---------------------");
        maps.remove(2);
        for (Map.Entry<Integer,String>entry:maps.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }



    }
}
