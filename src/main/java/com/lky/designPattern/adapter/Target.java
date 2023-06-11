package com.lky.designPattern.adapter;

/**
 * @author Created by njy on 2023/6/8
 * 目标接口(target)
 */
public interface Target {

    /**
     * 翻译
     * @param source 母语
     * @param target 要翻译成的语种
     * @param words 内容
     */
    void translate(String source,String target,String words);
}
