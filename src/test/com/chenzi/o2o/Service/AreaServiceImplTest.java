package com.chenzi.o2o.Service;

import com.chenzi.o2o.BaseTest;
import com.chenzi.o2o.entity.Area;
import com.chenzi.o2o.service.AreaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaServiceImplTest extends BaseTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area> areaList =  areaService.getAreaList();
        System.out.println(areaList.size());
    }
}
