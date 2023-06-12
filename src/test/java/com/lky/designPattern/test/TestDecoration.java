package com.lky.designPattern.test;

import com.lky.designPattern.decoration.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/5
 * 装饰者模式测试类
 */
@SpringBootTest
public class TestDecoration {

    @Test
    void testDecoration(){
        QDecorator q=new QDecorator(new BlindMonk("李青"),"Q：天音波/回音击");
        WDecorator w=new WDecorator(q,"W：金钟罩/铁布衫");
        EDecorator e=new EDecorator(w,"E：天雷破/摧筋断骨");
        RDecorator r=new RDecorator(e,"R：猛龙摆尾");
        r.learnSkill();
    }
}
