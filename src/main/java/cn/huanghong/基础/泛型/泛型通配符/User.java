package cn.huanghong.基础.泛型.泛型通配符;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-24 16:18
 */
public class User<T> {
    private T age;

    public User() {

    }

    public User(T age) {
        this.age = age;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public void sout(User<?> user){
        System.out.println(user.getAge());
    }
}
