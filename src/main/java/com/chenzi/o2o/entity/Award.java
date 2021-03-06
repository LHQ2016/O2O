package com.chenzi.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Award {
    private Integer awardId;

    private String awardName;

    private String awardDesc;

    private String awardImg;

    private Integer point;

    private Integer priority;

    private Date createTime;

    private Date expireTime;

    private Date lastEditTime;

    private Integer enableStatus;

    private Integer shopId;
}