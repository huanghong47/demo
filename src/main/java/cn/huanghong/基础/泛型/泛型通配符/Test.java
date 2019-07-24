package cn.huanghong.基础.泛型.泛型通配符;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-24 16:19
 */
public class Test {
    public static void main(String[] args) {
        User<Number>user1 = new User<>(2);
        User<Integer>user2 = new User<>(4);
        user2.sout(user2);
    }


}
