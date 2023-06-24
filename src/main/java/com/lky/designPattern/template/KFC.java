package com.lky.designPattern.template;

/**
 * @author Created by njy on 2023/6/24
 * 具体类（Concrete Class）：KFC
 */
public class KFC extends OrderFood{
    @Override
    public void selectFood() {
        System.out.println("一份汉堡炸鸡四件套");
    }
}
