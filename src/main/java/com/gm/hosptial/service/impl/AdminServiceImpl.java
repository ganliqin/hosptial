package com.gm.hosptial.service.impl;

import com.gm.hosptial.mapper.*;
import com.gm.hosptial.pojo.*;
import com.gm.hosptial.service.AdminService;
import com.gm.hosptial.service.Sqlsessionlink;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class AdminServiceImpl implements AdminService {
    private SqlSession sqlSession;

    public AdminServiceImpl() throws IOException {
        this.sqlSession = Sqlsessionlink.getSqlSession();
    }

    @Override
    public boolean addDoctor(doctorinfo dinfo,String id) {
        departmentinfoMapper deM=sqlSession.getMapper(departmentinfoMapper.class);
        doctorinfoMapper docM = sqlSession.getMapper(doctorinfoMapper.class);
        doctorinfo doc=docM.selectByPrimaryKey(dinfo.getDoctorid());
        if(!doc.getDoctorid().equals(dinfo.getDoctorid())&&deM.selectByPrimaryKey(id).getDepartmentid().equals(id)) {
            docM.insert(dinfo);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteDoctor(String did) {
        doctorinfoMapper docM=sqlSession.getMapper(doctorinfoMapper.class);
        int n=docM.deleteByPrimaryKey(did);
        if(n==0)
            return false;
        else
            return true;
    }

    @Override
    public boolean upDoctor(String did) {
        return false;
    }

    @Override
    public List<scheduleinfo> getScheduleinfo() {
        return null;
    }

    @Override
    public boolean setDepartment(doctorinfo dinfo, scheduleinfo sinfo) {
        return false;
    }

    @Override
    public List<patientinfo> getPatientinfo() {
        return null;
    }

    @Override
    public List<doctorinfo> getDoctorinfo() {
        return null;
    }

    @Override
    public boolean setPatientinfotime(patientinfo pinfo, String time) {
        return false;
    }

    @Override
    public List<docleaveinfo> getDocleaveinfo() {
        return null;
    }

    @Override
    public boolean setDocleaveinfo() {
        return false;
    }
}
