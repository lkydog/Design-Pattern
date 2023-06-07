package com.lky.designPattern.prototype;

/**
 * @author Created by njy on 2023/6/7
 * 具体的原型类，被窃取技能的英雄
 */
public class HeroSkillImpl implements HeroSkill{

    private String name;
    private String bigMove;
    public HeroSkillImpl(){

    }

    public HeroSkillImpl(String name,String bigMove){
        this.name=name;
        this.bigMove=bigMove;
    }

    @Override
    public HeroSkill clone() {
        HeroSkill clone=new HeroSkillImpl(name,bigMove);
        System.out.println("塞拉斯窃取"+name+"的大招："+bigMove);
        return clone;
    }

    @Override
    public void showSkill() {
        System.out.println(name+"的大招："+bigMove);
    }
}
