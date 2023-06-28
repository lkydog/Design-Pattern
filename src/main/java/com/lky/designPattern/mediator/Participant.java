package com.lky.designPattern.mediator;

/**
 * @author Created by njy on 2023/6/27
 * 2.抽象同事类（Colleague）：参与者（同事）
 * 定义：保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
 */
public abstract class Participant {
    // 中介者对象
    protected final LogisticsCenter logisticsCenter;

    public Participant(LogisticsCenter logisticsCenter) {
        this.logisticsCenter = logisticsCenter;
    }

    // 消息发送方法，根据传递给中介者
    public abstract void send(String to, String message);

    // 消息接收方法，由中介者调用
    public abstract void receive(String message);
}
