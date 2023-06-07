package com.lky.designPattern.decoration;

/**
 * @author Created by njy on 2023/6/6
 * Q技能
 */
public class QDecorator implements SkillDecorator{
    private Hero hero;

    private String name;
    public QDecorator(Hero hero,String name){
        this.name=name;
        this.hero=hero;
    }

    private void learnQ(){
        System.out.println("习得技能"+name);
    }

    @Override
    public void learnSkill() {
        hero.learnSkill();
        learnQ();
    }
}
