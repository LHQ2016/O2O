package com.chenzi.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneAuth {
    private Integer phoneAuthId;

    private Integer userId;

    private String phone;

    private String authNumber;

}