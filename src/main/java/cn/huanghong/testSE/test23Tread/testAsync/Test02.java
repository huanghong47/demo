package cn.huanghong.testSE.test23Tread.testAsync;

import org.springframework.scheduling.annotation.Async;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-26 09:42
 */

public class Test02 {

    public synchronized void add(){
        System.out.println("线程进来并开始睡眠："+Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
            System.out.println("线程睡眠结束："+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
