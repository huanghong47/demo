package cn.huanghong.基础.IO流.eg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: demo
 * @description: FileInputStream--文件读取，字节流
 * @author: huanghong
 * @date: 2019-07-25 10:57
 */
public class ReadFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //根据路径读取字节流对象
            fis = new FileInputStream("C:\\Users\\BJQ\\Desktop\\a.txt");
            //估计对象的字节数量
            int size = fis.available();
            //创建数组
            byte[]array = new byte[size];
            //数据读取到数组中
            fis.read(array);
            //数组转字符串，获取文本内容
            String result = new String(array);
            System.out.println(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
