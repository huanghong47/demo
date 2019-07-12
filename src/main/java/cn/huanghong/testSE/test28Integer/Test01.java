package cn.huanghong.testSE.test28Integer;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-06-27 09:18
 */
public class Test01 {

    private Integer integer;
    private int i;
    private Object object;

    private Integer integer2;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Integer getInteger2() {
        return integer2;
    }

    public void setInteger2(Integer integer2) {
        this.integer2 = integer2;
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
////        int a1 = test01.integer;
//        int a2 = test01.i;
//        Integer a3 = test01.integer;
//        Integer a4 = test01.i;
//        Integer a5 = (Integer)test01.object;
////        Integer a6 = Integer.valueOf((Integer)test01.object);
////        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);
//        System.out.println(a5);
////        System.out.println(a6);
//        test01.setInteger(1);
//        Test01 test02 = new Test01();
//        test02.setInteger2(1);
//
//        if(test01.getInteger() == test02.getInteger2()){
//            System.out.println("1111111111111111");
//        }
//
        int k = 1000000000;
        int j = 1000000000;

        Integer k1 = 10;
        Integer k2 = 10;
        System.out.println(k1==k2);//自动拆箱

    }
}
