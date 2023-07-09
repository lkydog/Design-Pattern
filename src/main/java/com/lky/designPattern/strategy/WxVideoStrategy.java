package com.lky.designPattern.strategy;

import org.springframework.stereotype.Component;

/**
 * @author Created by njy on 2023/5/25
 *  3.具体策略类（Concrete Strategy）：微信
 */
@Component
public class WxVideoStrategy implements VideoStrategy{
    @Override
    public String brushVideo() {
        return "我在刷微信视频号";
    }

    @Override
    public String getVideoType() {
        return "wx";
    }
}
