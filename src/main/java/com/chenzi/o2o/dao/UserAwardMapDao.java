package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.UserAwardMap;

public interface UserAwardMapDao {
    int deleteByPrimaryKey(Integer userAwardId);

    int insert(UserAwardMap record);

    int insertSelective(UserAwardMap record);

    UserAwardMap selectByPrimaryKey(Integer userAwardId);

    int updateByPrimaryKeySelective(UserAwardMap record);

    int updateByPrimaryKey(UserAwardMap record);
}