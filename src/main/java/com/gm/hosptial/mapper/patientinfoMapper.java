package com.gm.hosptial.mapper;

import com.gm.hosptial.pojo.patientinfo;
//表名：PatientInfo说明：患者信息
public interface patientinfoMapper {
    int deleteByPrimaryKey(String patientid);

    int insert(patientinfo record);

    int insertSelective(patientinfo record);

    patientinfo selectByPrimaryKey(String patientid);

    int updateByPrimaryKeySelective(patientinfo record);

    int updateByPrimaryKey(patientinfo record);
}