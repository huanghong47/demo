package cn.huanghong.基础.反射.eg1;

/**
 * @program: demo
 * @description: https://blog.csdn.net/lwl20140904/article/details/80163880
 * @author: huanghong
 * @date: 2019-07-22 15:35
 */
public class Student {
    private String name;

    private Integer age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
//    Student(){
//
//    }
//    Student(String name){
//        System.out.println("1111111111");
//    }

    //默认构造器
    public Student() {
        System.out.println("ccccccccccccccccc");
    }

    //有参构造器
    public Student(String name) {
        this.name = name;
    }

    protected Student(Integer age) {
        this.age = age;
    }

    public void testmethod1(){
        System.out.println("-------testmethod1------");
    }

    protected void testmethod2(String a){
        System.out.println("-------testmethod2------"+a);
    }

    public String testmethod3(String a){
        return a;
    }
}
