package cn.huanghong.testSE.test12FOR;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-20 17:58
 */
public class A {
    public static void main(String[] args) {
        int size = 10;
        for(int i = 0;i<size;i++){
            if(i==5){
                B b = new B();
                try {
                    b.testb();
                } catch (Exception e) {
                    System.out.println("报错但是继续");
                }
            }
            System.out.println("A的循环"+i);
        }
    }
}
