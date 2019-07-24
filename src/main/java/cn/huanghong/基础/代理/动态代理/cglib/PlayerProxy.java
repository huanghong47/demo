package cn.huanghong.基础.代理.动态代理.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-24 14:55
 */
public class PlayerProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("1111111111111");
        Object object = methodProxy.invokeSuper(o,objects);
        System.out.println("2222222222222");
        return object;
    }
}
