package com.nzy.springbootdemo.dao;

import com.nzy.springbootdemo.entity.Luckymoney;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LuckymoneyDao extends JpaRepository<Luckymoney,Integer> {
}
