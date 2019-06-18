package com.nzy.springbootstudy.test;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Inject {
    @Resource(name = "classi1")
    private Class1 classi3;

    public void print(){
        classi3.print();
    }
}
