package cn.huanghong.testSE.test23Tread;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-24 11:16
 */
public class Test01 {
    public static void main(String[] args) {
        //创建账户类，余额10000
        Account a = new Account("0001", 10000);
        //创建Runnable对象,每次取款10000
        AccountManager am = new AccountManager(a, 10000);

        Thread t1 = new Thread(am);
        Thread t2 = new Thread(am);
        //启动两个取钱线程
        t1.start();
        t2.start();
    }
}
