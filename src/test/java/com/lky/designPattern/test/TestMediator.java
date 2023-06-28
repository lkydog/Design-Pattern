package com.lky.designPattern.test;

import com.lky.designPattern.mediator.LogisticsCenter;
import com.lky.designPattern.mediator.LogisticsCenterImpl;
import com.lky.designPattern.mediator.Merchant;
import com.lky.designPattern.mediator.TransportCompany;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/28
 * 中介者模式测试类
 */
@SpringBootTest
public class TestMediator {

    @Test
    void testMediator(){
        //创建物流中心对象
        LogisticsCenter logisticsCenter = new LogisticsCenterImpl();
        //运输公司
        TransportCompany company = new TransportCompany(logisticsCenter);
        //商家
        Merchant merchant = new Merchant(logisticsCenter);
        //都注册到物流中心
        logisticsCenter.register(company);
        logisticsCenter.register(merchant);
        //发送消息给物流公司（中介者）
        company.send("Merchant", "快递已送达");
        merchant.send("TransportCompany", "收到，幸苦了");
    }
}
