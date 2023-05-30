package com.lky.designPattern.test;

import com.lky.designPattern.proxy.cglib.CglibProxy;
import com.lky.designPattern.proxy.cglib.Landlord3Service;
import com.lky.designPattern.proxy.jdkProxy.JDKProxy;
import com.lky.designPattern.proxy.jdkProxy.Landlord2Service;
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
    private Tenant2Impl tenant2;

    @Autowired
    private Landlord3Service landlord3Service;

    //1.静态代理
    @Test
    void TestStatic(){

        String rent = tenant.rent(1000);
        System.out.println("rent = " + rent);
        System.out.println();
        String rent1 = proxy.rent(2000);
        System.out.println("rent1 = " + rent1);
    }

    //2.JDK动态代理
    @Test
    void TestJDK(){
        Landlord2Service proxyInstance = (Landlord2Service) new JDKProxy(tenant2).getProxyInstance();
        String rent = proxyInstance.rent(2500);
        System.out.println("rent = " + rent);
    }

    //3.Cglib代理
    @Test
    void TestCglib(){
        Landlord3Service proxyInstance = (Landlord3Service) new CglibProxy(landlord3Service).getProxyInstance();
        String rent = proxyInstance.rent(3000);
        System.out.println("rent = " + rent);
    }

}
