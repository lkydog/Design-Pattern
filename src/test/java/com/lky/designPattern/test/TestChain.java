package com.lky.designPattern.test;

import com.lky.designPattern.chain.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/5
 * 责任链模式测试类
 */
@SpringBootTest
public class TestChain {


    @Test
    void testChain(){
        Approver classAdviser = new ClassAdviser("张三");
        Approver gradeLeader = new GradeLeader("李四");
        Approver schoolMaster = new Master("王五");

        //组织责任链
        classAdviser.setNext(gradeLeader);
        gradeLeader.setNext(schoolMaster);

        //发起请求
        LeaveRequest request = new LeaveRequest("小明", 10);
        classAdviser.approve(request);
    }
}
