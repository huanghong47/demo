package cn.huanghong.testSE.test23Tread.testdeadload;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-20 08:50
 */
public class DeadLock {

    public static void main(String[] args) {
        Thread t1 = new Thread(new DeadLockTest(true));
        Thread t2 = new Thread(new DeadLockTest(false));
        t1.start();
        t2.start();
    }
}

class DeadLockTest implements Runnable{

    private boolean flag;
    static Object obj1 = new Object();
    static Object obj2 = new Object();
    public DeadLockTest(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run(){
        if(flag){
            synchronized(obj1){
                System.out.println("if lock1");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                synchronized (obj2) {
//                    System.out.println("if lock2");
//                }
            }
        }else{
            synchronized (obj1) {
                System.out.println("else lock2");
//                synchronized (obj1) {
//                    System.out.println("else lock1");
//                }
            }
        }
    }
}
