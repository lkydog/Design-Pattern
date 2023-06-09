package com.lky.designPattern.test;

import com.lky.designPattern.adapter.Adapter;
import com.lky.designPattern.adapter.Target;
import com.lky.designPattern.adapter.Translator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/8
 */
@SpringBootTest
public class TestAdapter {


    @Test
    void testAdapter(){
        Translator translator = new Translator();
        Target adapter = new Adapter(translator);
        //汉--》英
        adapter.translate("中文", "英文", "你好世界！");
        adapter.translate("英语","中文","hello world！");
    }
}
