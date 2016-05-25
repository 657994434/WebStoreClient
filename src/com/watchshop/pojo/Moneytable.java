package com.watchshop.pojo;

import java.util.Date;

/**
 * Moneytable entity. @author MyEclipse Persistence Tools
 */

public class Moneytable implements java.io.Serializable {

	// Fields

	private Long hisId;
	private Usertable usertable;
	private Double money;
	private Integer hisType;
	private Date hisDate;
	private String remark;

	// Constructors

	/** default constructor */
	public Moneytable() {
	}

	/** full constructor */
	public Moneytable(Usertable usertable, Double money, Integer hisType,
			Date hisDate, String remark) {
		this.usertable = usertable;
		this.money = money;
		this.hisType = hisType;
		this.hisDate = hisDate;
		this.remark = remark;
	}

	// Property accessors

	public Long getHisId() {
		return this.hisId;
	}

	public void setHisId(Long hisId) {
		this.hisId = hisId;
	}

	public Usertable getUsertable() {
		return this.usertable;
	}

	public void setUsertable(Usertable usertable) {
		this.usertable = usertable;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getHisType() {
		return this.hisType;
	}

	public void setHisType(Integer hisType) {
		this.hisType = hisType;
	}

	public Date getHisDate() {
		return this.hisDate;
	}

	public void setHisDate(Date hisDate) {
		this.hisDate = hisDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}