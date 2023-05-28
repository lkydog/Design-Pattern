package com.lky.designPattern.strategy;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Created by njy on 2023/5/25
 * 视频策略环境类（策略Bean的工厂）
 * 在初始化VideoContext对象时，将所有策略实现类塞进Map中，
 * key为视频类型（dy、ks、wx） value为对应的视频实现类
 * 通过getVideoStrategy方法，根据videoType从map中渠道对应的视频策略
 * 从而隐藏了策略的具体实现逻辑。这种方式可以遵循开闭原则，因为在新增视频类型时，只需要增加对应的实现类
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
