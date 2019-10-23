package com.gm.hosptial;

import com.gm.hosptial.mapper.idinfoMapper;
import com.gm.hosptial.pojo.idinfo;
import com.gm.hosptial.service.Sqlsessionlink;

import java.io.IOException;
import java.util.List;

public class test {
    public static void main(String arr[])throws IOException {
        idinfoMapper pMapper=Sqlsessionlink.getSqlSession().getMapper(idinfoMapper.class);
        List<idinfo> id=pMapper.select();
        for(idinfo ids : id)
        {
            System.out.println(ids.getName());

        }
    }
}
