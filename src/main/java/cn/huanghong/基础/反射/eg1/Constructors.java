package cn.huanghong.基础.反射.eg1;

import java.lang.reflect.Constructor;

/**
 * @program: demo
 * @description: 通过反射获取构造方法并使用
 * @author: huanghong
 * @date: 2019-07-22 16:19
 */
public class Constructors {

    public static void main(String[] args) throws Exception {
        //1加载class对象
        Class clazz = Class.forName("cn.huanghong.基础.反射.eg1.Student");

        //2获取所有共有的构造方法
//        Constructor[] constructors = clazz.getConstructors();
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor);
//        }

        //3获取所有的私有的，缺省的，受保护的，公有的构造器
//        Constructor[] constructors2 = clazz.getDeclaredConstructors();
//        for (Constructor constructor : constructors2) {
//            System.out.println(constructor);
//        }

        //4调用构造器并生产对象
        Constructor constructor = clazz.getConstructor(null);
        Object obj = constructor.newInstance();
//        System.out.println(obj);
//
//        Constructor constructor2 = clazz.getDeclaredConstructor(String.class);
//        Object obj2 = constructor2.newInstance("男");
//        Student student = (Student) obj2;
//        System.out.println(((Student) obj2).getName());
    }

}
