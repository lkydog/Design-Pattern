package com.lky.designPattern.command;

/**
 * @author Created by njy on 2023/6/29
 * 2.接收者（Receiver）：厨师
 * 定义：执行实际命令的类，命令对象会调用接收者的方法来执行请求。
 */
public class Chef {

    public void cook() {
        System.out.println("厨师执行点菜命令：正在烹饪菜品...");
    }

    public void cancelCooking() {
        System.out.println("厨师执行取消命令：停止烹饪菜品！");
    }
}
