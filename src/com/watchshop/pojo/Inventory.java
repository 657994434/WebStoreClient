package com.watchshop.pojo;

import java.util.Date;

/**
 * Inventory entity. @author MyEclipse Persistence Tools
 * 库存管理
 */

public class Inventory implements java.io.Serializable {

	// Fields

	private Long checkId;
	private Goodstable goodstable;
	private Long statNum;
	private Long checkNum;
	private Date checkDate;
	private String checkPrincipal;

	// Constructors

	/** default constructor */
	public Inventory() {
	}

	/** full constructor */
	public Inventory(Goodstable goodstable, Long statNum, Long checkNum,
			Date checkDate, String checkPrincipal) {
		this.goodstable = goodstable;
		this.statNum = statNum;
		this.checkNum = checkNum;
		this.checkDate = checkDate;
		this.checkPrincipal = checkPrincipal;
	}

	// Property accessors

	public Long getCheckId() {
		return this.checkId;
	}

	public void setCheckId(Long checkId) {
		this.checkId = checkId;
	}

	public Goodstable getGoodstable() {
		return this.goodstable;
	}

	public void setGoodstable(Goodstable goodstable) {
		this.goodstable = goodstable;
	}

	public Long getStatNum() {
		return this.statNum;
	}

	public void setStatNum(Long statNum) {
		this.statNum = statNum;
	}

	public Long getCheckNum() {
		return this.checkNum;
	}

	public void setCheckNum(Long checkNum) {
		this.checkNum = checkNum;
	}

	public Date getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getCheckPrincipal() {
		return this.checkPrincipal;
	}

	public void setCheckPrincipal(String checkPrincipal) {
		this.checkPrincipal = checkPrincipal;
	}

}