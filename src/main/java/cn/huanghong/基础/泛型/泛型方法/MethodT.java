package cn.huanghong.基础.泛型.泛型方法;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-24 16:27
 */
public class MethodT<T,E> {
    private T name;
    private E age;

    public <T,E> void shownameage(T name, E age){
        System.out.println(name);
        System.out.println(age);
    }


    public MethodT(T name, E age) {
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }
    //类只声明了T,并未声明E
//    private E age;


    public MethodT() {
    }
    //以下均不属于泛型方法
    public MethodT(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    //以下属于泛型方法,其中形参可以是T,也可以是E，前面声明了T和E。注意：方法中的<T>和类中的<T>不是一样的概念,这两个可以不一样
    public <T,E> void showname(T name,E name2){
        System.out.println(name);
        System.out.println(name2);
    }

    public <T> T showname5(T name){
        return name;
    }
    //这个不属于泛型方法
    public void showname2(T ww){

    }

    //以下均属于泛型方法
    <E> void showname3(E name){

    }
    <E> void showname4(T name){

    }

    public static <T,E> void shownameage6(T name, E age){
        System.out.println(name);
        System.out.println(age);
    }

//    public static  void shownameage7(T name, E age){
//        System.out.println(name);
//        System.out.println(age);
//    }
}
