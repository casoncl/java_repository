package com.shsxt.po;

public class PayIn
{
	private Integer pid;

	private String pname;

	private Double pmoney;

	public Integer getPid()
	{
		return pid;
	}

	public void setPid(Integer pid)
	{
		this.pid = pid;
	}

	public String getPname()
	{
		return pname;
	}

	public void setPname(String pname)
	{
		this.pname = pname;
	}

	public Double getPmoney()
	{
		return pmoney;
	}

	public void setPmoney(Double pmoney)
	{
		this.pmoney = pmoney;
	}

	@Override
	public String toString()
	{
		return "PayIn [pid=" + pid + ", pname=" + pname + ", pmoney=" + pmoney
				+ "]";
	}

}
