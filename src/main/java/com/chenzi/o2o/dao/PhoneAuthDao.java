package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.PhoneAuth;

public interface PhoneAuthDao {
    int deleteByPrimaryKey(Integer phoneAuthId);

    int insert(PhoneAuth record);

    int insertSelective(PhoneAuth record);

    PhoneAuth selectByPrimaryKey(Integer phoneAuthId);

    int updateByPrimaryKeySelective(PhoneAuth record);

    int updateByPrimaryKey(PhoneAuth record);
}