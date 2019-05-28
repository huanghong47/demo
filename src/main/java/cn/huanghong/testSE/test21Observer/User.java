package cn.huanghong.testSE.test21Observer;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-23 10:58
 */
public class User implements Observer{

    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        this.message = msg;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }


}
