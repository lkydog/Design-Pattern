package com.lky.designPattern.zUnite.factory_strategt_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Created by njy on 2023/7/16
 * 支付工厂
 */
@Component
public class PaymentFactory {

    private List<Payment> payments;


    private static final Map<String, Payment> paymentMap = new ConcurrentHashMap<>();

    //项目启动时把支付类型和对应的payment放入map中
    @PostConstruct
    protected void init() {
        if (payments != null) {
            payments.forEach(payment -> paymentMap.put(payment.getType(), payment));
        }
    }

    public Payment select(String payType) {
        Payment payment = paymentMap.get(payType);
        if (null == payment) {
            throw new IllegalArgumentException("Invalid payment method");
        }
        return payment;
    }

    @Autowired
    public void setpayments(List<Payment> payments) {
        this.payments = payments;
    }
}
