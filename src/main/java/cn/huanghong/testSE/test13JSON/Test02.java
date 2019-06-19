package cn.huanghong.testSE.test13JSON;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-13 10:25
 */
public class Test02 {
    public static void main(String[] args) {
        String str = "{\"serviceHistory\":[{\"value\":\"发生过是否\",\"searchSelectList\":[\"111--设备类型006--(111)\",\"2019032311--设备类型004--(2019032311)\"],\"uploadImg\":\"\"}]}";
        JSONObject data = JSON.parseObject(str);
        JSONArray array = data.getJSONArray("serviceHistory");
        for (int i = 0; i < array.size(); i++) {
            JSONObject data2 = array.getJSONObject(i);
            JSONArray array2 = data2.getJSONArray("searchSelectList");
            for (int j = 0; j < array2.size(); j++) {
                String a = array2.getString(i);
                String b = a.substring(a.indexOf("(")+1,a.indexOf(")"));
                System.out.println(b);
            }
        }
    }
}
