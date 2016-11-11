package com.shsxt.dto;

import com.shsxt.po.Account;

public class AccountDto extends Account
{
	private String userName;
	
	private String userPwd;

	/**
	 * @return the userName
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	/**
	 * @return the userPwd
	 */
	public String getUserPwd()
	{
		return userPwd;
	}

	/**
	 * @param userPwd the userPwd to set
	 */
	public void setUserPwd(String userPwd)
	{
		this.userPwd = userPwd;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return super.toString()+"AccountDto [userName=" + userName + ", userPwd=" + userPwd
				+ "]";
	}
	
	
}
