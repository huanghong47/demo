package cn.huanghong.testSE.test23Tread.testAsync;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-26 09:42
 */
public class Test01 {
    public static void main(String[] args) {
        Test02 test02 = new Test02();
        for (int i=0;i<2;i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    test02.add();
                }
            };
            new Thread(runnable).start();
        }

        System.out.println("===============");
    }
}
