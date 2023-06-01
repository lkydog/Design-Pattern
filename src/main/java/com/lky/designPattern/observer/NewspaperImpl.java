package com.lky.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by njy on 2023/6/1
 * 报纸实现类
 */
public class NewspaperImpl implements Newspaper{

    List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String message) {
        for (Subscriber s : subscribers) {
            s.update(message);
        }
    }
}
