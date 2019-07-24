package cn.huanghong.testSE.test08Exception;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-03-27 13:50
 */
public class Test01 {

    public static void ceshi(){
        int i = 0;
        int j = 1;
        System.out.println(j/i);
    }

    public static String main1(){
        int i = 0;
        int j = 1;
        ceshi();
        return "11111";
//        try {
//            i = 0;
//            j = 2;
////            System.out.println("123");
////            return i+"";
////            ceshi();
////            return i+""+j;//02
//            throw  new MyException("try中的自定义异常");
//        } catch (Exception e) {
////            e.printStackTrace();
//            return "11111";
////            throw  new MyException("自定义");
//        } finally {
////            System.out.println("222222222222");
////            System.out.println(i);
////            System.out.println(j);
//        }
    }

    public static void main(String[] args) {
        int i = 2;
        try {
            i = 3;
            int a = i/0;
            System.out.println(a);
        } catch (Exception e) {
//            System.out.println(e.getMessage());
            System.out.println(i);
        }
    }
}
