package cn.huanghong.testSE.test07Base64;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;

import java.nio.charset.StandardCharsets;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-03-23 19:54
 */
public class Test01 {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userName","黄洪维修人");
        jsonObject.put("userId",1);

        String strjson = jsonObject.toJSONString();
        System.out.println(strjson);
        String payload = Base64.encodeBase64URLSafeString(strjson.getBytes(StandardCharsets.UTF_8));
        String payload2 = Base64.encodeBase64String(strjson.getBytes(StandardCharsets.UTF_8));
        String decpayload = new String(Base64.decodeBase64(payload),StandardCharsets.UTF_8);
        String decpayload2 = new String(Base64.decodeBase64(payload2),StandardCharsets.UTF_8);

        System.out.println(payload);
        System.out.println(payload2);

        System.out.println(decpayload);
        System.out.println(decpayload2);
    }
}
