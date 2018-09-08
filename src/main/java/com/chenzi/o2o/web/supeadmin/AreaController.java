package com.chenzi.o2o.web.supeadmin;

import com.chenzi.o2o.entity.Area;
import com.chenzi.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listArea() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Area> areaList = new ArrayList<>();
        try {
            areaList = areaService.getAreaList();
            modelMap.put("rows", areaList);
            modelMap.put("total", areaList.size());
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("succsee", false);
            modelMap.put("errorMsg", e.toString());
        }
        return modelMap;
    }
}
