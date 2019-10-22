package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.docleaveinfo;
//表名：DocLeaveDepartInfo，说明：医生请假信息
public interface docleaveinfoMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(docleaveinfo record);

    int insertSelective(docleaveinfo record);

    docleaveinfo selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(docleaveinfo record);

    int updateByPrimaryKey(docleaveinfo record);
}