package cn.huanghong.基础.反射.eg1;

import java.lang.reflect.Field;

/**
 * @program: demo
 * @description: 获取类的成员变量
 * @author: huanghong
 * @date: 2019-07-22 16:38
 */
public class Fields {
    public static void main(String[] args) throws Exception{
        //1加载class对象
        Class clazz = Class.forName("cn.huanghong.基础.反射.eg1.Student");

        //2获取所有公有字段
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        //2获取所有字段
        Field[] fields2 = clazz.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println(field);
        }

        //3设置字段值
        Field f = clazz.getDeclaredField("name");
        f.setAccessible(true);
        Object obj = clazz.getConstructor().newInstance();
        f.set(obj,"黄洪");
        Student student = (Student)obj;
        System.out.println(student.getName());
    }
}
