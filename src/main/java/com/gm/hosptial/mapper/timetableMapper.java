package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.timetable;
//表名：timetable，说明：时间表
public interface timetableMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(timetable record);

    int insertSelective(timetable record);

    timetable selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(timetable record);

    int updateByPrimaryKey(timetable record);
}