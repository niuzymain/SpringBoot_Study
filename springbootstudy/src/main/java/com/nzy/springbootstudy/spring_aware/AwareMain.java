package com.nzy.springbootstudy.spring_aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.print();

    }
}
