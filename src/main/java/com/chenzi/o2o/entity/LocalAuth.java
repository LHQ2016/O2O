package com.chenzi.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalAuth {
    private Integer localAuthId;

    private Integer userId;

    private String userName;

    private String password;

    private Date createTime;

    private Date lastEditTime;

}