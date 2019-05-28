package cn.huanghong.testSE.test23Tread;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-28 09:33
 */
public class MyRunable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-----------MyRunable---start----------run");
        try {
            System.out.println(Thread.currentThread().getName()+"-----MyRunable---start---sleep");
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName()+"-----MyRunable---end---sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"-----------MyRunable---end----------run");
    }
}
