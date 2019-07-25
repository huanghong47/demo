package cn.huanghong.基础.IO流.eg2;

import java.io.File;
import java.io.IOException;

/**
 * @program: demo
 * @description: File类
 * @author: huanghong
 * @date: 2019-07-25 14:24
 */
public class LearnFileClass {
    public static void main(String[] args) throws IOException {
        //1.绝对路径
//        String path1 = "C:\\Users\\BJQ\\Desktop\\test\\aaaaaaaa.txt";
//        File file1 = new File(path1);
//        try {
//            System.out.println(file1.getParent());
//            System.out.println(file1.getParentFile());
//            if(!file1.getParentFile().exists()){
//                file1.getParentFile().mkdirs();
//            }
//            file1.createNewFile();//如果父目录是不存在的，会报错。所以要做判断
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(file1);
//        System.out.println(file1.getName());

        //2.父绝对路径，子路径
        String parentpath = "C:\\Users\\BJQ\\Desktop\\test2\\test";
        String childpath = "aaaaa.txt";
        File file2 = new File(parentpath);
//        if(!file2.getParentFile().exists()){
////            file2.getParentFile().mkdir();//不建议用mkdir，多级目录不存在的话会报错
//            file2.getParentFile().mkdirs();
//        }
//        try {
//            file2.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        File file3 = new File("","test\\aaa.txt");//如果父目录为空，默认是当前项目文件所处的根目录
//        try {
//            System.out.println(file3.getAbsolutePath());
//            file3.createNewFile();
//            System.out.println(file3);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        File file4 = new File(file2,"file4.txt");
        if(!file4.isDirectory()){
            file2.getParentFile().mkdirs();
        }
        file4.createNewFile();

    }
}
