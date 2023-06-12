package com.lky.designPattern.test;

import com.lky.designPattern.adapter.classAdapter.ClassAdapter;
import com.lky.designPattern.adapter.interfaceAdapter.InterfaceAdapter;
import com.lky.designPattern.adapter.objectAdapter.ObjectAdapter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/6/8
 * 适配器模式测试类
 */
@SpringBootTest
public class TestAdapter {

    //类适配器
    @Test
    void classAdapter(){
        //创建一个类适配器对象
        ClassAdapter adapter=new ClassAdapter();
        adapter.translate("中文", "英文", "你好世界！");
        adapter.translate("英语","中文","hello world！");
    }

    //接口适配器
    @Test
    void interfaceAdapter(){
        InterfaceAdapter adapter=new InterfaceAdapter();
        adapter.translate("中文", "英文", "你好世界！");
        adapter.translate("英语","中文","hello world！");
    }

    //对象适配器
    @Test
    void ObjectAdapter(){
        ObjectAdapter adapter=new ObjectAdapter();
        adapter.translate("中文", "英文", "你好世界！");
        adapter.translate("英语","中文","hello world！");
    }
}
