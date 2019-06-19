package cn.huanghong.testSE.test23Tread;

/**
 * @program: demo
 * @description: 计数
 * @author: huanghong
 * @date: 2019-05-28 11:04
 */
public class Count extends Thread{

    @Override
    public void run() {
        try {
            count();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static double count() throws InterruptedException {
        Thread.sleep(1000);//睡眠1秒
        double d = Math.random();
//        System.out.println(d);
        return d;
    }
}
