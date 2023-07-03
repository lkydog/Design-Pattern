package com.lky.designPattern.state;

/**
 * @author Created by njy on 2023/7/3
 * 1.抽象状态（Abstract State）：状态接口
 * 定义：定义该状态下的行为，可以一个或多个。
 */
public interface State {
    //投币
    void insertCoin();
    //选择商品
    void selectProduct();
    //发放商品
    void dispense();
}
