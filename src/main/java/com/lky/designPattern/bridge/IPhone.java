package com.lky.designPattern.bridge;

/**
 * @author Created by njy on 2023/6/15
 * 4.具体抽象：苹果手机
 */
public class IPhone extends Phone{

    public IPhone(Bluetooth bluetooth) {
        super(bluetooth);
    }

    //手机具体功能，调用蓝牙
    @Override
    public void bluetoothFunction() {
        System.out.println("苹果手机使用蓝牙耳机");
        bluetooth.connect();
        bluetooth.disConnect();
    }
}
