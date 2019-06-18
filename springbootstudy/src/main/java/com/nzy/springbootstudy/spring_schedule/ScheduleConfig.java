package com.nzy.springbootstudy.spring_schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.nzy.springbootstudy.spring_schedule")
@EnableScheduling
public class ScheduleConfig {
}
