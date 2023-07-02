package com.lky.designPattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by njy on 2023/7/2
 * 3.管理者（Caretaker）：历史记录
 * 定义：负责保存备忘录对象，但不能修改备忘录对象的内容。它可以存储多个备忘录对象，并决定何时将备忘录恢复给源发器。
 */
public class History {
    //备忘录可以保存多个状态
    private final List<EditorMemento> mementos = new ArrayList<>();

    // 保存备忘录对象的状态
    public void push(EditorMemento memento) {
        mementos.add(memento);
    }

    // 弹出（移除）最近保存的备忘录对象，并返回它
    public EditorMemento pop() {
        int lastIndex = mementos.size() - 1;
        EditorMemento lastMemento = mementos.get(lastIndex);
        mementos.remove(lastIndex);
        return lastMemento;
    }

}
