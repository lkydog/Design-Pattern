package com.lky.designPattern.adapter.interfaceAdapter;

/**
 * @author Created by njy on 2023/6/11
 * target2：用于解释接口适配器
 */
public interface target2 {
    /**
     * 翻译
     * @param source 母语
     * @param target 要翻译成的语种
     * @param words 内容
     */
    void translate(String source,String target,String words);

    //无用方法，仅仅用来说明接口适配器
    void a();
}
