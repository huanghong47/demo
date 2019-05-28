package cn.huanghong.testSE.test21Observer;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-23 11:01
 */
public class Test {

    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        server.register(userZhang);
        server.register(userLi);
        server.register(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.remove(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");

    }
}
