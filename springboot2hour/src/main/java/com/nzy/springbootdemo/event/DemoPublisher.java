package com.nzy.springbootdemo.event;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
    @Autowired
    private ApplicationContext applicationContext;

    public DemoPublisher(DemoListener demoListener){
        System.out.println("construct"+demoListener.toString());
    }

    public void ProductMsg() throws InterruptedException {
        applicationContext.publishEvent(new DemoEvent(this,"this is msg"));
        Thread.sleep(1000l);
    }
}
