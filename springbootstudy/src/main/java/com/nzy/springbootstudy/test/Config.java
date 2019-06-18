package com.nzy.springbootstudy.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Class1 classi1(){
        return new Class1(1);
    }
    @Bean
    public Class1 classi2(){
        return new Class1(2);
    }

    @Bean
    public Inject in(){
        return new Inject();
    }
}
