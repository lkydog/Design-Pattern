package com.lky.designPattern.builder;

import lombok.Data;

/**
 * @author Created by njy on 2023/6/12
 * 1.产品类（Product）
 */
@Data
public class Meal {

    //汉堡包
    private String burger;

    //薯条
    private String fries;

    //饮料
    private String drink;
}
