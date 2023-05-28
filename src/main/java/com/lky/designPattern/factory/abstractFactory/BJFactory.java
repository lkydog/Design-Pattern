package com.lky.designPattern.factory.abstractFactory;

import com.lky.designPattern.factory.common.BaoZi;
import com.lky.designPattern.factory.common.BeefBaoZi;
import com.lky.designPattern.factory.common.Cake;

/**
 * @author Created by njy on 2023/5/28
 * 北京分店
 */
public class BJFactory implements AbstractFactory{
    @Override
    public BaoZi createBaoZi(String type) {
        BaoZi baoZi=null;
        switch (type){
            case "beef":
                baoZi=new BJBeefBao("北京牛肉包");
                break;
            case "pork":
                baoZi=new BJPorkBao("北京猪肉包");
            default:
                break;
        }
        return baoZi;
    }

    @Override
    public Cake createCake(String type) {
        Cake cake=null;
        switch (type){
            case "apple":
                cake=new BJAppleCake("北京苹果蛋糕");
                break;
            case "pear":
                cake=new BJPearCake("北京梨味蛋糕");
            default:
                break;
        }
        return cake;
    }
}
