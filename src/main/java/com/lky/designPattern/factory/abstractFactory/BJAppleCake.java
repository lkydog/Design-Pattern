package com.lky.designPattern.factory.abstractFactory;

import com.lky.designPattern.factory.common.Cake;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Created by njy on 2023/5/28
 * 北京苹果蛋糕
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BJAppleCake implements Cake {

    private String name;
    @Override
    public void prepare() {

    }

    @Override
    public void make() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void sale() {

    }
}
