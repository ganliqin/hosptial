package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.visitrecord;
//表名：VisitRecord说明：就诊信息
public interface visitrecordMapper {
    int insert(visitrecord record);

    int insertSelective(visitrecord record);
}