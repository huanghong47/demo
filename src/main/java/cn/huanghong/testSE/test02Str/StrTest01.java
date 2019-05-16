package cn.huanghong.testSE.test02Str;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-16 16:37
 */
public class StrTest01 {
    public static void main(String[] args) {
        String str = "localhost:8081/emsog/default-imgs/2019-04-30/下载.png";
        System.out.println(str.lastIndexOf("."));
        String filetype = str.substring(str.lastIndexOf("."));
        System.out.println(filetype);

        String filetype2 = str.split(".")[1];
        System.out.println(filetype2);
    }
}
