package com.nzy.miniapp.service.Impl;

import com.nzy.miniapp.entity.Area;
import com.nzy.miniapp.service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceImplTest {
    @Autowired
    private AreaService areaService;

    @Test
    public void queryArea() {
    }

    @Test
    public void queryAreaById() {
    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("area5");
        area.setPriority(1);
        int result = areaService.insertArea(area);
        assertEquals(1,result);
    }

    @Test
    public void updateArea() {
        Area area = new Area();
        area.setAreaName("area6");
        area.setAreaId(5);
        int result = areaService.insertArea(area);
        assertEquals(1,result);
    }

    @Test
    public void deleteArea() {
    }
}