package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.appointrecord;
//表名：AppointRecord，说明：预约记录
public interface appointrecordMapper {
    int insert(appointrecord record);

    int insertSelective(appointrecord record);
}