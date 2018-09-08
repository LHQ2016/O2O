package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.ShopAuthMap;

public interface ShopAuthMapDao {
    int deleteByPrimaryKey(Integer shopAuthId);

    int insert(ShopAuthMap record);

    int insertSelective(ShopAuthMap record);

    ShopAuthMap selectByPrimaryKey(Integer shopAuthId);

    int updateByPrimaryKeySelective(ShopAuthMap record);

    int updateByPrimaryKey(ShopAuthMap record);
}