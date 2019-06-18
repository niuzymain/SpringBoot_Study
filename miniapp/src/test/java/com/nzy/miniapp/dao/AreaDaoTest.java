package com.nzy.miniapp.dao;

import com.nzy.miniapp.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        for (Area a:areaList) {
            System.out.println(a.toString());
        }
    }

    @Test
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
        System.out.println(area.toString());
    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("area2");
        area.setPriority(1);
        int result = areaDao.insertArea(area);
        assertEquals(1,result);
    }

    @Test
    public void updateArea() {
        Area area = new Area();
        area.setAreaName("area2");
        area.setAreaId(2);
        int result = areaDao.updateArea(area);
        assertEquals(1,result);
    }

    @Test
    public void deleteArea() {
    }
}