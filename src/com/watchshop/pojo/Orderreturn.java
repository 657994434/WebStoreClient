package com.watchshop.pojo;

import java.util.Date;

/**
 * Orderreturn entity. @author MyEclipse Persistence Tools
 */

public class Orderreturn implements java.io.Serializable {

	// Fields

	private Long shopBackId;
	private Ordertable ordertable;
	private Double goodPrice;
	private Long shopNum;
	private Double allPrice;
	private Date backDate;
	private Integer backState;

	// Constructors

	/** default constructor */
	public Orderreturn() {
	}

	/** full constructor */
	public Orderreturn(Ordertable ordertable, Double goodPrice, Long shopNum,
			Double allPrice, Date backDate, Integer backState) {
		this.ordertable = ordertable;
		this.goodPrice = goodPrice;
		this.shopNum = shopNum;
		this.allPrice = allPrice;
		this.backDate = backDate;
		this.backState = backState;
	}

	// Property accessors

	public Long getShopBackId() {
		return this.shopBackId;
	}

	public void setShopBackId(Long shopBackId) {
		this.shopBackId = shopBackId;
	}

	public Ordertable getOrdertable() {
		return this.ordertable;
	}

	public void setOrdertable(Ordertable ordertable) {
		this.ordertable = ordertable;
	}

	public Double getGoodPrice() {
		return this.goodPrice;
	}

	public void setGoodPrice(Double goodPrice) {
		this.goodPrice = goodPrice;
	}

	public Long getShopNum() {
		return this.shopNum;
	}

	public void setShopNum(Long shopNum) {
		this.shopNum = shopNum;
	}

	public Double getAllPrice() {
		return this.allPrice;
	}

	public void setAllPrice(Double allPrice) {
		this.allPrice = allPrice;
	}

	public Date getBackDate() {
		return this.backDate;
	}

	public void setBackDate(Date backDate) {
		this.backDate = backDate;
	}

	public Integer getBackState() {
		return this.backState;
	}

	public void setBackState(Integer backState) {
		this.backState = backState;
	}

}