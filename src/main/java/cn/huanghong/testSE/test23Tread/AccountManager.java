package cn.huanghong.testSE.test23Tread;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-24 11:21
 */
public class AccountManager implements Runnable {


    private Account account;    //需要被取款的账户
    private double money;    //需要取走金额

    public AccountManager(Account account, double money) {
        super();
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        //判断账户中的余额是否足够
        if (account.getCash() >= money) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //减少账户的余额
            account.setCash(account.getCash() - money);
            System.out.println(Thread.currentThread() + "取款成功,余额:" + account.getCash());
        } else {
            System.out.println(Thread.currentThread() + "取款失败，余额不足!");
        }

    }

}