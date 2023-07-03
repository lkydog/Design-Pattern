package com.lky.designPattern.factory.abstractFactory;

import com.lky.designPattern.factory.common.BaoZi;

/**
 * @author Created by njy on 2023/5/28
 * 4.抽象工厂模式
 * 假如老板的生意做大了，想拓展一下业务，开分店，并且卖包子的同时卖蛋糕
 * 那代码该怎么拓展呢，很简单，只需要在抽象工厂类中新增创建蛋糕的的抽象方法就行
 * 概念：
 * 抽象工厂模式是基于工厂方法模式的基础上进行的。在这种模式中，
 * 每一个工厂不再只负责一个产品的创建，而是负责一组产品的创建。
 * 抽象工厂模式将每个产品组都提取为一个接口，每个工厂都负责一个产品组。
 */
public interface AbstractFactory {
    BaoZi createBaoZi(String type);

    Cake createCake(String type);
}
