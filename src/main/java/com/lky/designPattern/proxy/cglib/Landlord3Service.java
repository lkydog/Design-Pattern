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
    public String rent(Integer money){
        System.out.println("小刚你好，房子一月"+money+"元");
        return "我再考虑考虑";
    }
}
