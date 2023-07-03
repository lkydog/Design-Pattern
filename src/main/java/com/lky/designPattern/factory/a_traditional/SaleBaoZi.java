package com.lky.designPattern.factory.a_traditional;

import com.lky.designPattern.factory.common.*;

/**
 * @author Created by njy on 2023/5/26
 * 1.传统模式：就是平常代码的写法，以卖包子为例
 */
public class SaleBaoZi {

    /**
     * 包子肯定有不同的馅：酸菜、豆沙、猪肉，那么他的材料、售价等方式也不同
     * 我们可以直接在上述代码中，添加根据包子的不同种类生成不同的对象。
     */
    public BaoZi createBaoZi(String type) {

        BaoZi baoZi = null;
        switch (type){
            case "suancai":
                baoZi=new SuanCaiBaoZi();
                break;
            case "dousha":
                baoZi=new DouShaBaoZi();
                break;
            case "pork":
                baoZi=new PorkBaoZi();
                break;
            default:
                throw new IllegalArgumentException("Invalid BaoZi Type");
        }

        //准备材料
        baoZi.prepare();
        //制作包子
        baoZi.make();
        //蒸包子
        baoZi.braise();
        //售卖
        baoZi.sale();

        return baoZi;
    }
}
