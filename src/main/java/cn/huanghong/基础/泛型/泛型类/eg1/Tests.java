package cn.huanghong.基础.泛型.泛型类.eg1;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-24 15:43
 */
public class Tests {
    public static void main(String[] args) {
        ClassT<Integer> clazz1 = new ClassT<Integer>();
        clazz1.setName(10);
        System.out.println(clazz1.getName());

        ClassT<String> clazz2 = new ClassT<>();
        clazz2.setName("asda");
        System.out.println(clazz2.getName());

        //编译后泛型会被抹去，仍然是同一个字节码
        Class clazz3 = clazz1.getClass();
        Class clazz4 = clazz2.getClass();
        System.out.println(clazz3);
        System.out.println(clazz4);
        System.out.println(clazz3.equals(clazz4));
    }
}
