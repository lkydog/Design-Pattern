package com.lky.designPattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Created by njy on 2023/6/27
 * 4.具体中介者（Concrete Mediator）：物流公司
 * 定义：实现抽象中介者接口，定义一个List来管理同时对象，
 *      协调各个同事对象之间的交互，依赖于同事角色。
 */
public class LogisticsCenterImpl implements LogisticsCenter{

    // 参与方列表，用于管理同事之间的交互关系
    private final Map<String, Participant> participants = new HashMap<>();

    // 参与方注册方法的实现，向同事列表中添加参与方
    @Override
    public void register(Participant participant) {
        participants.put(participant.getClass().getSimpleName(), participant);
    }

    // 发送信息方法的实现，根据接收方信息调用接收方的消息接收方法
    @Override
    public void send(String from, String to, String message) {
        Participant participant = participants.get(to);
        if (participant != null) {
            participant.receive("Message from " + from + ": " + message);
        }
    }
}
