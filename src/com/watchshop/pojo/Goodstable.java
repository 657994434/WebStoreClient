package com.watchshop.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Goodstable entity. @author MyEclipse Persistence Tools
 */

public class Goodstable implements java.io.Serializable {

	// Fields

	private Long goodId;
	private Goodtype goodtype;
	private String goodName;
	private String goodSpec;
	private Double goodPurchase;
	private Double goodPrice;
	private Double abatePrive;
	private String goodRemark;
	private Integer goodSex;
	private Date goodTime;
	private Integer goodState;

	// Constructors

	/** default constructor */
	public Goodstable() {
	}

	/** minimal constructor */
	public Goodstable(Goodtype goodtype, String goodName, String goodSpec,
			Double goodPurchase, Double goodPrice, Double abatePrive,
			String goodRemark, Integer goodSex, Date goodTime, Integer goodState) {
		this.goodtype = goodtype;
		this.goodName = goodName;
		this.goodSpec = goodSpec;
		this.goodPurchase = goodPurchase;
		this.goodPrice = goodPrice;
		this.abatePrive = abatePrive;
		this.goodRemark = goodRemark;
		this.goodSex = goodSex;
		this.goodTime = goodTime;
		this.goodState = goodState;
	}
	// Property accessors

	public Long getGoodId() {
		return this.goodId;
	}

	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}

	public Goodtype getGoodtype() {
		return this.goodtype;
	}

	public void setGoodtype(Goodtype goodtype) {
		this.goodtype = goodtype;
	}

	public String getGoodName() {
		return this.goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getGoodSpec() {
		return this.goodSpec;
	}

	public void setGoodSpec(String goodSpec) {
		this.goodSpec = goodSpec;
	}

	public Double getGoodPurchase() {
		return this.goodPurchase;
	}

	public void setGoodPurchase(Double goodPurchase) {
		this.goodPurchase = goodPurchase;
	}

	public Double getGoodPrice() {
		return this.goodPrice;
	}

	public void setGoodPrice(Double goodPrice) {
		this.goodPrice = goodPrice;
	}

	public Double getAbatePrive() {
		return this.abatePrive;
	}

	public void setAbatePrive(Double abatePrive) {
		this.abatePrive = abatePrive;
	}

	public String getGoodRemark() {
		return this.goodRemark;
	}

	public void setGoodRemark(String goodRemark) {
		this.goodRemark = goodRemark;
	}

	public Integer getGoodSex() {
		return this.goodSex;
	}

	public void setGoodSex(Integer goodSex) {
		this.goodSex = goodSex;
	}

	public Date getGoodTime() {
		return this.goodTime;
	}

	public void setGoodTime(Date goodTime) {
		this.goodTime = goodTime;
	}

	public Integer getGoodState() {
		return this.goodState;
	}

	public void setGoodState(Integer goodState) {
		this.goodState = goodState;
	}

}