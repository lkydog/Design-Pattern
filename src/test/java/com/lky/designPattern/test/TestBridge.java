package com.lky.designPattern.test;

import com.lky.designPattern.bridge.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/15
 * 桥接模式测试类
 */
@SpringBootTest
public class TestBridge {

    @Test
    void testBridge(){
        //1 创建蓝牙耳机对象
        Bluetooth bluetooth=new BluetoothImpl();

        //2.创建不同品牌的手机对象
        //苹果
        Phone iPhone=new IPhone(bluetooth);
        //华为
        Phone hw=new HWPhone(bluetooth);

        //调用手机的具体功能方法
        iPhone.bluetoothFunction();
        System.out.println("=========================");
        hw.bluetoothFunction();
    }
}
