package com.chenzi.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAwardMap {
    private Integer userAwardId;

    private Integer userId;

    private Integer awardId;

    private Integer shopId;

    private String userName;

    private String awardName;

    private Date expireTime;

    private Date createTime;

    private Integer usedStatus;

    private Integer point;
}