package com.lky.designPattern.proxy.jdkProxy;

import org.springframework.stereotype.Component;

/**
 * @author Created by njy on 2023/5/30
 */
@Component
public class Teant1Impl implements Landlord2Service{
    @Override
    public String rent(Integer money) {
        System.out.println("小红你好，房子一月"+money+"元");
        return "成交";
    }
}
