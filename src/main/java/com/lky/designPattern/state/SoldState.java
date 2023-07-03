package com.lky.designPattern.state;

/**
 * @author Created by njy on 2023/7/3
 * 2.具体状态（Concrete State）:出售状态
 * 定义：实现了抽象状态类定义的接口，并根据当前状态决定上下文对象的行为。
 */
public class SoldState implements State{
    private Machine machine;

    public SoldState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("正在出售商品，请稍等");
    }

    @Override
    public void selectProduct() {
        System.out.println("正在出售商品，请稍等");
    }

    @Override
    public void dispense() {
        System.out.println("商品已发放");
        //切换到未投币状态
        machine.setState(machine.getNoCoinState());
    }
}
