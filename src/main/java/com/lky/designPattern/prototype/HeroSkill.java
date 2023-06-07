package com.lky.designPattern.prototype;

/**
 * @author Created by njy on 2023/6/7
 * 具体的原型类，被窃取技能的英雄
 */
public class HeroSkill implements Cloneable{

    private String name;
    private String bigMove;
    public HeroSkill(){

    }

    public HeroSkill(String name, String bigMove){
        this.name=name;
        this.bigMove=bigMove;
    }

    @Override
    public HeroSkill clone() {
        HeroSkill clone= null;
        try {
            clone = (HeroSkill) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("塞拉斯窃取"+name+"的大招："+bigMove);
        return clone;
    }

    public void showSkill() {
        System.out.println(name+"的大招："+bigMove);
    }
}
