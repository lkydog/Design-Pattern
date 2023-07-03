package com.lky.designPattern.factory.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Created by njy on 2023/5/26
 * 猪肉包
 */
@AllArgsConstructor
@NoArgsConstructor
public class PorkBaoZi implements BaoZi{

    private String name;

    @Override
    public void prepare() {
        System.out.println("准备猪肉。。。。");
    }

    @Override
    public void make() {
        System.out.println("制作猪肉包。。。。");
    }

    @Override
    public void braise() {
        System.out.println("蒸猪肉包。。。。20分钟");
    }

    @Override
    public void sale() {
        System.out.println("卖猪肉包。。。。一个3元");
    }
}
