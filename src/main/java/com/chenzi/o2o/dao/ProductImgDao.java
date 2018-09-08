package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.ProductImg;

public interface ProductImgDao {
    int deleteByPrimaryKey(Integer productImgId);

    int insert(ProductImg record);

    int insertSelective(ProductImg record);

    ProductImg selectByPrimaryKey(Integer productImgId);

    int updateByPrimaryKeySelective(ProductImg record);

    int updateByPrimaryKey(ProductImg record);
}