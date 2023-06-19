package com.lky.designPattern.composite;

/**
 * @author Created by njy on 2023/6/19
 * 2.叶子节点（Leaf）：加法操作符
 */
public class MulOperator extends Operator{
    public MulOperator(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
