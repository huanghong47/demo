package cn.huanghong.基础.代理.动态代理.cglib;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-24 14:53
 */
public class Player {

    public Player() {
        System.out.println("Player构造");
    }

    public void play(){
        eating();
        System.out.println("playing...");
    }

    final void eating(){
        System.out.println("eating...");
    }
}
