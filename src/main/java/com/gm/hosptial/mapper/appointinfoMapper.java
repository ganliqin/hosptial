package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.appointinfo;

public interface appointinfoMapper {
    int insert(appointinfo record);
//1223
    int insertSelective(appointinfo record);
}