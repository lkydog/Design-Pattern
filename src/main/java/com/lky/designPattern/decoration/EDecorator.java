package com.lky.designPattern.decoration;

/**
 * @author Created by njy on 2023/6/6
 * E技能
 */
public class EDecorator implements SkillDecorator{
    private Hero hero;

    private String name;
    public EDecorator(Hero hero,String name){
        this.name=name;
        this.hero=hero;
    }

    private void learnE(){
        System.out.println("习得技能"+name);
    }

    @Override
    public void learnSkill() {
        hero.learnSkill();
        learnE();
    }
}
