package com.kgc.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
@Component
public class MyBatisUtil {
    /**
     * 初始化时创建SqlSessionFactory对象
     */
    private static SqlSessionFactory factory;

    static {
        String source = "mybatis-config.xml";
        try {
            InputStream stream = Resources.getResourceAsStream(source);
            factory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取SqlSession对象[连接]
     * @return
     */
    public static SqlSession getSqlSession(boolean autoCommit){
        SqlSession sqlSession = factory.openSession(autoCommit);
        return sqlSession;
    }

    /**
     * 关闭SqlSession对象[连接]
     * @param sqlSession
     */
    public static void closeSqlSession(SqlSession sqlSession){
        sqlSession.close();
    }
}
