package com.lky.designPattern.decoration;

import lombok.Data;

/**
 * @author Created by njy on 2023/6/6
 * 盲僧
 */
@Data
public class BlindMonk implements Hero{

    private String name;

    public BlindMonk(String name){
        this.name=name;
    }

    @Override
    public void learnSkill() {
        System.out.println(getName());
    }
}
