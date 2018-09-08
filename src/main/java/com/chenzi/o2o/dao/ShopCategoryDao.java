package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.ShopCategory;

public interface ShopCategoryDao {
    int deleteByPrimaryKey(Integer shopCategoryId);

    int insert(ShopCategory record);

    int insertSelective(ShopCategory record);

    ShopCategory selectByPrimaryKey(Integer shopCategoryId);

    int updateByPrimaryKeySelective(ShopCategory record);

    int updateByPrimaryKey(ShopCategory record);
}