package com.lky.designPattern.test;

import com.lky.designPattern.zUnite.factory_strategt_template.AliTemplate;
import com.lky.designPattern.zUnite.factory_strategt_template.Payment;
import com.lky.designPattern.zUnite.factory_strategt_template.PaymentTemplate;
import com.lky.designPattern.zUnite.factory_strategt_template.WeChatTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/7/18
 * 策略+工厂+模板模式测试
 */
@SpringBootTest
public class Factory_strategt_template {

    @Autowired
    AliTemplate aliTemplate;

    @Autowired
    WeChatTemplate weChatTemplate;

    @Test
    public void test(){
        //支付宝
        System.out.println("-------支付宝支付-----------");
        aliTemplate.processPayment();
        System.out.println("---------微信支付----------");
        weChatTemplate.processPayment();
    }
}
