package com.lky.designPattern.singleton.staticInner;

/**
 * @author Created by njy on 2023/5/24
 * 静态内部类
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
