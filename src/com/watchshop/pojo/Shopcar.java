package com.watchshop.pojo;

import java.util.Date;

/**
 * Shopcar entity. @author MyEclipse Persistence Tools
 */

public class Shopcar implements java.io.Serializable {

	// Fields

	private Long shopCarId;
	private Usertable usertable;
	private Goodstable goodstable;
	private Double goodPrice;
	private Long shopNum;
	private Double allPrice;
	private Date shopCarDate;
	private Integer state;

	// Constructors

	/** default constructor */
	public Shopcar() {
	}

	/** full constructor */
	public Shopcar(Usertable usertable, Goodstable goodstable,
			Double goodPrice, Long shopNum, Double allPrice, Date shopCarDate,
			Integer state) {
		this.usertable = usertable;
		this.goodstable = goodstable;
		this.goodPrice = goodPrice;
		this.shopNum = shopNum;
		this.allPrice = allPrice;
		this.shopCarDate = shopCarDate;
		this.state = state;
	}

	// Property accessors

	public Long getShopCarId() {
		return this.shopCarId;
	}

	public void setShopCarId(Long shopCarId) {
		this.shopCarId = shopCarId;
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

	public Date getShopCarDate() {
		return this.shopCarDate;
	}

	public void setShopCarDate(Date shopCarDate) {
		this.shopCarDate = shopCarDate;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}