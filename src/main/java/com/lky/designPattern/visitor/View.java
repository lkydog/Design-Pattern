package com.lky.designPattern.visitor;

/**
 * @author Created by njy on 2023/7/4
 * 4.具体元素（Concrete Element）：风景
 * 定义：实现了抽象元素接口，它是数据结构中的具体的元素，用于接收具体的访问者并执行相应的操作。
 * 每个具体元素都有自己的业务逻辑，并在接收访问者时将具体的操作委托给访问者进行处理。
 */
public class View implements Spot{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // 将自身传递给访问者
    }
    // 具体自然风景的业务逻辑
    public void display() {
        System.out.println("这是一处壮丽的自然风景。");
    }
}
