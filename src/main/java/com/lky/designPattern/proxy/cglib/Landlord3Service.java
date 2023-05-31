package com.lky.designPattern.proxy.cglib;

import org.springframework.stereotype.Component;

/**
 * @author Created by njy on 2023/5/30
 */
@Component
public class Landlord3Service {

    /**
     * 出租房屋
     * @param money
     * @return
     */
    public void rent(Integer money){
        System.out.println("租下"+money+"元一个月的房子");
    }
}
