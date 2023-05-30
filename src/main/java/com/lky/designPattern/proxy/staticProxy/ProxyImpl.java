package com.lky.designPattern.proxy.staticProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 中介
 * @author Created by njy on 2023/5/30
 */
@Component
public class ProxyImpl implements Landlord1Service {

    /**
     * 房东有很多套房子，不想亲自出马了，于是找来了中介
     */
    @Autowired
    private Landlord1Service target;

    /**
     * 优点就是在不改变原来的实现类的情况下对方法实现了增强
     * 缺点是如果原来的接口新增了方法，那么这里也要对应实现新的方法
     * @param money 金额
     * @return
     */
    @Override
    public String rent(Integer money) {
        String rent = target.rent(money);
        System.out.println("[静态代理]这个房子很不错哦");
        return rent;
    }
}
