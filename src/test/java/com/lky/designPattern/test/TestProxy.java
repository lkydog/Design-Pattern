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

    //1.静态代理，对象只能实现一个接口
    @Test
    void TestStatic(){

        String rent = tenant.rent(1000);
        System.out.println("rent = " + rent);
        System.out.println();
        String rent1 = proxy.rent(2000);
        System.out.println("rent1 = " + rent1);
    }

    //2.JDK动态代理,对象可以实现一个或多个接口
    @Test
    void TestJDK(){
        Landlord2Service proxyInstance1 = (Landlord2Service) new JDKProxy(teant1).getProxyInstance();
        String rent1 = proxyInstance1.rent(500);
        System.out.println("rent1 = " + rent1);
        System.out.println();
        Landlord2Service proxyInstance2 = (Landlord2Service) new JDKProxy(tenant2).getProxyInstance();
        String rent2 = proxyInstance2.rent(2500);
        System.out.println("rent2 = " + rent2);



    }

    //3.Cglib代理 没有实现接口
    @Test
    void TestCglib(){
        Landlord3Service proxyInstance = (Landlord3Service) new CglibProxy(landlord3Service).getProxyInstance();
        String rent = proxyInstance.rent(3000);
        System.out.println("rent = " + rent);
    }

}
