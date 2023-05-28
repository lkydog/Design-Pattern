package com.lky.designPattern.test;

import com.lky.designPattern.strategy.VideoContext;
import com.lky.designPattern.strategy.VideoStrategy;
import com.lky.designPattern.strategy.a_traditional.ChooseVideo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author njy
 * @date 2023/5/24 13:58
 * 策略模式
 */
@SpringBootTest
public class TestStrategy {

    @Autowired
    private ChooseVideo chooseVideo;

    @Autowired
    private VideoContext videoContext;

    @Test
    void testTraditional(){
        //传统模式
        String dy = chooseVideo.chooseVideo("dy");
        System.out.println("dy = " + dy);
        String ks = chooseVideo.chooseVideo("ks");
        System.out.println("ks = " + ks);
        String wx = chooseVideo.chooseVideo("wx");
        System.out.println("wx = " + wx);
    }


    @Test
    void testStrategy(){
        //策略模式
        VideoStrategy video1 = videoContext.getVideoStrategy("dy");
        String v1 = video1.brushVideo();
        System.out.println("v1 ： " + v1);
        VideoStrategy video2 = videoContext.getVideoStrategy("ks");
        String v2 = video2.brushVideo();
        System.out.println("v2 ： " + v2);
        VideoStrategy video3 = videoContext.getVideoStrategy("wx");
        String v3 = video3.brushVideo();
        System.out.println("v3 ： " + v3);

    }
}
