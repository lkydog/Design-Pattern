package com.lky.designPattern.test;

import com.lky.designPattern.proxy.cglib.CglibProxy;
import com.lky.designPattern.proxy.cglib.Landlord3Service;
import com.lky.designPattern.proxy.jdkProxy.JDKProxy;
import com.lky.designPattern.proxy.jdkProxy.Landlord2Service;
import com.lky.designPattern.proxy.jdkProxy.Teant1Impl;
import com.lky.designPattern.proxy.jdkProxy.Tenant2Impl;
import com.lky.designPattern.proxy.staticProxy.Landlord1Service;
import com.lky.designPattern.proxy.staticProxy.ProxyImpl;
import com.lky.designPattern.proxy.staticProxy.TenantImpl;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Created by njy on 2023/5/30
 * 代理模式
 */
@SpringBootTest
@RequiredArgsConstructor
public class TestProxy {


    @Autowired
    private TenantImpl tenant;

    @Autowired
    private ProxyImpl proxy;

    @Autowired
    private Teant1Impl teant1;

    @Autowired
    private Tenant2Impl tenant2;

    @Autowired
    private Landlord3Service landlord3Service;

    //1.静态代理
    @Test
    void TestStatic(){
        tenant.rent(1000);
        System.out.println();
        proxy.rent(2000);
    }

    //2.JDK动态代理
    @Test
    void TestJDK(){
        Landlord2Service proxyInstance1 = (Landlord2Service) new JDKProxy(teant1).getProxyInstance();
        proxyInstance1.rent(2500);

        System.out.println();
        Landlord2Service proxyInstance2 = (Landlord2Service) new JDKProxy(tenant2).getProxyInstance();
        proxyInstance2.rent(2500);
    }

    //3.Cglib代理
    @Test
    void TestCglib(){
        Landlord3Service proxyInstance = (Landlord3Service) new CglibProxy(landlord3Service).getProxyInstance();
        proxyInstance.rent(3000);
    }

}
