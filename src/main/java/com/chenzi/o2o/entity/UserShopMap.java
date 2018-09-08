package com.chenzi.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserShopMap {
    private Integer userShopId;

    private Integer userId;

    private Integer shopId;

    private String userName;

    private String shopName;

    private Date createTime;

    private Integer point;
}