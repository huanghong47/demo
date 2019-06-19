package cn.huanghong.testSE.test23Tread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @program: demo
 * @description:
 * @author: huanghong
 * @date: 2019-05-28 11:06
 */
public class TestCount {
//    public static void main(String[] args) throws InterruptedException {
//        long start = System.currentTimeMillis();
//        System.out.println(Thread.currentThread().getName()+"----start---"+start+"ms");
//        Count.count();
//        Count.count();
//        Count.count();
//        Count.count();
//        long end = System.currentTimeMillis();
//        System.out.println(Thread.currentThread().getName()+"----end---"+end+"ms");
//        System.out.println("耗时：----------"+(end-start));
//    }

//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        System.out.println(Thread.currentThread().getName()+"----start---"+start+"ms");
//        new Count().start();
//        new Count().start();
//        new Count().start();
//        new Count().start();
//        long end = System.currentTimeMillis();
//        System.out.println(Thread.currentThread().getName()+"----end---"+end+"ms");
//        System.out.println("耗时：----------"+(end-start));
//
//    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new TestCount().exec();
    }

    public void exec() throws ExecutionException, InterruptedException {
        List<FutureTask<Double>> futureTasks = new ArrayList<FutureTask<Double>>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long start = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"----start---"+start+"ms");
        Callable<Double>callable = new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                return Count.count();
            }
        };

        for(int i = 0;i<4;i++){
            FutureTask<Double> futureTask = new FutureTask<Double>(callable);
            futureTasks.add(futureTask);
            //提交异步任务到线程池，让线程池管理任务 特爽把。
            //由于是异步并行任务，所以这里并不会阻塞
            executorService.submit(futureTask);
        }
        for (FutureTask<Double> futureTask : futureTasks) {
            System.out.println(futureTask.get());
        }

        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"----end---"+end+"ms");
        System.out.println("耗时：----------"+(end-start));

    }

}
