package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.visitrecord;

import java.util.List;

//表名：VisitRecord说明：就诊信息
public interface visitrecordMapper {
    int insert(visitrecord record);
    List<visitrecord> getvisitrecord(visitrecord vis);
    int insertSelective(visitrecord record);
}