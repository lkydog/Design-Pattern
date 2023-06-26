package com.lky.designPattern.test;


import com.lky.designPattern.interpreter.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author Created by njy on 2023/6/26
 * 解释器模式测试类
 */
@SpringBootTest
public class TestInterpreter {

    @Test
    void testInterpreter(){
        // 创建变量x、y和常量1，并设置变量x和y的值
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant c = new Constant(1);

        InterpreterVariables.setValue("x", 10);
        InterpreterVariables.setValue("y", 5);

        // 创建解释器表达式（x - y）+ 1
        Expression expression = new AddExpression(new SubExpression(x, y), c);

        // 解释表达式，并获取最终结果
        int result = expression.interpret();
        System.out.println("计算结果：" + result);
    }
}
