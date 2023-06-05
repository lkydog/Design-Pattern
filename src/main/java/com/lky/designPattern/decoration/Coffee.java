package com.lky.designPattern.decoration;

/**
 * @author Created by njy on 2023/6/5
 * 2.咖啡类
 */
public class Coffee implements Beverage{

    public String description;
    public Integer cost;

    public Coffee(){
        this.description="Coffee";
        this.cost=10;
    }


    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Integer getCost() {
        return this.cost;
    }
}
