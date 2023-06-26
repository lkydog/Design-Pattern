package com.lky.designPattern.interpreter;

/**
 * @author Created by njy on 2023/6/26
 * 2.终结符表达式（Terminal Expression）：常量
 * 终结符表达式表示语言中的终止符（例如，变量、关键字等）。
 */
public class Constant extends Expression{
    private int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        // 直接返回常量值
        return value;
    }
}
