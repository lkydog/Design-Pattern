package com.lky.designPattern.strategy;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Created by njy on 2023/5/25
 * 视频策略环境类（策略Bean的工厂）
 */
@Component
public class VideoContext {

    private static final Map<String, VideoStrategy> videoMap = new HashMap<>();

    /**
     * 对象初始化时，将所有策略实现类加入到map中
     * @param videoStrategies
     */
    public VideoContext(List<VideoStrategy> videoStrategies) {
        videoStrategies.forEach(strategy -> videoMap.put(strategy.getVideoType(), strategy));
    }

    /**
     * 根据videoType获取对应的策略实现类
     * @param videoType
     * @return
     */
    public VideoStrategy getVideoStrategy(String videoType){
        VideoStrategy videoStrategy = videoMap.get(videoType);
        if (videoStrategy==null) {
            throw new RuntimeException("videoType inValid!");
        }
        return videoStrategy;
    }
}
