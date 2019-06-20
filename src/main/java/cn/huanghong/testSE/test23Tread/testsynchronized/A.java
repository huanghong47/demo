package cn.huanghong.testSE.test23Tread.testsynchronized;

/**
 * @program: demo
 * @description: 主方法
 * @author: huanghong
 * @date: 2019-06-19 16:56
 */
public class A {
    public static void main(String[] args) {
        //单线程场景：会正确地输出1，"b.addnums(2)"不会输出2,因为要等待“b.addnums(1)”执行完。
        // 这种写法的优点是数据同步，不会出现脏数据
        // 缺点是如果“b.addnums(1)”由于某种未知情况卡住了，当前的方法执行就会很慢甚至直接挂掉
        B b = new B();
//        System.out.println(B.nums);
//        b.addnums(1);
//        b.addnums(2);
//        System.out.println(B.nums);

        //多线程场景：
        //1.第22和38行的打印语句打出来是null,为什么？因为当前主线程不会等待两个新线程的执行结果
        //2.最终执行的结果，出现了多种情况，这就是线程不安全的现象，有时候输出1，有时候输出2，有时候同时输出1和2
//        System.out.println(B.nums);
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable1开启，当前线程名："+Thread.currentThread());
                b.addnums(1);
            }
        };
        new Thread(runnable1).start();

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable2开启，当前线程名："+Thread.currentThread());
                b.addnums(2);
            }
        };
        new Thread(runnable2).start();
//        System.out.println(B.nums);
    }
}
