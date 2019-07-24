package cn.huanghong.基础.代理.静态代理.eg1;

/**
 * @program: demo
 * @description: https://www.cnblogs.com/jiyukai/p/6958744.html
 * @author: huanghong
 * @date: 2019-07-23 15:34
 */
public class PlayerPoxy implements IPlayer,IPlayer2 {

    private PlayerImpl player = new PlayerImpl();
    private PlayImpl2 playImpl2 = new PlayImpl2();
    //代理可以理解为经纪人(PlayerPoxy)，目标对象理解为球员(player)。球员只需要负责打球训练，和球队谈合同，和赞助商谈拍广告，都交给经纪人处理

    @Override
    public void eat() {
        System.out.println("谈合同，，，");
        player.eat();
        System.out.println("拍广告，，，，");
    }

    @Override
    public void play() {
        playImpl2.play();
    }
}
