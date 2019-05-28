package cn.huanghong.testSE.test21Observer;



import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo
 * @description: 被观察者实现
 * @author: huanghong
 * @date: 2019-05-23 10:16
 */
public class WechatServer implements Observerable{

    private List<Observer> list;
    private String message;

    public WechatServer() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if(!CollectionUtils.isEmpty(list)){
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(message);
        }
    }
    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
