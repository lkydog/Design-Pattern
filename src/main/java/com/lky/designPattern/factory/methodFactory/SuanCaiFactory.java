package com.lky.designPattern.factory.methodFactory;

import com.lky.designPattern.factory.common.BaoZi;
import com.lky.designPattern.factory.common.SuanCaiBaoZi;

/**
 * @author Created by njy on 2023/5/28
 * 酸菜包
 */
public class SuanCaiFactory implements MeAbstractFactory {
    @Override
    public BaoZi createBaoZi() {
        return new SuanCaiBaoZi("酸菜包");
    }
}
