package cn.huanghong.基础.IO流.eg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: demo
 * @description: 复制文件
 * @author: huanghong
 * @date: 2019-07-25 13:22
 */
public class CopyFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:\\Users\\BJQ\\Desktop\\20170105182342227.jpg");
            byte[]array = new byte[fis.available()];
            fis.read(array);
            fos = new FileOutputStream("C:\\Users\\BJQ\\Desktop\\ssss.jpg");
            fos.write(array);
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
