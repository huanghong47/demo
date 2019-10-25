package cn.huanghong.testSE.test11Math;

import java.util.Random;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-10-11 15:58
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println(getRandom(1,100));
    }

    public static int getRandom(int min, int max){
        Random random = new Random();
        int i = random.nextInt(max) % (max - min + 1) + min;
        return i;
    }

}
