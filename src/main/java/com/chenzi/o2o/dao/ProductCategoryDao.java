package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.ProductCategory;

public interface ProductCategoryDao {
    int deleteByPrimaryKey(Integer productCategoryId);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer productCategoryId);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
}