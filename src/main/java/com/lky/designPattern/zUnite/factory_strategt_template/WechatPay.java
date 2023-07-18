package com.lky.designPattern.zUnite.factory_strategt_template;

import org.springframework.stereotype.Component;

/**
 * @author Created by njy on 2023/7/16
 * 微信支付
 */
@Component
public class WechatPay implements Payment{
    @Override
    public void validatePayment() {
        // 验证支付宝支付参数
        System.out.println("验证微信支付请求参数。。。");
    }

    @Override
    public void executePayment() {
        // 发送支付宝支付请求
        System.out.println("发起微信支付请求。。。。");
    }

    @Override
    public void processPaymentResult() {
        // 处理支付宝支付结果
        System.out.println("正在处理支付结果。。。");
    }

    @Override
    public String getType() {
        return "WeChatPay";
    }
}
