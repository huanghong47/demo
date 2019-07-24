package cn.huanghong.基础.代理.动态代理.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-23 16:23
 */
public class Test {
    public static void main(String[] args) throws Exception {
        PlayerPoxy playerPoxy = new PlayerPoxy();
        IPlayer player = (IPlayer)playerPoxy.newProxyInstance(new PlayerImpl());
        player.eat();

        //将动态生成的代理类输出后查看
        byte[] proxyclass = ProxyGenerator.generateProxyClass("xxxxx",new Class[]{PlayerImpl.class});
        FileOutputStream fileOutputStream = new FileOutputStream("xxxxx.class");
        fileOutputStream.write(proxyclass);
        fileOutputStream.close();
    }

}
