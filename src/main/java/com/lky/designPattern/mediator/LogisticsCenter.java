package com.lky.designPattern.mediator;

/**
 * @author Created by njy on 2023/6/27
 * 1.抽象中介者（Mediator）：物流中心
 * 定义：用于协调各个同事对象之间交互的通用接口
 */
public interface LogisticsCenter {
    // 参与方注册方法，用于新增参与方
    void register(Participant participant);

    // 发送信息方法，用于同事之间的信息传递
    void send(String from, String to, String message);
}
