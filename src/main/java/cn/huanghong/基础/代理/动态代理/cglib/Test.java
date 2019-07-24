package cn.huanghong.基础.代理.动态代理.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-24 14:58
 */
public class Test {
    public static void main(String[] args) {
        // 代理类class文件存入本地磁盘方便我们反编译查看源码
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(Player.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new PlayerProxy());
        // 创建代理对象
        Player proxy= (Player)enhancer.create();
        // 通过代理对象调用目标方法
        proxy.eating();
        proxy.play();

    }
}
