package com.lky.designPattern.bridge;

/**
 * @author Created by njy on 2023/6/15
 * 2.具体实现（Concrete Implementor）：实现蓝牙接口
 */
public class BluetoothImpl implements Bluetooth{
    @Override
    public void connect() {
        System.out.println("蓝牙已连接！");
    }

    @Override
    public void disConnect() {
        System.out.println("蓝牙已断开！");
    }
}
