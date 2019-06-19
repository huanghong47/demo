package cn.huanghong.testSE.test02Str;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-02 18:14
 */
public class Test03 {
    public static void main(String[] args) {
        String value = "fe016401006456dbff";
        List<String> values = new ArrayList<>();
        for(int i = 0;i<value.length();i=i+2){
            String s = value.substring(i,i+2);
            values.add(s);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String s : values) {
            stringBuffer.append("0x");
            stringBuffer.append(s);
            stringBuffer.append(",");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        System.out.println(stringBuffer.toString());
    }
}
