package cn.huanghong.基础.代理.静态代理.eg1;

/**
 * @program: demo
 * @description: 实现类
 * @author: huanghong
 * @date: 2019-07-23 15:34
 */
public class PlayerImpl implements IPlayer {
    @Override
    public void eat() {
        System.out.println("比赛中...");
    }
}
