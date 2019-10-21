package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.docleaveinfo;

public interface docleaveinfoMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(docleaveinfo record);

    int insertSelective(docleaveinfo record);

    docleaveinfo selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(docleaveinfo record);

    int updateByPrimaryKey(docleaveinfo record);
}