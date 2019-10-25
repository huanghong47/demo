package cn.huanghong.testSE.test13JSON;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-10-17 18:46
 */
public class Test04 {
    public static void main(String[] args) {
        List<String[]>strs = new ArrayList<>();
        String[] str1 = new String[]{"3","das"};
        String[] str2 = new String[]{"gf","fdsf","dsada"};
        strs.add(str1);
        strs.add(str2);
        System.out.println(JSON.toJSONString(strs));
    }
}
