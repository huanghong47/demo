package cn.huanghong.testSE.test26Byte;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Test01 {

    public static void main(String[] args) throws UnsupportedEncodingException {
//        byte[] data = parseHexStr2Byte("fe016401006456dbff");
//
//        BASE64Encoder encoder = new BASE64Encoder();
//        System.out.println(encoder.encode(data));
//
//
//        byte[] data2 = parseHexStr2Byte("FE016F42000200014D020000000819050814580000000000000000000000000000000000000000014D0100000008190508150000000000000000000000000000000000000000008573FF");
//        System.out.println(data2);
//        BASE64Encoder encoder2 = new BASE64Encoder();
//        System.out.println(encoder2.encode(data2));
        byte[] data = parseHexStr2Byte("48656c6c6f206920616d206d717474");
        System.out.println(new String(data,"UTF-8"));
    }

    /**
     * byte[]转十六进制
     * @param bytes
     * @return
     */
    public static String bytesTohex(byte[] bytes) {
        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            boolean flag = false;
            if (b < 0) flag = true;
            int absB = Math.abs(b);
            if (flag) absB = absB | 0x80;
            System.out.println(absB & 0xFF);
            String tmp = Integer.toHexString(absB & 0xFF);
            if (tmp.length() == 1) { //转化的十六进制不足两位，需要补0
                hex.append("0");
            }
            hex.append(tmp.toLowerCase());
        }
        return hex.toString();
    }

    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1){
            return null;
        }
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }

    public static String getBytemsg(String value) throws UnsupportedEncodingException {
        //对原始数据进行转换
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
        return stringBuffer.toString();
    }
}
