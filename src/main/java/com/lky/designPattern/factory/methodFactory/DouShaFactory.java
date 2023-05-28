package com.lky.designPattern.factory.methodFactory;

import com.lky.designPattern.factory.common.BaoZi;
import com.lky.designPattern.factory.common.DouShaBaoZi;

/**
 * @author Created by njy on 2023/5/28
 * 豆沙包
 */
public class DouShaFactory implements MeAbstractFactory {
    @Override
    public BaoZi createBaoZi() {
        return new DouShaBaoZi("豆沙包");
    }
}
