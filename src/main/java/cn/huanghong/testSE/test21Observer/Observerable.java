package cn.huanghong.testSE.test21Observer;

/**
 * @program: demo
 * @description: 被观察者接口,参考资料:https://www.cnblogs.com/luohanguo/p/7825656.html
 * @author: huanghong
 * @date: 2019-05-23 10:12
 */
public interface Observerable {
    public void register(Observer observer);
    public void remove(Observer observer);
    public void notifyObserver();
}
