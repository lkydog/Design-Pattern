package com.lky.designPattern.factory.common;

/**
 * @author Created by njy on 2023/5/26
 * 包子
 */
public class BaoZiImpl implements BaoZi{
    @Override
    public void prepare() {
        System.out.println("准备材料。。。。");
    }

    @Override
    public void make() {
        System.out.println("制作包子。。。。");
    }

    @Override
    public void braise() {
        System.out.println("蒸包子。。。。");
    }

    @Override
    public void sale() {
        System.out.println("卖包子。。。。");
    }
}
