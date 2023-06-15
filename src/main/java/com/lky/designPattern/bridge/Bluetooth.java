package com.lky.designPattern.bridge;

/**
 * @author Created by njy on 2023/6/15
 * 1.实现部分（Implementor）：蓝牙接口
 */
public interface Bluetooth {
    //连接
    void connect();

    //断开
    void disConnect();
}
