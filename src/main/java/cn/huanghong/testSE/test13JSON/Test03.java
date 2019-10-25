package cn.huanghong.testSE.test13JSON;

import com.alibaba.fastjson.JSONObject;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-09-27 10:55
 */
public class Test03 {
    public static void main(String[] args) {
        JSONObject data = new JSONObject();
        data.put("uuid","1111");
        data.put("type",1);
        System.out.println(data.getString("uuid"));
        System.out.println(data.getString("aaa"));
        System.out.println(data.getInteger("type"));
        System.out.println(data.getInteger("type333"));
    }
}
