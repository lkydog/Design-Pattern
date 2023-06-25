package com.lky.designPattern.iterator;

/**
 * @author Created by njy on 2023/6/25
 * 抽象聚合器（Aggregate）：学生聚合器
 * 提供创建迭代器的接口，例如可以定义一个iterator()方法。
 */
public interface StudentAggregate {
    //用于创建具体的迭代器对象
    StudentIterator iterator();
    void add(Student student);
}
