package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.UserShopMap;

public interface UserShopMapDao {
    int deleteByPrimaryKey(Integer userShopId);

    int insert(UserShopMap record);

    int insertSelective(UserShopMap record);

    UserShopMap selectByPrimaryKey(Integer userShopId);

    int updateByPrimaryKeySelective(UserShopMap record);

    int updateByPrimaryKey(UserShopMap record);
}