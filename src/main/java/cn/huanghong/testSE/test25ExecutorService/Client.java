package cn.huanghong.testSE.test25ExecutorService;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-28 10:45
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {

        boolean r = task2();//大约10秒完成

        if(r) {
            task3();
        }

        System.out.println("------------main end-----------");
    }

    static boolean task2() throws InterruptedException {

        ExecutorDemo e = new ExecutorDemo();

        e.asynTask();

        System.out.println("------------task2 end-----------");

        return true;
    }


    static void task3() throws InterruptedException {
        int j = 0;
        while(true) {
            if(j++ > 10000) {
                break;
            }
        }

        System.out.println("------------task3 end-----------");
    }
}
