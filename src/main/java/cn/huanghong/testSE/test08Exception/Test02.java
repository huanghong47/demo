package cn.huanghong.testSE.test08Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-03-27 14:16
 */
public class Test02 {

    public static void main(String[] args) {
        System.out.println("11111111111111");

        System.out.println("22222222222222");

        if(1==1){
            throw new MyException("抛出异常");
        }

        System.out.println("3333333333333333");

        System.out.println("444444444444444");
    }

}
