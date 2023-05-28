package com.lky.designPattern.factory.common;

/**
 * @author Created by njy on 2023/5/26
 * 包子接口类
 */
public interface BaoZi {

    //准备材料
    void prepare();

    //制作包子
    void make();

    //蒸包子
    void braise();

    //卖包子
    void sale();
}
