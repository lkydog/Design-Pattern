package com.lky.designPattern.interpreter;

/**
 * @author Created by njy on 2023/6/26
 * 3.非终结符表达式（Nonterminal Expression）：加法运算
 * 非终结符表达式表示语言中的非终止符（例如，语句块、语句等）。
 */
public class AddExpression extends Expression{
    // 左操作数
    private Expression left;
    // 右操作数
    private Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        // 对左右操作数分别进行解释器求值，然后计算结果
        return left.interpret() + right.interpret();
    }
}
