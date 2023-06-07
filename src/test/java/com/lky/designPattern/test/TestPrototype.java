package com.lky.designPattern.test;

import com.lky.designPattern.prototype.HeroSkill;
import com.lky.designPattern.prototype.StealManFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/7
 * 原型模式
 */
@SpringBootTest
public class TestPrototype {

    @Test
    void testPrototype(){
        //初始化英雄
        HeroSkill heroSkill=new HeroSkill("盲僧","神龙摆尾");
        //初始化工厂类（塞拉斯）
        StealManFactory factory=new StealManFactory(heroSkill);
        //复制英雄技能
        HeroSkill cloneHeroSkill = factory.cloneHeroSkill();
        //塞拉斯复制的技能
        cloneHeroSkill.showSkill();
        System.out.println("-------下方原英雄技能展示----------");
        //原英雄技能
        heroSkill.showSkill();
    }
}
