package com.pro47x.demo.service.impl;

import com.pro47x.demo.dao.AccountDao;
import com.pro47x.demo.service.AccountService;


public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	@Override
	public void transfer(final String outer,final String inner,final Integer money) {
				accountDao.out(outer, money);
				//断电
//				int i = 1/0;
				accountDao.in(inner, money);

	}

}
