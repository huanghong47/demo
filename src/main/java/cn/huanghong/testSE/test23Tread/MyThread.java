package cn.huanghong.testSE.test23Tread;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-28 08:49
 */
public class MyThread extends Thread{

    public void test(){
        System.out.println(Thread.currentThread().getName()+"-------MyThread-----test");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--------MyThread---start----------run");
        try {
            System.out.println(Thread.currentThread().getName()+"--MyThread---start---sleep");
            Thread.sleep(10000);
            test();
            System.out.println(Thread.currentThread().getName()+"----MyThread----end---sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"-------MyThread----end----------run");
    }
}
