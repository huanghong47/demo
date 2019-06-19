package cn.huanghong.testSE.test25ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-28 10:42
 */
public class ExecutorDemo {
    private ExecutorService executor = Executors.newFixedThreadPool(1);

    public void asynTask() throws InterruptedException {

        executor.submit(new Runnable() {

            @Override
            public void run() {

                try {
                    Thread.sleep(10000);//方便观察结果
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                int sum = 0;
                for(int i = 0; i < 1000; i++) {

                    sum += i;
                }

                System.out.println(sum);
            }
        });

    }
}
