package com.lky.designPattern.state;

/**
 * @author Created by njy on 2023/7/3
 * 2.具体状态（Concrete State）:已投币状态
 * 定义：实现了抽象状态类定义的接口，并根据当前状态决定上下文对象的行为。
 */
public class HasCoinState implements State{

    private Machine machine;

    public HasCoinState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("已投币，请勿重复投币");
    }

    @Override
    public void selectProduct() {
        System.out.println("商品已选择");
        // 切换到出售状态
        machine.setState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("请先选择商品");
    }
}
