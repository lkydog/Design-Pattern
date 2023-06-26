package com.lky.designPattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Created by njy on 2023/6/26
 * 4.上下文（Context）：负责存储变量名和其值之间的映射关系
 * 上下文保存了解释器解释表达式需要的信息。
 */
public class InterpreterVariables {
    private static Map<String, Integer> variables = new HashMap<>();

    // 根据变量名获取其对应的值
    public static int getValue(String name) {
        if(variables.containsKey(name)) {
            return variables.get(name);
        }
        // 默认返回0
        return 0;
    }

    // 设置变量名和其对应的值
    public static void setValue(String name, int value) {
        variables.put(name, value);
    }
}
