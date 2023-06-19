package com.lky.designPattern.composite;

/**
 * @author Created by njy on 2023/6/18
 * 2.叶子节点（Leaf）：数字
 */
public class Number implements Expression{

    private double val;

    public Number(double v){
        this.val=v;
    }

    @Override
    public double evaluate() {
        return val;
    }
}
