package com.lky.designPattern.factory.abstractFactory;

import com.lky.designPattern.factory.common.BaoZi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Created by njy on 2023/5/28
 * 北京牛肉包
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BJBeefBao implements BaoZi {

    private String name;
    @Override
    public void prepare() {

    }

    @Override
    public void make() {

    }

    @Override
    public void braise() {

    }

    @Override
    public void sale() {

    }
}
