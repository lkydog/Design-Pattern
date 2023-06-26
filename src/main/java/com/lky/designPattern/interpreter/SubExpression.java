package com.lky.designPattern.interpreter;

/**
 * @author Created by njy on 2023/6/26
 * 3.非终结符表达式（Nonterminal Expression）：减法运算
 * 非终结符表达式表示语言中的非终止符（例如，语句块、语句等）。
 */
public class SubExpression extends Expression{
    private Expression left;
    private Expression right;

    public SubExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
