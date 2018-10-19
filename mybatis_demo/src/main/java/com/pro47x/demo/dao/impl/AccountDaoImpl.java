package com.pro47x.demo.dao.impl;

import com.pro47x.demo.dao.AccountDao;
import com.pro47x.demo.pojo.Account;
import org.apache.ibatis.session.SqlSessionFactory;

public class AccountDaoImpl implements AccountDao {
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public Account findAccountByName(String name) throws Exception {

        return null;
    }
}
