package com.lky.designPattern.prototype;

/**
 * @author Created by njy on 2023/6/7
 * 英雄接口
 */
public  interface HeroSkill {

    /**
     * 克隆方法，用于复制对象
     * @return
     */
   HeroSkill clone();

    /**
     * 展示大招
     */
    void showSkill();
}
