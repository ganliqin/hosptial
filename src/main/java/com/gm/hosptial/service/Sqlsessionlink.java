package com.gm.hosptial.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Sqlsessionlink {
    public static SqlSession getSqlSession()throws IOException {
        String resources = "SqlMapConfig.xml";
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream(resources);
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sessionFactory.openSession();
        return sqlSession;
    }
}
