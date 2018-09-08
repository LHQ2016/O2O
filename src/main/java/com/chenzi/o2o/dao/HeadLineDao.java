package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.HeadLine;

public interface HeadLineDao {
    int deleteByPrimaryKey(Integer lineId);

    int insert(HeadLine record);

    int insertSelective(HeadLine record);

    HeadLine selectByPrimaryKey(Integer lineId);

    int updateByPrimaryKeySelective(HeadLine record);

    int updateByPrimaryKey(HeadLine record);
}