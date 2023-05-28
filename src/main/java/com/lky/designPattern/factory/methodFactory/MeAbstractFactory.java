package com.lky.designPattern.factory.methodFactory;

import com.lky.designPattern.factory.common.BaoZi;

/**
 * @author Created by njy on 2023/5/28
 * 3.方法工厂模式：
 * 刚才说简单工厂模式违反了ocp原则，即开闭原则：对扩展开放，修改关闭
 * 于是，为了解决这个问题，就有了工厂方法模式
 * 工厂方法模式是一种更加抽象的工厂模式，它将工厂的职责抽象为接口，
 * 由具体的工厂实现创建具体的对象。
 * 工厂方法模式弱化了工厂的实现，使得每个工厂只负责一个产品的创建。
 */
public interface MeAbstractFactory {

    BaoZi createBaoZi();

}
