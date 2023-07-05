package com.lky.designPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by njy on 2023/7/4
 * 5.对象结构（Object Structure）
 * 定义：包含元素角色的容器，提供让访问者对象遍历容器中的所有元素的方法，通常由 List、Set、Map 等聚合类实现。
 */
public class SpotCollection {
    private List<Spot> spots = new ArrayList<>();

    //添加元素
    public void addSpot(Spot spot) {
        spots.add(spot);
    }

    public void accept(Visitor visitor) {
        for (Spot spot : spots) {
            spot.accept(visitor);
        }
    }
}
