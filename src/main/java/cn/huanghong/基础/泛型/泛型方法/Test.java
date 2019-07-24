package cn.huanghong.基础.泛型.泛型方法;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-24 16:37
 */
public class Test {
    public static void main(String[] args) {
        MethodT<String,Integer> methodT = new MethodT<>("ffff",1);

//        methodT.showname("123",4);
//        System.out.println(methodT.showname5(3));
        System.out.println("111111111111111111111111");

        methodT.shownameage(1,4);

    }
}
