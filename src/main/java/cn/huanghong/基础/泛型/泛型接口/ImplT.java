package cn.huanghong.基础.泛型.泛型接口;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-24 15:55
 */
public class ImplT<T> implements InterfaceT<T>{

    @Override
    public T gett(T name) {
        System.out.println("aaaaaaaaaaaaa");
        return name;
    }
}
