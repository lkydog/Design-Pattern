package com.lky.designPattern.test;

import com.lky.designPattern.facade.TravelFacade;
import com.lky.designPattern.facade.TravelFacadeImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/14
 * 外观模式测试
 */
@SpringBootTest
public class TestFacade {

    //客户端
    @Test
    void testFacade(){
        TravelFacade travelFacade=new TravelFacadeImpl();
        travelFacade.dePart();
        System.out.println("-------出发-----------");
    }
}
