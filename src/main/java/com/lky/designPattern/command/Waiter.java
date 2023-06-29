package com.lky.designPattern.command;

/**
 * @author Created by njy on 2023/6/29
 * 4.调用者（Invoker）：服务员
 * 定义：持有命令对象，通常是多个，并通过访问命令对象来执行相关请求，他不直接访问接收者。
 */
public class Waiter {
    //命令对象
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void takeOrder() {
        // 服务员接收到顾客的点菜请求
        System.out.println("服务员接收到顾客（客户端）点菜请求！");
        // 执行点菜操作
        command.order();
    }

    public void cancelOrder() {
        // 服务员收到顾客的取消点菜请求
        System.out.println("服务员接收到顾客（客户端）取消点菜请求！");
        // 执行取消点菜操作
        command.cancelOrder();
    }
}
