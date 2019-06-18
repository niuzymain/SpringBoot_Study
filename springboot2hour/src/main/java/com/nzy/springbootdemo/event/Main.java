package com.nzy.springbootdemo.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.ProductMsg();
        context.close();
    }
}
