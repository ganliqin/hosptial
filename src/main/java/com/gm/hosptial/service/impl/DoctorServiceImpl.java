package com.gm.hosptial.service.impl;

import com.gm.hosptial.pojo.*;
import com.gm.hosptial.mapper.*;
import com.gm.hosptial.service.DoctorService;
import com.gm.hosptial.service.Sqlsessionlink;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class DoctorServiceImpl implements DoctorService {
    private SqlSession sqlSession;

    public DoctorServiceImpl() throws IOException {
        this.sqlSession = Sqlsessionlink.getSqlSession();
    }

    @Override
    public boolean doctorLogin(String user, String password) {
        doctorinfo doctorid=sqlSession.getMapper(doctorinfoMapper.class).selectByPrimaryKey(user);
        if(doctorid!=null)
        {
            if(doctorid.getDocpassword().equals(password))
            return true;
        }
        return false;
    }

    @Override
    public doctorinfo getDoctor(String id) {
        doctorinfo doctorid=sqlSession.getMapper(doctorinfoMapper.class).selectByPrimaryKey(id);
        return doctorid;
    }

    @Override
    public boolean upDoctor(doctorinfo dinfo) {
        int n=0;
        n=sqlSession.getMapper(doctorinfoMapper.class).updateByPrimaryKey(dinfo);
        if(n==0)
        return false;
        else
            return true;
    }

    @Override
    public boolean leaveDoctor(docleaveinfo dlinfo) {
        int n=0;
        n=sqlSession.getMapper(docleaveinfoMapper.class).insert(dlinfo);
        if(n==0)
            return false;
        else
            return true;
    }

    @Override
    public List<visitrecord> getVisitrecord(String aid, String did) {
        visitrecord vis=new visitrecord();
        vis.setPatientid(aid);
        vis.setDoctorid(did);
        List<visitrecord> vlist=sqlSession.getMapper(visitrecordMapper.class).getvisitrecord(vis);
        return vlist;
    }

    @Override
    public boolean setAppoint(patientinfo ainfo, doctorinfo dinfo) {
        return false;
    }

    @Override
    public boolean appointAffirm(appointrecord apoint) {
        return false;
    }
}
