package com.lky.designPattern.state;

/**
 * @author Created by njy on 2023/7/3
 * 2.具体状态（Concrete State）:未投币状态
 * 定义：实现了抽象状态类定义的接口，并根据当前状态决定上下文对象的行为。
 */
public class NoCoinState implements State{
    private Machine machine;

    public NoCoinState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("已投币");
        // 切换到已投币状态
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void selectProduct() {
        System.out.println("请先投币");
    }

    @Override
    public void dispense() {
        System.out.println("请先投币选择商品");
    }
}
