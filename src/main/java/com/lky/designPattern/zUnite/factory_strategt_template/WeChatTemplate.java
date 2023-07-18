package com.lky.designPattern.zUnite.factory_strategt_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Created by njy on 2023/7/17
 * 微信支付模板
 */
@Component
public class WeChatTemplate extends PaymentTemplate{

    @Autowired
    private PaymentFactory factory;

    @Override
    public Payment selectPay() {
        return factory.select("WeChatPay");
    }

    @Override
    public boolean isReceipt() {
        return true;
    }
}
