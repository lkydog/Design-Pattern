package com.lky.designPattern.memento;

/**
 * @author Created by njy on 2023/7/1
 * 1.备忘录（Memento）：备忘录，保存编辑器的状态
 * 定义：存储源发器对象的状态。备忘录对象可以包括一个或多个状态属性，源发器可以根据需要保存和恢复状态。
 */
public class EditorMemento {
    //文本内容 （可以是属性、也可以是对象）
    private  String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
