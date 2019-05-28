package cn.huanghong.testSE.test23Tread;

/**
 * @program: demo
 * @description: 参考资料：https://blog.csdn.net/qq_35907502/article/details/81434517
 * @author: huanghong
 * @date: 2019-05-24 11:19
 */
public class Account {
    private String num;
    private double cash;

    public Account(String num, double cash) {
        this.num = num;
        this.cash = cash;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
