package com.lky.designPattern.proxy.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * JDKProxy：cglib子类代理工厂
 * 1.需要引入cglib的jar文件，但是spring的核心包已经包括了Cglib功能，所以直接引入spring-core-3.25.jar即可
 * 2.引入功能包后，就可以在内存中动态构建子类
 * 3.代理的类不能为final
 * 4.目标对象的方法如果为final/static，那么就不会被拦截，也不会执行目标对象的业务方法
 * @author Created by njy on 2023/5/30
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * 目标对象
     */
    private final Object target;

    public CglibProxy(Object target){
        this.target=target;
    }

    public Object getProxyInstance(){
        //1.工具类
        Enhancer en=new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类（代理对象）
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("[Cglib代理]好嘞，我去接您");
        Object returnValue = method.invoke(target, objects);
        System.out.println("[Cglib代理]这个房子真的很不错呦！");
        return returnValue;
    }
}
