package com.lky.designPattern.test;

import com.lky.designPattern.decoration.Beverage;
import com.lky.designPattern.decoration.Coffee;
import com.lky.designPattern.decoration.Milk;
import com.lky.designPattern.decoration.Sugar;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/5
 */
@SpringBootTest
public class TestDecoration {

    @Test
    void testDecoration(){
        Beverage coffee = new Coffee();//原价10
        coffee = new Milk(coffee); // 装饰咖啡加牛奶 10+5=15
        coffee = new Sugar(coffee); // 装饰咖啡加糖 15+3=18

        String description = coffee.getDescription();// 返回"Coffee, milk, sugar"
        Integer cost = coffee.getCost();//18
        System.out.println(description+"一共"+cost+"元");
    }
}
