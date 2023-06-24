package com.lky.designPattern.template;

/**
 * @author Created by njy on 2023/6/24
 * 具体类（Concrete Class）：星巴克
 *
 */
public class Starbucks extends OrderFood{

    //实现父类方法
    @Override
    public void selectFood() {
        System.out.println("一杯抹茶拿铁");
    }

    //重写钩子方法，打赏外卖小哥
    @Override
    public boolean isGiveAward(){
        return true;
    }
}
