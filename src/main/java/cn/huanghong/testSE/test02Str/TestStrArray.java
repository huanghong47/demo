package cn.huanghong.testSE.test02Str;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-24 15:37
 */
public class TestStrArray {
    public static void main(String[] args) {
        String str = "[1,2,3]";
        String[] channels = str.substring(1,str.length()-1).split(",");
        for (String channel : channels) {
            System.out.println(channel);
        }
    }
}
