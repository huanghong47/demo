package cn.huanghong.testSE.test06If;

import cn.huanghong.testSE.test09Date.ParamUtil;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-03-19 16:36
 */
public class test01 {
    public static void main(String[] args) {
//        if(1==1){
//            System.out.println("11111111");
//        }else if(2>1){
//            System.out.println("22222222");
//        }
//        else{
//            System.out.println("3333333");
//        }
//        System.out.println("4444444");
        A a = null;
        if(ParamUtil.isBlank(a)){
            System.out.println("aaaaaaaaaaaa");
        }
    }
}
