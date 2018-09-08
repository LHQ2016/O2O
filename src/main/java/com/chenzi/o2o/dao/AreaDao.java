package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.Area;

import java.util.List;

public interface AreaDao {
    int deleteByPrimaryKey(Integer areaId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer areaId);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

    List<Area> queryArea();
}