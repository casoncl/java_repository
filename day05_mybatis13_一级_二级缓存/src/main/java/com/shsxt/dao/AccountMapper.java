package com.shsxt.dao;

import com.shsxt.dto.AccountDto;
import com.shsxt.po.Account;


public interface AccountMapper
{
	//一对一：方式一
	public AccountDto queryAccountUserResultTypeByAid(int id);
	//一对一：方式二
	public Account queryAccountUserResultMapById(int id);
	
	
	//一对多
	public Account queryAccountUserPayInResultMap(int id);
}
	