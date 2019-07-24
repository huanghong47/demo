package cn.huanghong.基础.代理.动态代理.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-23 16:14
 */
public class PlayerPoxy implements InvocationHandler {

    //目标对象
    private Object targetobj;


    //传入目标对象后相应地去创建代理对象（接口）
    public Object newProxyInstance(Object targetobj) {
        this.targetobj = targetobj;

        //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
        //第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        //第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
        //第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
        //根据传入的目标返回一个代理对象
        return Proxy.newProxyInstance(targetobj.getClass().getClassLoader(),targetobj.getClass().getInterfaces(),this);
    }

    //目标对象一旦被调用就会执行以下方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        System.out.println("业务1.....");
        System.out.println("业务2.....");
        obj = method.invoke(targetobj,args);
        System.out.println("业务3.....");
        return obj;
    }
}
