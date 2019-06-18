package com.nzy.miniapp.service;

import com.nzy.miniapp.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(int areaId);
}
