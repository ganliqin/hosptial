package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.numberinfo;
//表名：NumberInfo，说明：号源表
public interface numberinfoMapper {
    int insert(numberinfo record);

    int insertSelective(numberinfo record);
}