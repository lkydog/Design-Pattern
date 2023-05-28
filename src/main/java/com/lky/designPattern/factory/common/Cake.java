package com.lky.designPattern.factory.common;

/**
 * @author Created by njy on 2023/5/28
 */
public interface Cake {
    //准备材料
    void prepare();

    //制作蛋糕
    void make();

    //烘烤蛋糕
    void bake();

    //卖蛋糕
    void sale();
}
