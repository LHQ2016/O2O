package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.LocalAuth;

public interface LocalAuthDao {
    int deleteByPrimaryKey(Integer localAuthId);

    int insert(LocalAuth record);

    int insertSelective(LocalAuth record);

    LocalAuth selectByPrimaryKey(Integer localAuthId);

    int updateByPrimaryKeySelective(LocalAuth record);

    int updateByPrimaryKey(LocalAuth record);
}