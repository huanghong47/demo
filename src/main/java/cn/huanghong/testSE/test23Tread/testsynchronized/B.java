package cn.huanghong.testSE.test23Tread.testsynchronized;

/**
 * @program: demo
 * @description: 业务B
 * @author: huanghong
 * @date: 2019-06-19 16:57
 */
public class B{

    public static Integer nums;

    public void addnums(int num){
        //如果nums值为空，那么给它赋值，也就是说nums仅会被赋值1次。比如线程1已经给nums赋值了1，那么线程2就不应该进入此条件
        // 但是多线程环境下就不一定了，当线程1和线程2有可能同时进入了条件，nums被赋值了两次
        if(nums == null || nums.intValue() == 0){
            System.out.println("当前线程名："+Thread.currentThread()+"当前nums值"+nums);
            nums = num;
            System.out.println("当前线程名："+Thread.currentThread()+"当前nums值"+nums);
        }
    }

}
