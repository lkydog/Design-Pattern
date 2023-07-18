package com.lky.designPattern.zUnite.factory_strategt_template;

/**
 * @author Created by njy on 2023/7/17
 * 支付模板
 */
public abstract class PaymentTemplate {

    //模板方法
    public void processPayment() {
        Payment payment = selectPay();
        //验证参数
        payment.validatePayment();
        //发起请求
        payment.executePayment();
        //结果处理
        payment.processPaymentResult();
        if (isReceipt()) {
            System.out.println(payment.getType()+"支付，开具小票。。。。");
        }else {
            System.out.println(payment.getType()+"支付，不开小票");
        }
        //do something：支付后的操作，例如成功或失败后的回调
    }

    //抽象方法
    public abstract Payment selectPay();


    //钩子方法：是否开具小票
    public boolean isReceipt(){
        return false;
    }
}
