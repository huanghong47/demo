package cn.huanghong.testSE.test05equal;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-03-26 09:22
 */
public class TestLong {
    public static void main(String[] args) {
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        boolean has1 = false;
        for (Long id : ids) {
            if(id.longValue() == 3){
                has1=true;
            }
        }
        System.out.println(has1);
    }
}
