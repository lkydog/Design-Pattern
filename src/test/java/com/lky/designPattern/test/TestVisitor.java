package com.lky.designPattern.test;

import com.lky.designPattern.visitor.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/7/5
 * 访问者模式测试类
 */
@SpringBootTest
public class TestVisitor {

    @Test
    void testVisitor(){
        //创建对象结构
        SpotCollection spotCollection = new SpotCollection();
        //添加元素
        spotCollection.addSpot(new Relic());
        spotCollection.addSpot(new View());

        Tourist tourist = new Tourist();
        //景点接受游客的访问
        spotCollection.accept(tourist);
    }
}
