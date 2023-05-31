package com.lky.designPattern.proxy.jdkProxy;

import org.springframework.stereotype.Component;

/**
 * @author Created by njy on 2023/5/30
 */
@Component
public class Teant1Impl implements Landlord2Service{
    @Override
    public void rent(Integer money) {
        System.out.println("tenant1租下"+money+"元一个月的房子");
    }
}
