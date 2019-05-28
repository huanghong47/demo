package cn.huanghong.testSE.test22Single;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-05-23 15:06
 */
public class Test01 {
    public static void main(String[] args) {
        B.add();
        System.out.println(System.identityHashCode(A.getMessage()));
        A.getMessage().append("c");
        System.out.println("-------------------------");
        System.out.println(System.identityHashCode(A.getMessage()));
        System.out.println(A.getMessage());
    }
}
