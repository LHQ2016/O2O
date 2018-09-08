package com.chenzi.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserProductMap {
    private Integer userProductId;

    private Integer userId;

    private Integer productId;

    private Integer shopId;

    private String userName;

    private String productName;

    private Date createTime;

    private Integer point;
}