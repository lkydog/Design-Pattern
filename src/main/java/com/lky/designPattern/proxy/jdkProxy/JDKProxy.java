package com.lky.designPattern.proxy.jdkProxy;

import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理：就是把代理抽象了一下，可以理解为中介公司（factory）
 * @author Created by njy on 2023/5/30
 */
public class JDKProxy {

    private Object target;

    public JDKProxy(Object target){
        this.target=target;
    }

    /**
     * 给目标对象生成代理对象
     * @return 代理生成的对象
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                //这里是要实现jdk代理InvocationHandler的接口，lambda表达式
                (proxy,method,args)->{
                    //执行对象方法
                    System.out.println("[JDK动态代理]好嘞，我去接您");
                    Object returnValue=method.invoke(target,args);
                    System.out.println("[JDK动态代理]小伙，这个房子很不错呦！");
                    return returnValue;
                });
    }
}
