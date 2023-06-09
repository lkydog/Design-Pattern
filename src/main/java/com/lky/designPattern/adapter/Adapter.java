package com.lky.designPattern.adapter;

/**
 * @author Created by njy on 2023/6/8
 * 适配器：我们需要将`Translator`对象的接口转换成`Target`接口，
 * 以便客户端可以使用`Target`接口定义的方法。
 */
public class Adapter implements Target{

    private Translator translator;

    public Adapter(Translator translator){
        this.translator=translator;
    }

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
