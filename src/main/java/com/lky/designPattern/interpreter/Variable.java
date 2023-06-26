package com.lky.designPattern.interpreter;

/**
 * @author Created by njy on 2023/6/26
 * 2.终结符表达式（Terminal Expression）：变量
 * 终结符表达式表示语言中的终止符（例如，变量、关键字等）。
 */
public class Variable extends Expression{
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret() {
        // 从上下文中获取该变量对应的值
        return InterpreterVariables.getValue(this.name);
    }
}
