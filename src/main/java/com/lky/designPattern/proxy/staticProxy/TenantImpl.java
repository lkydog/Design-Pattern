package com.lky.designPattern.proxy.staticProxy;

import org.springframework.stereotype.Component;

/**
 * 租客
 * @author Created by njy on 2023/5/30
 */
@Component
public class TenantImpl implements Landlord1Service {

    @Override
    public String rent(Integer money) {
        System.out.println("小明你好，房子一月"+money+"元");
        return "我再考虑考虑";
    }
}
