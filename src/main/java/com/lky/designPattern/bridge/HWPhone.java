package com.lky.designPattern.bridge;

/**
 * @author Created by njy on 2023/6/15
 * 4.具体抽象：华为手机
 */
public class HWPhone extends Phone{
    public HWPhone(Bluetooth bluetooth) {
        super(bluetooth);
    }

    //手机具体功能，调用蓝牙
    @Override
    public void bluetoothFunction() {
        System.out.println("华为手机使用蓝牙耳机");
        bluetooth.connect();
        bluetooth.disConnect();
    }
}
