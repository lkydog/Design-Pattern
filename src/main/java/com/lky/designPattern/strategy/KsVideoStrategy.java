package com.lky.designPattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @author Created by njy on 2023/5/25
 *  3.具体策略类（Concrete Strategy）：快手
 */
@Component
public class KsVideoStrategy implements VideoStrategy{
    @Override
    public String brushVideo() {
        return "我在刷快手";
    }

    @Override
    public String getVideoType() {
        return "ks";
    }
}
