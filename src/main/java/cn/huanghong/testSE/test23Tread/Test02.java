package cn.huanghong.testSE.test23Tread;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-28 08:47
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"------start");

        //创建线程的方式1：继承Thread
        MyThread myThread = new MyThread();
        myThread.test();//该方法时由main执行
        myThread.start();//新线程执行，并且立即返回，当前线程main继续执行，而新线程虽然正在睡眠，那也是它自己的事，不影响main自己继续往下执行代码

        //匿名内部类
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"内部匿名类------start");
            }
        }.start();

        //lambda表达式语法
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+"Thread---lambda表达式----start");
            try {
                System.out.println("lambda表达式----sleep---start");
                Thread.sleep(10000);
                System.out.println("lambda表达式----sleep---end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


        //创建线程的方式2：实现Runnable接口
        MyRunable myRunable = new MyRunable();
//        myRunable.run();禁止直接调用run方法，这样写的话是main线程在调用，而不是新线程在调用
        new Thread(myRunable).start();

        Runnable myRunable1 = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"Runnable---匿名内部类----start");
            }
        };
        new Thread(myRunable1).start();
        System.out.println(Thread.currentThread().getName()+"------end");


    }
}
