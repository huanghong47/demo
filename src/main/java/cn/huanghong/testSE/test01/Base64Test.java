package cn.huanghong.testSE.test01;

import org.apache.commons.codec.binary.Base64;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @program: demo
 * @description: base64解密加密
 * @author: huanghong
 * @date: 2019-01-11 08:53
 */
public class Base64Test {

    public static void main(String[] args) {

        String baseStr = "编码测试";
        byte[] baseByte = baseStr.getBytes(StandardCharsets.UTF_8);
        String base64Str = Base64.encodeBase64String(baseByte);
        String base64Str2 = Base64.encodeBase64URLSafeString(baseByte);
        System.out.println("未编码的字节"+Arrays.toString(baseByte));
        System.out.println("encodeBase64String方法:"+base64Str);
        System.out.println("encodeBase64URLSafeString方法:"+base64Str2);

        //解码---------------------------------------------------------------
        byte[] baseByte1 = Base64.decodeBase64(base64Str);
        byte[] baseByte2 = Base64.decodeBase64(base64Str2);
        System.out.println("encodeBase64String方法加密后解码:"+Arrays.toString(baseByte1));
        System.out.println("encodeBase64URLSafeString方法加密后解码:"+Arrays.toString(baseByte2));
    }
}
