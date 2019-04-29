package cn.huanghong.testSE.test16MD5;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-28 16:23
 */
public class Test01 {
    public static void main(String[] args) {
        String encodeStr=DigestUtils.md5Hex("admin");

        System.out.println(encodeStr);
        System.out.println(DigestUtils.getMd5Digest());
    }
}
