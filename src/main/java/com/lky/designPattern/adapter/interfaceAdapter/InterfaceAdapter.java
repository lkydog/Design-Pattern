package com.lky.designPattern.adapter.interfaceAdapter;

import com.lky.designPattern.adapter.Translator;

/**
 * @author Created by njy on 2023/6/11
 * 接口适配器：当不需要全部实现接口方法时。
 * 可以先设计一个抽象类实现接口AdapterTranslate
 * AdapterTranslate实现，不用去实现b()方法
 */
public class InterfaceAdapter extends AbstractAdapter {


    public void translate(String source, String target, String words) {
       super.translate(source,target,words);
    }
}
