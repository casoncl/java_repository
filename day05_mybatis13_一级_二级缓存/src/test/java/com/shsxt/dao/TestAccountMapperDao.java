package com.shsxt.dao;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.shsxt.dto.AccountDto;
import com.shsxt.po.Account;

public class TestAccountMapperDao
{

	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void init() throws IOException
	{
		InputStream is = null;
		is = Resources.getResourceAsStream("mybatis.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
	}
	
	
	@Test
	public void testQueryAccountUserResultTypeByAid()//测试一对一方式一
	{
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
		AccountDto accountDto = accountMapper.queryAccountUserResultTypeByAid(1);
		System.err.println(accountDto);//err:以错误的形式打印，打印出来还是正确的结果，只是打印的内容变为了红色
		sqlSession.close();
		
		
		SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
		AccountMapper accountMapper2 = sqlSession2.getMapper(AccountMapper.class);
		AccountDto accountDto2 = accountMapper2.queryAccountUserResultTypeByAid(1);
		System.err.println(accountDto2);//err:以错误的形式打印，打印出来还是正确的结果，只是打印的内容变为了红色
		sqlSession2.close();
		
	}
	
	
	@Test
	public void testQueryAccountUserResultMapById()//测试一对一方式二
	{
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		AccountMapper accountMapper= sqlSession.getMapper(AccountMapper.class);
		Account account=accountMapper.queryAccountUserResultMapById(1);
		//err:以错误的形式打印，打印出来还是正确的结果，只是打印的内容变为了红色
		System.err.println(account+account.getUser().getUserName()+account.getUser().getUserPwd());
		
	}
	
	
	
	@Test
	public void testQueryAccountUserPayInResultMap()//测试一对多
	{
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		
		AccountMapper accountMapper= sqlSession.getMapper(AccountMapper.class);
		Account account=accountMapper.queryAccountUserPayInResultMap(1);
		
		System.err.println(account+account.getUser().getUserName()+account.getUser().getUserPwd()
				+account.getPayIns());
		
	}
	
}
