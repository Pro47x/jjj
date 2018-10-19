package com.pro47x.demo;

import com.pro47x.demo.pojo.Account;
import com.sun.istack.internal.logging.Logger;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;

public class TestApp {
    Logger logger = Logger.getLogger(TestApp.class);

    @Test
    public void findUserByName() throws Exception {
        logger.log(Level.INFO,"1234");
        String resource = "conf.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        List<Account> rose = sqlSession.selectList("Account.findUserByName", "jack");
        System.out.println(rose.get(0));
        sqlSession.close();
    }
}
