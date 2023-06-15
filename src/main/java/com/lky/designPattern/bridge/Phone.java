package com.lky.designPattern.bridge;

/**
 * @author Created by njy on 2023/6/15
 * 3.抽象部分（Abstraction）：手机抽象类
 */
public abstract class Phone {

    //蓝牙接口实例
    protected Bluetooth bluetooth;

    public Phone(Bluetooth bluetooth){
        this.bluetooth=bluetooth;
    }

    //手机具体功能，调用蓝牙接口的方法
    public abstract void bluetoothFunction();
}
