package com.pro47x.demo.dao;

import com.pro47x.demo.pojo.Account;

public interface AccountDao {
    Account findAccountByName(String name) throws Exception;
}
