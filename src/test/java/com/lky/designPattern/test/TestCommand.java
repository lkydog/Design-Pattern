package com.lky.designPattern.test;

import com.lky.designPattern.command.Chef;
import com.lky.designPattern.command.Command;
import com.lky.designPattern.command.OrderCommand;
import com.lky.designPattern.command.Waiter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/29
 * 命令模式测试类
 */
@SpringBootTest
public class TestCommand {

    @Test
    void testCommand(){
        // 创建厨师（接收者）
        Chef chef = new Chef();
        // 创建点菜命令
        Command orderCommand = new OrderCommand(chef);
        // 创建服务员（调用者）
        Waiter waiter = new Waiter();
        // 设置命令
        waiter.setCommand(orderCommand);
        // 服务员接收到点菜请求
        waiter.takeOrder();
        // 服务员接收到取消点菜请求
        waiter.cancelOrder();
    }

}
