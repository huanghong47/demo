package cn.huanghong.基础.IO流.eg1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: demo
 * @description: FileOutputStram,写入文件
 * @author: huanghong
 * @date: 2019-07-25 11:05
 */
public class WriteFile {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //根据文件路径创建输出流
            fos = new FileOutputStream("C:\\Users\\BJQ\\Desktop\\a.txt");
            String result = "测试输出流1111111111111";
            byte[]array = result.getBytes();
            fos.write(array);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
