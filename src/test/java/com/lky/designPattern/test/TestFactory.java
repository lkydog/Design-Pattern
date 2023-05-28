package com.lky.designPattern.test;

import com.lky.designPattern.factory.a_traditional.SaleBaoZi;
import com.lky.designPattern.factory.abstractFactory.AbstractFactory;
import com.lky.designPattern.factory.abstractFactory.BJFactory;
import com.lky.designPattern.factory.common.BaoZi;
import com.lky.designPattern.factory.common.Cake;
import com.lky.designPattern.factory.methodFactory.MeAbstractFactory;
import com.lky.designPattern.factory.methodFactory.PorkFactory;
import com.lky.designPattern.factory.simpleFactory.SimpleFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/5/28
 * 工厂模式
 */
@SpringBootTest
public class TestFactory {

    //1.传统模式
    @Test
    void traditonal(){
        SaleBaoZi saleBaoZi=new SaleBaoZi();
        //以猪肉包为例
        saleBaoZi.sale("pork");
    }

    //2.简单工厂模式
    @Test
    void simpleFactory(){
        //以猪肉包为例
        BaoZi pork = SimpleFactory.createBaoZi("pork");
        pork.prepare();
        pork.make();
        pork.braise();
        pork.sale();
    }

    //3.方法工厂模式
    @Test
    void methodFactory(){
        MeAbstractFactory factory=new PorkFactory();
        BaoZi pork = factory.createBaoZi();
        pork.prepare();
        pork.make();
        pork.braise();
        pork.sale();
    }

    //4.抽象工厂模式
    @Test
    void abstractFactory(){
        AbstractFactory factory=new BJFactory();
        Cake apple = factory.createCake("apple");
        BaoZi pork = factory.createBaoZi("pork");

        apple.prepare();
        apple.make();
        apple.bake();
        apple.sale();

        pork.prepare();
        pork.make();
        pork.braise();
        pork.sale();
    }
}
