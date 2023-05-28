package com.lky.designPattern.factory.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Created by njy on 2023/5/28
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppleCake implements Cake{
    private String name;

    @Override
    public void prepare() {
        System.out.println("准备苹果。。。。");
    }

    @Override
    public void make() {
        System.out.println("制作苹果蛋糕。。。。");
    }

    @Override
    public void bake() {
        System.out.println("烘烤蛋糕。。。。15分钟");
    }

    @Override
    public void sale() {
        System.out.println("卖苹果蛋糕。。。。一个6元");
    }
}
