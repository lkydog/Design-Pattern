package com.lky.designPattern.decoration;

/**
 * @author Created by njy on 2023/6/6
 * R技能
 */
public class RDecorator implements SkillDecorator{

    private Hero hero;

    private String name;
    public RDecorator(Hero hero,String name){
        this.name=name;
        this.hero=hero;
    }

    private void learnR(){
        System.out.println("习得技能"+name);
    }

    @Override
    public void learnSkill() {
        hero.learnSkill();
        learnR();
    }
}
