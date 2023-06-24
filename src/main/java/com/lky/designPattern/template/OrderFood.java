package com.lky.designPattern.template;

/**
 * @author Created by njy on 2023/6/24
 * 1.抽象类（Abstract Class）：点外卖
 * 包含选择外卖、支付、取外卖三个方法，
 * 其中选择外卖为抽象方法，需要子类实现
 * 支付、取外卖为具体方法
 * 另外是否打赏为钩子方法，子类可以决定是否对算法的不同进行挂钩
 */
public abstract class OrderFood {

    //模板方法
    public void order(){
        selectFood();
        pay();
        getFood();
    }

    //选择外卖   抽象方法 由子类实现具体细节
    public abstract void selectFood();

    //是否打赏   钩子方法 可以重写来做条件控制
    public boolean isGiveAward(){
        return false;
    }

    //-------具体方法----------
    public void pay(){
        System.out.println("支付成功，外卖小哥正在快马加鞭~~");
    }

    //取外卖
    public void getFood(){
        System.out.println("取到外卖");
        if (isGiveAward()){
            System.out.println("打赏外卖小哥");
        }
    }

}
