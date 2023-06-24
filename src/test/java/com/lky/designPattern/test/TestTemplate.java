package com.lky.designPattern.test;

import com.lky.designPattern.template.KFC;
import com.lky.designPattern.template.OrderFood;
import com.lky.designPattern.template.Starbucks;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/25
 * 模板模式测试类
 */
@SpringBootTest
public class TestTemplate {

    @Test
    void testTemplate(){
        //星巴克（重写了钩子方法，打赏外卖小哥）
        OrderFood orderFood=new Starbucks();
        orderFood.order();
        System.out.println("--------KFC------------");
        //KFC
        OrderFood orderFood1=new KFC();
        orderFood1.order();
    }
}
