package com.shsxt.po;

import java.util.Date;
import java.util.List;

public class Account
{
	private Integer id;

	private String aname;

	private String type;

	private Double money;

	private String remark;

	private Date createTime;

	private Date updateTime;

	private Integer userId;
		
	private User user;
	
	private List<PayIn> payIns;
	
	
	
	
	/**
	 * @return the payIns
	 */
	public List<PayIn> getPayIns()
	{
		return payIns;
	}

	/**
	 * @param payIns the payIns to set
	 */
	public void setPayIns(List<PayIn> payIns)
	{
		this.payIns = payIns;
	}

	/**
	 * @return the user
	 */
	public User getUser()
	{
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user)
	{
		this.user = user;
	}

	// 空构造快捷键：Alt+Shift+s + c
	public Account()
	{
		super();
	}

	// 有参构造快捷键: Alt+Shift+s + o
	public Account(String aname, String type, Double money, String remark,
			Date createTime, Date updateTime, Integer userId)
	{
		super();
		this.aname = aname;
		this.type = type;
		this.money = money;
		this.remark = remark;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.userId = userId;
	}

	// get和set快捷键: Alt+Shift+s + o
	/**
	 * @return the id
	 */
	public Integer getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id)
	{
		this.id = id;
	}

	/**
	 * @return the aname
	 */
	public String getAname()
	{
		return aname;
	}

	/**
	 * @param aname the aname to set
	 */
	public void setAname(String aname)
	{
		this.aname = aname;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * @return the money
	 */
	public Double getMoney()
	{
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(Double money)
	{
		this.money = money;
	}

	/**
	 * @return the remark
	 */
	public String getRemark()
	{
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime()
	{
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime()
	{
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime)
	{
		this.updateTime = updateTime;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId()
	{
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// toString快捷键: Alt+Shift+s + s
	@Override
	public String toString()
	{
		return "Account [id=" + id + ", aname=" + aname + ", type=" + type
				+ ", money=" + money + ", remark=" + remark + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", userId="
				+ userId + "]";
	}

	
	
	
}
