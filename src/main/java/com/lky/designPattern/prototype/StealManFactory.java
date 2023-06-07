package com.lky.designPattern.prototype;

/**
 * @author Created by njy on 2023/6/7
 * 工厂类，用于在客户端中复制对象
 * （塞拉斯，窃取别的英雄技能）
 */
public class StealManFactory {

    private HeroSkill heroSkill;

    public StealManFactory(HeroSkill heroSkill){
        this.heroSkill=heroSkill;
    }

    public void setHeroSkill(HeroSkill heroSkill){
        this.heroSkill=heroSkill;
    }

    public HeroSkill cloneHeroSkill(){
        return heroSkill.clone();
    }
}
