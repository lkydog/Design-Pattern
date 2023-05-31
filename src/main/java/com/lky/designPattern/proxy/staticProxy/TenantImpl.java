package com.lky.designPattern.proxy.staticProxy;

import org.springframework.stereotype.Component;

/**
 * 租客
 * @author Created by njy on 2023/5/30
 */
@Component
public class TenantImpl implements Landlord1Service {

    @Override
    public void rent(Integer money) {
        System.out.println("租下"+money+"元一个月的房子");
    }
}
