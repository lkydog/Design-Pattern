package com.lky.designPattern.factory.methodFactory;

import com.lky.designPattern.factory.common.BaoZi;
import com.lky.designPattern.factory.common.PorkBaoZi;

/**
 * @author Created by njy on 2023/5/28
 */
public class PorkFactory implements MeAbstractFactory {
    @Override
    public BaoZi createBaoZi() {
        return new PorkBaoZi("猪肉包");
    }
}
