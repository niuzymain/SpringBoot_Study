package com.nzy.miniapp.service.Impl;

import com.nzy.miniapp.dao.AreaDao;
import com.nzy.miniapp.entity.Area;
import com.nzy.miniapp.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> queryArea() {
        return areaDao.queryArea();
    }

    @Override
    public Area queryAreaById(int areaId) {
//        int i = 1/0;
        return areaDao.queryAreaById(areaId);
    }

    @Override
    @Transactional
    public int insertArea(Area area) {
        int result = 0;
        if (area.getAreaName() != null && !area.getAreaName().equals("")) {
            try{
                result = areaDao.insertArea(area);
//                int a = 1/0;
                if (result > 0) {
                    return 1;
                } else {
                    throw new RuntimeException("插入失败");
                }
            }catch (Exception e){
                throw new RuntimeException("插入错误"+e.getMessage());
            }
        } else {
            throw new RuntimeException("值为空");
        }
    }

    @Override
    public int updateArea(Area area) {
        int result = 0;
        if (area.getAreaId() != null && area.getAreaId() != 0) {
            try{
                result = areaDao.updateArea(area);
                if (result > 0) {
                    return result;
                } else {
                    throw new RuntimeException("更新失败");
                }
            }catch (Exception e){
                throw new RuntimeException("更新错误"+e.getMessage());
            }
        } else {
            throw new RuntimeException("值为空");
        }
    }

    @Override
    public int deleteArea(int areaId) {
        int result = 0;
        if (areaId > 0) {
            try{
                result = areaDao.deleteArea(areaId);
                if (result > 0) {
                    return result;
                } else {
                    throw new RuntimeException("删除失败");
                }
            }catch (Exception e){
                throw new RuntimeException("删除错误"+e.getMessage());
            }
        } else {
            throw new RuntimeException("值为空");
        }
    }
}
