package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.scheduleinfo;

public interface scheduleinfoMapper {
    int deleteByPrimaryKey(String departmentname);

    int insert(scheduleinfo record);

    int insertSelective(scheduleinfo record);

    scheduleinfo selectByPrimaryKey(String departmentname);

    int updateByPrimaryKeySelective(scheduleinfo record);

    int updateByPrimaryKey(scheduleinfo record);
}