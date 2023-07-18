package com.lky.designPattern.zUnite.factory_strategt_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Created by njy on 2023/7/17
 * 支付宝支付模板
 */
@Component
@Lazy
public class AliTemplate extends PaymentTemplate{

    @Resource
    private PaymentFactory factory;

    @Override
    public Payment selectPay() {
        return factory.select("Alipay");
    }
}
