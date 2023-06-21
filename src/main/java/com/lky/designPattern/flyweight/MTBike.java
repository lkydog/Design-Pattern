package com.lky.designPattern.flyweight;

/**
 * @author Created by njy on 2023/6/21
 * 2.具体享元类（ConcreteFlyWeight）：美团单车
 */
public class MTBike extends Bike{

    public MTBike(String color,int price){
        super(color,price);
    }

    @Override
    public void show() {
        System.out.println("生产成功：小黄车——"+color+","+"起步价"+price+"元");
    }
}
