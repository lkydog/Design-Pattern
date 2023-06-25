package com.lky.designPattern.iterator;

import java.util.Iterator;
/**
 * @author Created by njy on 2023/6/25
 * 抽象迭代器（Iterator）：学生迭代器
 * 实现Iterator接口
 * 负责定义访问和遍历元素的接口，例如提供hasNext()和next()方法。
 */
public interface StudentIterator extends Iterator<Student> {
}
