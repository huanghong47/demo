package cn.huanghong.testSE.test18Lambda;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-29 16:10
 */
public class Test02 {
    public static void main(String[] args) {
//        A a = new A() {
//            @Override
//            public void test01() {
//                System.out.println("cccccccccc");
//            }
//        };
//        a.test01();

        test02(() -> System.out.println("aaaaaaaaaaaaa"));
    }

    public static void test02(C c){
        c.testc();
        System.out.println("mmmmmmmmmmmmmmmm");
    }

}
