package com.lky.designPattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @author Created by njy on 2023/5/25
 * 抖音
 */
@Component
public class DyVideoStrategy implements VideoStrategy{
    @Override
    public String brushVideo() {
        return "我在刷抖音";
    }

    @Override
    public String getVideoType() {
        return "dy";
    }
}
