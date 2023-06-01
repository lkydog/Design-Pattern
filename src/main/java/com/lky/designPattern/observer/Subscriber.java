package com.lky.designPattern.observer;

/**
 * @author Created by njy on 2023/6/1
 * 订阅者（即观察者）接口
 */
public interface Subscriber {
    void update(String message);
}
