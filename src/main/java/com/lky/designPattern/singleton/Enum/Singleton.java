package com.lky.designPattern.singleton.Enum;

/**
 * @author Created by njy on 2023/5/24
 * 枚举实现
 * 这种方式还没有被广泛采用，但是这种是实现单例的最佳方式。
 * 线程安全，自动支持序列化机制，防止反序列化重新创建心的对象，绝对防止多次实例化
 */
public enum Singleton {
    INSTANCE;
    public void whateverMethod(){
        System.out.println("单例模式实现的最佳方式");
    }
}
