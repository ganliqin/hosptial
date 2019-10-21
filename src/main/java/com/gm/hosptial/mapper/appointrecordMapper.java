package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.appointrecord;

public interface appointrecordMapper {
    int insert(appointrecord record);

    int insertSelective(appointrecord record);
}