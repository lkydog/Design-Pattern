package com.lky.designPattern.visitor;

/**
 * @author Created by njy on 2023/7/4
 * 1.抽象访问者（Visitor）：参观者
 * 定义：定义了对自身数据结构中各个元素的操作，为每个具体元素类对应一个访问操作，该操作中的参数标识了被访问的具体元素。
 */
public interface Visitor {
    void visit(Relic relic);
    void visit(View scenery);
}
