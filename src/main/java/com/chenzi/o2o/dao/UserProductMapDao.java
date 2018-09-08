package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.UserProductMap;

public interface UserProductMapDao {
    int deleteByPrimaryKey(Integer userProductId);

    int insert(UserProductMap record);

    int insertSelective(UserProductMap record);

    UserProductMap selectByPrimaryKey(Integer userProductId);

    int updateByPrimaryKeySelective(UserProductMap record);

    int updateByPrimaryKey(UserProductMap record);
}