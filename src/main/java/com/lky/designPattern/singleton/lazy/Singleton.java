package com.lky.designPattern.singleton.lazy;

import java.time.chrono.IsoChronology;

/**
 * @author Created by njy on 2023/5/24
 * 懒汉：懒加载，就是在需要的时候才回去创建对象
 */
public class Singleton {

    private Singleton() {
    }


    /**
     * 1.单例模式【线程不安全,不推荐】
     * 因为没有加锁synchronized，严格意义上不算单例。
     * @return
     */
    private static Singleton instance1;

    public static Singleton getInstance() {
        if (instance1 == null) {//这里是不安全的，可能得到两个不同的实例
            instance1 = new Singleton();
        }
        return instance1;
    }


    /**
     * 2.线程安全但效率低【不推荐】
     * 99%的情况下不需要同步
     * @return
     */
    private static Singleton instance2;

    public static synchronized Singleton getInstance1() {
        if (instance2 == null) {
            instance2 = new Singleton();
        }
        return instance2;
    }

    /**
     * 3.单例模式，线程不安全【不推荐】
     * 虽然加了锁，但是等到第一个线程执行完instance2=new Singleton();跳出锁时
     * 令一个线程恰好刚判断完instance2为null，此时又会加载另一个实例
     */
    private static Singleton instance3;

    public static Singleton getInstance2() {
        if (instance3 == null) {
            synchronized (Singleton.class) {//不安全
                instance3 = new Singleton();
            }
        }
        return instance3;
    }

    /**
     * 4.双重校验锁：延迟加载+线程安全【推荐】
     */
    private static volatile Singleton instance4;

    public static Singleton getInstance4() {
        if (instance4 == null) {
            synchronized (Singleton.class) {
                if (instance4 == null) {
                    instance4 = new Singleton();
                }
            }
        }
        return instance4;
    }
}
