package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.idinfo;

import java.util.List;

//表名：IDInfo，说明：身份证信息
public interface idinfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(idinfo record);

    int insertSelective(idinfo record);

    idinfo selectByPrimaryKey(String id);

    List<idinfo> select();

    int updateByPrimaryKeySelective(idinfo record);

    int updateByPrimaryKey(idinfo record);
}