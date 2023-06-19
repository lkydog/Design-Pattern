package com.lky.designPattern.test;

import com.lky.designPattern.composite.AddOperator;
import com.lky.designPattern.composite.Expression;
import com.lky.designPattern.composite.MulOperator;
import com.lky.designPattern.composite.Number;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/18
 * 组合模式测试类
 */
@SpringBootTest
public class TestComposite {


    @Test
    void testComposite(){
        // 构建一个算数表达式: (2 + 3) * 4
        Expression expression = new MulOperator(
                new AddOperator(new Number(2), new Number(3)),
                new Number(4)
        );
        // 计算表达式的结果
        double result = expression.evaluate();
        System.out.println("(2+3)*4=" + result);
    }
}
