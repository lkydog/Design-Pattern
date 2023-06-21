package com.lky.designPattern.test;

import com.lky.designPattern.flyweight.Bike;
import com.lky.designPattern.flyweight.BikeFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/21
 * 享元模式测试类
 */
@SpringBootTest
public class TestFlyweight {


    @Test
    void testFlyweight(){
        //摩拜单车
        Bike bike1 = BikeFactory.getBike("黑色", "mobike");
        //美团单车
        Bike bike2 = BikeFactory.getBike("黑色", "MT");
        bike1.show();
        bike2.show();
        System.out.println("总共有"+BikeFactory.bikeMap.size()+"种类型单车");

        System.out.println("--------创建相同类型和颜色的单车----------");
        Bike bike3 = BikeFactory.getBike("黑色", "mobike");
        bike3.show();
        //再次看有多少类型
        System.out.println("总共有"+BikeFactory.bikeMap.size()+"种类型单车");
    }
}
