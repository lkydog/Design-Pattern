package com.lky.designPattern.factory.methodFactory;

import com.lky.designPattern.factory.common.BaoZi;
import com.lky.designPattern.factory.common.BeefBaoZi;

/**
 * @author Created by njy on 2023/5/28
 * 牛肉包
 */
public class BeefFactory implements MeAbstractFactory {
    @Override
    public BaoZi createBaoZi() {
        return new BeefBaoZi("牛肉包");
    }
}
