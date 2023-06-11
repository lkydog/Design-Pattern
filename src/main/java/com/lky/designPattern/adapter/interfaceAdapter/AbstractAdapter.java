package com.lky.designPattern.adapter.interfaceAdapter;

import com.lky.designPattern.adapter.Translator;

/**
 * @author Created by njy on 2023/6/8
 * AdapterTranslate抽象类
 */
public abstract class AbstractAdapter implements target2 {

    private Translator translator=new Translator();

    @Override
    public void translate(String source, String target, String words) {
        if("中文".equals(source) && "英文".equals(target)) {
            //汉--》英
            translator.translateInEn(words);
        } else {
            //英--》汉
            translator.translateInZh(words);
        }
    }

    @Override
    public void a() {

    }
}
