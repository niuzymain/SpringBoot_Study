package com.nzy.miniapp.controller;

import com.nzy.miniapp.entity.Area;
import com.nzy.miniapp.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    private Map<String, Object> listArea() {
        Map<String, Object> map = new HashMap<>();
        List<Area> areaList = areaService.queryArea();
//        int i = 1/0;
        map.put("arealist", areaList);
        return map;

    }

    @RequestMapping(value = "/getareabyid", method = RequestMethod.GET)
    private Map<String, Object> getAreaById(Integer areaId) {
        Map<String, Object> map = new HashMap<>();
        Area area = areaService.queryAreaById(areaId);
        map.put("area", area);
        return map;

    }

    @RequestMapping(value = "/addarea", method = RequestMethod.POST)
    private Map<String, Object> addArea(@RequestBody Area area) {
        Map<String, Object> map = new HashMap<>();
        int result = areaService.insertArea(area);
        if (result > 0) {
            map.put("success", true);

        } else {
            map.put("success", false);
        }
        return map;
    }

    @RequestMapping(value = "/modifyarea", method = RequestMethod.POST)
    private Map<String, Object> modifyArea(@RequestBody Area area) {
        Map<String, Object> map = new HashMap<>();
        int result = areaService.updateArea(area);
        if (result > 0) {
            map.put("success", true);
        } else {
            map.put("success", false);
        }
        return map;
    }

    @RequestMapping(value = "/deletearea", method = RequestMethod.GET)
    private Map<String, Object> deleteArea(Integer areaId) {
        Map<String, Object> map = new HashMap<>();
        int result = areaService.deleteArea(areaId);
        if (result > 0) {
            map.put("success", true);

        } else {
            map.put("success", false);
        }
        return map;
    }
}
