package com.lky.designPattern.test;

import com.lky.designPattern.state.Machine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/7/3
 * 状态模式测试类
 */
@SpringBootTest
public class TestState {

    @Test
    void testState(){
        //创建上下文对象（自动售卖机）
        Machine machine = new Machine();

        System.out.println("=======直接选择商品=======");
        machine.selectProduct();

        System.out.println("======投币--->选择商品--->发放商品=======");
        machine.insertCoin();
        machine.selectProduct();
        machine.dispense();

        System.out.println("=======投币--->发放商品=======");
        machine.insertCoin();
        machine.dispense();
    }
}
