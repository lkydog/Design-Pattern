package com.lky.designPattern.decoration;

/**
 * @author Created by njy on 2023/6/6
 * W技能
 */
public class WDecorator implements SkillDecorator{
    private Hero hero;

    private String name;
    public WDecorator(Hero hero,String name){
        this.name=name;
        this.hero=hero;
    }

    private void learnW(){
        System.out.println("习得技能"+name);
    }

    @Override
    public void learnSkill() {
        hero.learnSkill();
        learnW();
    }
}
