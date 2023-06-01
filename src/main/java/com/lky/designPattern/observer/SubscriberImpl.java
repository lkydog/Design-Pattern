package com.lky.designPattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Created by njy on 2023/6/1
 * 具体订阅者
 */
@Data
@AllArgsConstructor
public class SubscriberImpl implements Subscriber{
    private String name;

    @Override
    public void update(String message) {
        System.out.println(name + "---接到消息: " + message);
    }
}
