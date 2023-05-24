package com.lky.designPattern.singleton.hungry;


/**
 * @author Created by njy on 2023/5/24
 * 饿汉：在类刚一初始化的时候就立即把单例对象创建出来,下面两种都是饿汉模式的实现
 */
public class Singleton {

    private Singleton() {}

    private static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }


    private static Singleton instance1=null;
    static {
        instance1=new Singleton();
    }
    public Singleton getInstance1(){
        return instance1;
    }

}

