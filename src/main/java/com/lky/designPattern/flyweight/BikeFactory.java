package com.lky.designPattern.flyweight;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Created by njy on 2023/6/21
 * 3.享元工厂类（FlyWeightFactory）：单车工厂
 */
public class BikeFactory {


    public static Map<String,Bike> bikeMap=new HashMap<>();

    public static Bike getBike(String color,String type){
        String key=color+"_"+type;
        if(bikeMap.containsKey(key)){
            //如果已经有该颜色和类型的单车，直接返回
            return bikeMap.get(key);
        }else {
            Bike bike=null;
            //没有，创建并放入缓存
            if("mobike".equals(type)){
                bike=new Mobike(color,1);
            }else if ("MT".equals(type)){
                bike=new MTBike(color,2);
            }else {
                System.out.println("抛异常！没有该类型的单车");
            }
            //放入缓存
            bikeMap.put(key,bike);
            return bike;
        }
    }
}
