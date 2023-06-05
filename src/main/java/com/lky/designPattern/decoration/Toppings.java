package com.lky.designPattern.decoration;

/**
 * @author Created by njy on 2023/6/5
 * 3.配料
 * 演示如何通过装饰者模式为咖啡添加配料（如牛奶和糖）
 */
public interface Toppings extends Beverage{

    String getDescription();

}
