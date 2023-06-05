package com.lky.designPattern.decoration;

/**
 * @author Created by njy on 2023/6/5
 * 4.装饰牛奶
 */
public class Milk implements Toppings{

    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public Integer getCost() {
        return this.beverage.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", milk";
    }
}
