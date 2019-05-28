package cn.huanghong.testSE.test14List;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-27 15:28
 */
public class Test02 {
    public static void main(String[] args) {
        A a = new A("a","123");
        A a1 = new A("a1","123");
        A a2 = new A("a2","123");
        A a3 = new A("a3",null);
        A a4 = new A("a3","456");
        List<A>as = new ArrayList<>();
        as.add(a);
        as.add(a1);
        as.add(a2);
        as.add(a3);
        as.add(a4);
        Map<String,List<A>>maps = as.stream().collect(Collectors.groupingBy(A::getPhone));
        for (Map.Entry<String,List<A>>entry : maps.entrySet()) {
            System.out.println(entry.getKey());
            for (A a5 : entry.getValue()) {
                System.out.println(a5.getName());
                System.out.println(a5.getPhone());
            }
            System.out.println("====================");
        }
    }
}
