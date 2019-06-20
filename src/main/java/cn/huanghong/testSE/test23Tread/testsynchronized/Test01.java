package cn.huanghong.testSE.test23Tread.testsynchronized;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: demo
 * @description: for循环内部和外部使用锁的区别
 * @author: huanghong
 * @date: 2019-06-20 13:35
 */
public class Test01 {

    /**
     * 业务要求：map的大小达到30000封顶，并且value不重复，value值只能是1-30000。要求完成这个业务的速度越快越好
     * 测试结果
     * ConcurrentHashMap类型：
     * 1单线程：耗时7381ms左右， size=3000,value不重复
     * 2多线程（不加锁）：线程越多越快，，但是size>=3000,value有重复
     * 3多线程（加锁,加在方法上）：耗时和单线程差不多，甚至比单线程慢，这种加在方法上的做法，唯一的优点就是不影响主线程执行下一步代码（这是废话）
     *                         缺点就是平白无故增加了开销，一个线程执行完，业务已经结束了，另外几个线程又重复这个业务，虽然不影响业务结果，但还是增加了开销
     * 4多线程（加锁，加在代码块）
     */
    static ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                test();
            }
        };
        new Thread(runnable1).start();

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                test();
            }
        };
        new Thread(runnable2).start();

        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                test();
            }
        };
        new Thread(runnable3).start();

//        test();

        try {
            System.out.println("开始睡眠");
            Thread.sleep(10000);
            System.out.println("睡眠结束");
            Map<Integer,Integer>map2 = new HashMap<>();
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                int key = entry.getKey();
                int value = entry.getValue();
                if(map2.containsKey(value)){
                    System.out.println("出现重复记录");
                }else{
                    map2.put(value,1);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  static void test(){

        //假设要求map的size快速地达到30000
        long time1 = System.currentTimeMillis();
        System.out.println("开始赋值---"+time1);
        for (int i=1;i<=200000;i++) {
            if(map.size()>=30000){
                break;
            }
            double d = Math.random();
            int r = (int)(d*100000);
            while(map.containsKey(r)){
                d = Math.random();
                r = (int)(d*100000);
            }
            synchronized (Test01.class){
                if(map.containsValue(i)){
                    continue;
                }
                map.put(r,i);
            }
        }
        long time2 = System.currentTimeMillis();
//        System.out.println("结束赋值---"+time2);
        System.out.println("耗时:"+(time2-time1)+"ms");
        System.out.println("mapsize:"+map.size());

        }

}
