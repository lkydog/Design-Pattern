package com.lky.designPattern.visitor;

/**
 * @author Created by njy on 2023/7/4
 * 3.抽象元素（Element）：景点
 * 定义：定义了接受访问者的接口，通常是一个接口或抽象类，其中定义了一个接受访问者的方法，被访问者对象作为方法的参数。
 */
public interface Spot {
    void accept(Visitor visitor);
}
