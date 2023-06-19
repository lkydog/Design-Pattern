package com.lky.designPattern.composite;

/**
 * @author Created by njy on 2023/6/18
 * 2.组合节点（Composite）：运算
 */
public abstract class Operator implements Expression{
    protected Expression left;
    protected Expression right;

    public Operator(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
//    @Override
//    public double evaluate(){
//        return 0;
//    }
}
