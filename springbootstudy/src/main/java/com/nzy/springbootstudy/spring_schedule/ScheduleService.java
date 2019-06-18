package com.nzy.springbootstudy.spring_schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduleService {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 2000)
    public void repeat() {
        System.out.println("2s execute" + sdf.format(new Date()));
    }
}
