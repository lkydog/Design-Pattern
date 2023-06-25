package com.lky.designPattern.test;

import com.lky.designPattern.iterator.ClassList;
import com.lky.designPattern.iterator.Student;
import com.lky.designPattern.iterator.StudentIterator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/25
 * 迭代器模式测试类
 */
@SpringBootTest
public class TestIterator {


    @Test
    void testIterator(){
        ClassList classList = new ClassList();
        // 添加学生信息
        classList.add(new Student("张三", 18));
        classList.add(new Student("李四", 19));
        classList.add(new Student("王五", 20));
        // 获取迭代器，遍历学生信息
        StudentIterator iterator = classList.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("学生姓名：" + student.getName() + "，学生年龄：" + student.getAge());
        }
    }

}
