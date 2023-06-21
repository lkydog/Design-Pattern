package com.lky.designPattern.flyweight;

/**
 * @author Created by njy on 2023/6/21
 * 2.具体享元类（ConcreteFlyWeight）：摩拜单车
 */
public class Mobike extends Bike{

    public Mobike(String color,int price){
        super(color,price);
    }

    @Override
    public void show() {
        System.out.println("生产成功：摩拜单车——"+color+","+"起步价"+price+"元");
    }
}
