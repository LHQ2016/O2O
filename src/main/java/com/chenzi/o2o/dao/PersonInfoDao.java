package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.PersonInfo;

public interface PersonInfoDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(PersonInfo record);

    int insertSelective(PersonInfo record);

    PersonInfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(PersonInfo record);

    int updateByPrimaryKey(PersonInfo record);
}