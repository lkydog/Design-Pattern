package com.lky.designPattern.observer;



/**
 * @author Created by njy on 2023/6/1
 * 1.抽象被观察者：报纸接口，即被观察者接口
 */
public interface Newspaper {
    /**
     * 添加订阅者
     * @param subscriber
     */
    void addSubscriber(Subscriber subscriber);

    /**
     * 移除订阅者
     * @param subscriber
     */
    void removeSubscriber(Subscriber subscriber);

    /**
     * 通知订阅者
     * @param message
     */
    void notifySubscribers(String message);
}
