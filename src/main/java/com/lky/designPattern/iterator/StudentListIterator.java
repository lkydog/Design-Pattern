package com.lky.designPattern.iterator;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Created by njy on 2023/6/25
 * 具体迭代器（Concrete iterator）：
 * 实现抽象迭代器定义的接口，负责实现对元素的访问和遍历。
 */
public class StudentListIterator implements StudentIterator{
    private List<Student> students;
    private int index;

    public StudentListIterator(List<Student> students) {
        this.students = students;
        this.index = 0;
    }

    //检查是否还有下一个元素
    @Override
    public boolean hasNext() {
        return (index < students.size());
    }

    //返回下一个元素
    @Override
    public Student next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Student student = students.get(index);
        index++;
        return student;
    }
}
