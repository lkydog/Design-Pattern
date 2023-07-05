package com.lky.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by njy on 2023/6/1
 * 2.具体被观察者：报纸实现类
 */
public class NewspaperImpl implements Newspaper{

    //订阅者集合
    List<Subscriber> subscribers = new ArrayList<>();

    //添加订阅者
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    //移除订阅者
    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    //通知订阅者
    @Override
    public void notifySubscribers(String message) {
        for (Subscriber s : subscribers) {
            s.update(message);
        }
    }
}
