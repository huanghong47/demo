package cn.huanghong.testSE.test13JSON;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-23 11:10
 */
public class Test01 {
    public static void main(String[] args) {
        String str = "{\n" +
                "\t\t\"deviceType\": \"CustomCategory\",\n" +
                "\t\t\"iotId\": \"RsGV42WTjnXtrY7pRbrp000100\",\n" +
                "\t\t\"productKey\": \"a1vUq47ljRu\",\n" +
                "\t\t\"gmtCreate\": 1555932470897,\n" +
                "\t\t\"deviceName\": \"mytestdevice01\",\n" +
                "\t\t\"items\": {\n" +
                "\t\t\t\"LightVolt\": {\n" +
                "\t\t\t\t\"value\": 0.6300831858939708,\n" +
                "\t\t\t\t\"time\": 1555932470909\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t}";
        JSONObject data = JSON.parseObject(str);
        System.out.println(data.toJSONString());
        JSONObject itemdata = data.getJSONObject("items");
        System.out.println(itemdata.toJSONString());
        String l = itemdata.toJSONString();
        String vt = l.substring(l.indexOf("time")-2,l.length()-1);
        System.out.println(vt);
    }
}
