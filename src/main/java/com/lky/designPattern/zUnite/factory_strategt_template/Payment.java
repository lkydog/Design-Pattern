package com.lky.designPattern.zUnite.factory_strategt_template;

/**
 * @author Created by njy on 2023/7/16
 * 支付接口
 */
public interface Payment {
    //校验参数
    void validatePayment();
    //发起请求
    void executePayment();
    //处理结果
    void processPaymentResult();

    String getType();
}
