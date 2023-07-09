package com.lky.designPattern.strategy;

/**
 * @author Created by njy on 2023/5/25
 * 2.抽象策略类（Strategy）
 */
public interface VideoStrategy {
    //刷视频
    String brushVideo();
    //视频类型
    String getVideoType();
}
