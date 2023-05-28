package com.lky.designPattern.factory.abstractFactory;

import com.lky.designPattern.factory.common.Cake;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Created by njy on 2023/5/28
 * 北京梨味蛋糕
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BJPearCake implements Cake {

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
