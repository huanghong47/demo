package cn.huanghong.基础.泛型.泛型类.eg1;

/**
 * @program: demo
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-07-24 15:42
 */
public class ClassT<T> {
    private T name;

    public ClassT() {
    }

    public ClassT(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
