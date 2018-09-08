package com.chenzi.o2o.dao;

import com.chenzi.o2o.entity.WeChatAuth;

public interface WeChatAuthDao {
    int deleteByPrimaryKey(Integer weChatAuthId);

    int insert(WeChatAuth record);

    int insertSelective(WeChatAuth record);

    WeChatAuth selectByPrimaryKey(Integer weChatAuthId);

    int updateByPrimaryKeySelective(WeChatAuth record);

    int updateByPrimaryKey(WeChatAuth record);
}