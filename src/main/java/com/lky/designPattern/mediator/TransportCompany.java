package com.lky.designPattern.mediator;

/**
 * @author Created by njy on 2023/6/27
 * 3.具体同事类（Concrete Colleague）：运输公司
 * 定义：实现抽象同事类接口，当需要与其他同事对象交互时，
 * 由中介者对象负责后续的交互，简单地说就是维护和中介者对象的通信。
 */
public class TransportCompany extends Participant{

    public TransportCompany(LogisticsCenter logisticsCenter) {
        super(logisticsCenter);
    }

    // 消息发送方法的实现，发送信息给中介者对象
    @Override
    public void send(String to, String message) {
        logisticsCenter.send("运输公司", to, message);
    }

    // 消息接收方法的实现，打印接收信息的内容
    @Override
    public void receive(String message) {
        System.out.println("运输公司接到消息: " + message);
    }
}
