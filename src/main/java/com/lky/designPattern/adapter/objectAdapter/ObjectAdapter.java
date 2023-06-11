package com.lky.designPattern.adapter.objectAdapter;

import com.lky.designPattern.adapter.Target;
import com.lky.designPattern.adapter.Translator;

/**
 * @author Created by njy on 2023/6/11
 * 对象适配器：使用组合的方式
 */
public class ObjectAdapter implements Target {

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
}
