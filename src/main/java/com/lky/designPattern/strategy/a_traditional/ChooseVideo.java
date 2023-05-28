package com.lky.designPattern.strategy.a_traditional;

import org.springframework.stereotype.Component;

/**
 * @author Created by njy on 2023/5/28
 * 传统模式
 */
@Component
public class ChooseVideo {

    public String chooseVideo(String type){

        if("dy".equals(type)){
            return "我在刷抖音";
        }else if ("ks".equals(type)){
            return "我在刷快手";
        }else if ("wx".equals(type)){
            return "我在刷微信短视频";
        }
        return null;
    }

}
