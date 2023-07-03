package com.lky.designPattern.factory.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Created by njy on 2023/5/26
 * 豆沙包
 */
@AllArgsConstructor
@NoArgsConstructor
public class DouShaBaoZi implements BaoZi{

    private String name;

    @Override
    public void prepare() {
        System.out.println("准备豆沙。。。。");
    }

    @Override
    public void make() {
        System.out.println("制作豆沙包。。。。");
    }

    @Override
    public void braise() {
        System.out.println("蒸豆沙包。。。。15分钟");
    }

    @Override
    public void sale() {
        System.out.println("卖豆沙包。。。。一个2元");
    }
}
