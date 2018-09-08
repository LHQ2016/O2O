package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.Award;

public interface AwardDao {
    int deleteByPrimaryKey(Integer awardId);

    int insert(Award record);

    int insertSelective(Award record);

    Award selectByPrimaryKey(Integer awardId);

    int updateByPrimaryKeySelective(Award record);

    int updateByPrimaryKey(Award record);
}