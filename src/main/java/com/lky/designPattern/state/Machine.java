package com.lky.designPattern.state;

/**
 * @author Created by njy on 2023/7/3
 * 3.上下文（Context）：自动售卖机
 * 定义：定义客户端需要的接口，并且负责具体状态的切换。
 */
public class Machine {
    //未投币状态
    private State noCoinState;
    //已投币状态
    private State hasCoinState;
    //出售状态
    private State soldState;
    //当前状态
    private State currentState;

    public Machine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        currentState = noCoinState; // 初始状态为未投币状态
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispense() {
        currentState.dispense();
    }
}
