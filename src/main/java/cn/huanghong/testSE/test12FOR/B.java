package cn.huanghong.testSE.test12FOR;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-04-20 17:59
 */
public class B {
    public void testb(){
        int size = 10;
        for(int i = 0;i<size;i++){
            if(i==5){
                C c = new C();
                String result = c.a();
                System.out.println(result);
            }
            System.out.println("B的循环"+i);
        }
    }
}
