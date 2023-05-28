package com.lky.designPattern.factory.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Created by njy on 2023/5/26
 * 酸菜包
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuanCaiBaoZi implements BaoZi {

    private String name;

    @Override
    public void prepare() {
        System.out.println("准备酸菜。。。。。");
    }

    @Override
    public void make() {
        System.out.println("制作酸菜包。。。。");
    }

    @Override
    public void braise() {
        System.out.println("蒸酸菜包。。。。10分钟");
    }

    @Override
    public void sale() {
        System.out.println("卖酸菜包。。。一个1.5元");
    }
}
