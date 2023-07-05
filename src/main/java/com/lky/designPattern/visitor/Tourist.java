package com.lky.designPattern.visitor;

/**
 * @author Created by njy on 2023/7/4
 * 2.具体访问者（Concrete Visitor）：游客
 * 定义：实现了访问者接口中定义的具体操作，确定访问者访问一个元素时该做什么。
 */
public class Tourist implements Visitor{
    @Override
    public void visit(Relic relic) {
        System.out.println("游客正在参观文物...");
        relic.display();
    }

    @Override
    public void visit(View scenery) {
        System.out.println("游客正在欣赏自然风景...");
        scenery.display();
    }
}
