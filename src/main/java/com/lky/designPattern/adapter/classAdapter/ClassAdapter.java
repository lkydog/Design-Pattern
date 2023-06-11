package com.lky.designPattern.adapter.classAdapter;

import com.lky.designPattern.adapter.Target;
import com.lky.designPattern.adapter.Translator;

/**
 * @author Created by njy on 2023/6/11
 * 类适配器：通过多重继承目标接口和被适配者类方式来实现适配
 */
public class ClassAdapter extends Translator implements Target {

    @Override
    public void translate(String source, String target, String words) {
        if("中文".equals(source) && "英文".equals(target)) {
            //汉--》英
            this.translateInEn(words);
        } else {
            //英--》汉
            this.translateInZh(words);
        }
    }
}
