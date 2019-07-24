package cn.huanghong.基础.反射.eg1;

import java.lang.reflect.Method;

/**
 * @program: demo
 * @description: 调用类的成员方法
 * @author: huanghong
 * @date: 2019-07-22 16:53
 */
public class Methods {
    public static void main(String[] args) throws Exception {
        //1获取class对象
        Class clazz = Class.forName("cn.huanghong.基础.反射.eg1.Student");

        //2获取所有公共成员方法
//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }
        //3获取所有方法
//        Method[] methods2 = clazz.getDeclaredMethods();
//        for (Method method : methods2) {
//            System.out.println(method);
//        }

        //4调用方法
        Method method = clazz.getMethod("testmethod1");
        Method method2 = clazz.getDeclaredMethod("testmethod2",String.class);
        Method method3 = clazz.getDeclaredMethod("testmethod3",String.class);
        Object obj = clazz.getConstructor().newInstance();
        method.invoke(obj);
        method2.invoke(obj,"ccc");

        Object obj2 = method3.invoke(obj,"aaaa");
        System.out.println(obj2);
    }
}
