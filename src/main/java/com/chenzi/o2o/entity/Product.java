package com.chenzi.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer productId;

    private String productName;

    private String productDesc;

    private String imgAddr;

    private String normalPrice;

    private String promotionPrice;

    private Integer priority;

    private Date createTime;

    private Date lastEditTime;

    private Integer enableStatus;

    private Integer point;

    private Integer productCategoryId;

    private Integer shopId;

}