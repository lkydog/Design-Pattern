package com.lky.designPattern.factory.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Created by njy on 2023/5/28
 */
@NoArgsConstructor
@AllArgsConstructor
public class BeefBaoZi implements BaoZi{

    private String name;

    @Override
    public void prepare() {
        System.out.println("准备牛肉。。。。");
    }

    @Override
    public void make() {
        System.out.println("制作牛肉包。。。。");
    }

    @Override
    public void braise() {
        System.out.println("蒸牛肉包。。。。20分钟");
    }

    @Override
    public void sale() {
        System.out.println("卖牛肉包。。。。一个4元");
    }
}
