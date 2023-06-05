package com.lky.designPattern.decoration;

/**
 * @author Created by njy on 2023/6/5
 * 5.装饰糖
 */
public class Sugar implements Toppings{

    private Beverage beverage;

    public Sugar(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public Integer getCost() {
        return this.beverage.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", sugar";
    }
}
