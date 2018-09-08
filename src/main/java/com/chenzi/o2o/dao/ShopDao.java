package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.Shop;

public interface ShopDao {
    int deleteByPrimaryKey(Integer shopId);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer shopId);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}