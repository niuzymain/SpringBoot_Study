package com.nzy.springbootdemo.controller;

import com.nzy.springbootdemo.dao.LuckymoneyDao;
import com.nzy.springbootdemo.entity.Luckymoney;
import com.nzy.springbootdemo.service.LuckyMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class MoneyController {
    @Autowired
    private LuckymoneyDao luckymoneyDao;

    @Autowired
    private LuckyMoneyService luckyMoneyService;

    @GetMapping("/luckymoneys")
    public List<Luckymoney> getMoneyList(){
        return luckymoneyDao.findAll();
    }

    @PostMapping("/luckymoneys")
    public Luckymoney createMoney(@RequestParam("sender")String sender, @RequestParam("money") BigDecimal money){
        Luckymoney luckymoney = new Luckymoney();
        luckymoney.setMoney(money);
        luckymoney.setSender(sender);
        return luckymoneyDao.save(luckymoney);
    }

    @GetMapping("/luckymoneys/{id}")
    public Luckymoney getMoneyById(@PathVariable("id") Integer id){
        return luckymoneyDao.findById(id).orElse(null);
    }

    @PutMapping("/luckymoneys/{id}")
    public Luckymoney updateLuckyMondey(@PathVariable("id") Integer id,@RequestParam("receiver") String receiver){
        Optional<Luckymoney> optional = luckymoneyDao.findById(id);
        if(optional.isPresent()){
            Luckymoney luckymoney = optional.get();
            luckymoney.setReceiver(receiver);
            return luckymoneyDao.save(luckymoney);
        }
        else{
            return null;
        }

    }

    @PostMapping("/luckymoneys/two")
    public Map<String,Object> twoLuckyMoney(){
        luckyMoneyService.createTwo();
        Map<String,Object> map = new HashMap<>();
        map.put("success",true);
        return map;
    }
}
