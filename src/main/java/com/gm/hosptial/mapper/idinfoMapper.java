package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.idinfo;
//表名：IDInfo，说明：身份证信息
public interface idinfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(idinfo record);

    int insertSelective(idinfo record);

    idinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(idinfo record);

    int updateByPrimaryKey(idinfo record);
}