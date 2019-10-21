package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.numberinfo;

public interface numberinfoMapper {
    int insert(numberinfo record);

    int insertSelective(numberinfo record);
}