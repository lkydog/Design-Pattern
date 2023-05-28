package com.lky.designPattern.factory.simpleFactory;

import com.lky.designPattern.factory.common.*;

/**
 * @author Created by njy on 2023/5/28
 * 2.简单工厂方法:希望能够创建一个对象，但创建过程比较复杂，希望对外隐藏这些细节
 * 简单工厂根据客户端的需求创建具体的实例，这种模式对调用者隐藏了实例的创建过程，也使得创建过程更加的容易维护。
 */
public class SimpleFactory {

    public static BaoZi createBaoZi(String type){

        BaoZi baoZi=null;
        switch (type){
            case "suancai":
                baoZi=new SuanCaiBaoZi("酸菜包");
                break;
            case "dousha":
                baoZi=new DouShaBaoZi("豆沙包");
                break;
            case "pork":
                baoZi=new PorkBaoZi("猪肉包");
            case "beef":
                //老板拓展业务了，新加了一个牛肉包类型的包子，那对于简单工厂模式而言，
                //于是就得修改源代码，那么就违反了ocp原则，假如新增100个？
                baoZi=new BeefBaoZi("牛肉包");
                break;
            default:
                throw new IllegalArgumentException("Invalid BaoZi Type");
        }

        return baoZi;
    }
}
