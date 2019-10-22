package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.appointinfo;
//表名：AppointInfo，说明：预约信息
public interface appointinfoMapper {
    int insert(appointinfo record);
//1223
    int insertSelective(appointinfo record);
}