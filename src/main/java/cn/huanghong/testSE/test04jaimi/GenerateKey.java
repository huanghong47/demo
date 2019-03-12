package cn.huanghong.testSE.test04jaimi;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.SecureRandom;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-31 17:03
 */
public class GenerateKey {
    static public void main(String args[]) throws Exception {
        String keyFilename = args[0];
        String algorithm = "DES";

        // 生成密匙
        SecureRandom sr = new SecureRandom();
        KeyGenerator kg = KeyGenerator.getInstance(algorithm);
        kg.init(sr);
        SecretKey key = kg.generateKey();

        // 把密匙数据保存到文件
        CodeEncryptUtils.writeFile(keyFilename, key.getEncoded());
    }
}
