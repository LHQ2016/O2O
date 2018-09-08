package com.chenzi.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopAuthMap {
    private Integer shopAuthId;

    private Integer employeeId;

    private Integer shopId;

    private String name;

    private String title;

    private Integer titleFlag;

    private Date createTime;

    private Date lastEditTime;

    private Integer enableStatus;
}