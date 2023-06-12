package com.lky.designPattern.test;

import com.lky.designPattern.builder.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/12
 * 建造者模式测试类
 */
@SpringBootTest
public class TestBuilder {

    @Test
    void testBuilder(){
        //创建指导者
        MealDiretor diretor=new MealDiretor();

        //执导建造牛肉套餐
        diretor.setMealBuilder(new BeefBurgerMealBuilder());
        diretor.constructMeal();
        Meal meal = diretor.getMeal();
        System.out.println("牛肉套餐："+meal.toString());

        //鸡肉套餐
        diretor.setMealBuilder(new ChickenMealBuilder());
        diretor.constructMeal();
        Meal meal2 = diretor.getMeal();
        System.out.println("鸡肉套餐："+meal2.toString());

        //虾肉套餐
        diretor.setMealBuilder(new ShrimpMealBuilder());
        diretor.constructMeal();
        Meal meal3 = diretor.getMeal();
        System.out.println("虾肉套餐："+meal3.toString());
    }
}
