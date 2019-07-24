package cn.huanghong.基础.代理.静态代理.eg1;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-23 15:40
 */
public class Test {
    public static void main(String[] args) {
        PlayerPoxy playerPoxy = new PlayerPoxy();
        playerPoxy.eat();
        playerPoxy.play();
    }
}
