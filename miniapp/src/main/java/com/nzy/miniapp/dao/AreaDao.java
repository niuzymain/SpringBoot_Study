package com.nzy.miniapp.dao;

import com.nzy.miniapp.entity.Area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaDao {
    List<Area> queryArea();

    Area queryAreaById(@Param("areaid") int areaId);

    int insertArea(@Param("area") Area area);

    int updateArea(@Param("area")Area area);

    int deleteArea(@Param("areaid")int areaId);
}
