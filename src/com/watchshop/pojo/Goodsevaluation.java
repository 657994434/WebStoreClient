package com.watchshop.pojo;

import java.util.Date;

/**
 * Goodsevaluation entity. @author MyEclipse Persistence Tools
 */

public class Goodsevaluation implements java.io.Serializable {

	// Fields

	private Long appraiseId;
	private Usertable usertable;
	private Goodstable goodstable;
	private String  appraise;
	private Date appraiseDate;
	private Double apptaiseScore;

	// Constructors

	/** default constructor */
	public Goodsevaluation() {
	}

	/** full constructor */
	public Goodsevaluation(Usertable usertable, Goodstable goodstable,
			String appraise, Date appraiseDate, Double apptaiseScore) {
		this.usertable = usertable;
		this.goodstable = goodstable;
		this.appraise = appraise;
		this.appraiseDate = appraiseDate;
		this.apptaiseScore = apptaiseScore;
	}

	// Property accessors

	public Long getAppraiseId() {
		return this.appraiseId;
	}

	public void setAppraiseId(Long appraiseId) {
		this.appraiseId = appraiseId;
	}

	public Usertable getUsertable() {
		return this.usertable;
	}

	public void setUsertable(Usertable usertable) {
		this.usertable = usertable;
	}

	public Goodstable getGoodstable() {
		return this.goodstable;
	}

	public void setGoodstable(Goodstable goodstable) {
		this.goodstable = goodstable;
	}

	public String getAppraise() {
		return this.appraise;
	}

	public void setAppraise(String appraise) {
		this.appraise = appraise;
	}

	public Date getAppraiseDate() {
		return this.appraiseDate;
	}

	public void setAppraiseDate(Date appraiseDate) {
		this.appraiseDate = appraiseDate;
	}

	public Double getApptaiseScore() {
		return this.apptaiseScore;
	}

	public void setApptaiseScore(Double apptaiseScore) {
		this.apptaiseScore = apptaiseScore;
	}

}