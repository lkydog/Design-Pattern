package com.lky.designPattern.adapter;

/**
 * @author Created by njy on 2023/6/8
 * 翻译类：有一个可以把汉语翻译成英语的方法
 */
public class Translator {

    //英——》汉
    public void translateInZh(String words){
        if("hello world！".equals(words)){
            System.out.println("翻译成中文：”你好世界！“");
        }
    }

    //汉——》英
    public void translateInEn(String words){
        if("你好世界！".equals(words)){
            System.out.println("Translate in English：”hello world！“");
        }
    }
}
