package com.lky.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by njy on 2023/6/25
 * 具体聚合器（ConcreteAggregate）：班级列表
 * 实现抽象聚合器定义的接口，负责创建具体的迭代器对象，并返回该对象。
 */
public class ClassList implements StudentAggregate{
    private List<Student> students = new ArrayList<>();

    //创建迭代器对象
    @Override
    public StudentIterator iterator() {
        return new StudentListIterator(students);
    }

    //向班级名单中添加学生信息
    @Override
    public void add(Student student) {
        students.add(student);
    }
}
