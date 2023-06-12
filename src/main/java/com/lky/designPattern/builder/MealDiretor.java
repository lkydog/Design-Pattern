package com.lky.designPattern.builder;

/**
 * @author Created by njy on 2023/6/12
 * 4.指导者（Director）
 */
public class MealDiretor {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder){
        this.mealBuilder=mealBuilder;
    }

    public Meal getMeal(){
        return mealBuilder.getMeal();
    }

    //制作套餐
    public void constructMeal(){
        mealBuilder.buildBurger();
        mealBuilder.buildFries();
        mealBuilder.buildDrink();
    }
}
