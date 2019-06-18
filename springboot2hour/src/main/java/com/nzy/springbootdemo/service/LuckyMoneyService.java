package com.nzy.springbootdemo.service;

import com.nzy.springbootdemo.dao.LuckymoneyDao;
import com.nzy.springbootdemo.entity.Luckymoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@Transactional
public class LuckyMoneyService {
    @Autowired
    private LuckymoneyDao luckymoneyDao;

    public void createTwo(){
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setSender("aa");
        luckymoney1.setMoney(new BigDecimal("5555"));
        luckymoneyDao.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setSender("aa");
        luckymoney2.setMoney(new BigDecimal("aaaa"));
        luckymoneyDao.save(luckymoney2);
    }
}
