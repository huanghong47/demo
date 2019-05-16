package cn.huanghong.testSE.test02Str;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-16 15:29
 */
public class StringBufferTests {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("aa");
        sb.append(",");
        sb.append("bb");
        sb.append(",");
        sb.append("bb");
        sb.append(",");
        System.out.println(sb.length());
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
