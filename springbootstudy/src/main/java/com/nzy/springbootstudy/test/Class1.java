package com.nzy.springbootstudy.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

//@Component
public class Class1{
    private int i;

    public Class1(int i) {
        super();
        this.i = i;
    }

    public void print() {

        System.out.println("i=" + i);

    }
}
