package com.lky.designPattern.interpreter;

/**
 * @author Created by njy on 2023/6/26
 * 1.抽象表达式（Abstract Expression）
 * 抽象表达式定义了用于解释特定语言的接口。
 */
public abstract class Expression {
    //定义解释器方法
    public abstract int interpret();
}
