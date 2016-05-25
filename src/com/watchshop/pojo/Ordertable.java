package com.watchshop.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ordertable entity. @author MyEclipse Persistence Tools
 */

public class Ordertable implements java.io.Serializable {

	// Fields

	private Long shopId;
	private Usertable usertable;
	private Address address;
	private Goodstable goodstable;
	private Double goodPrice;
	private Long shopNum;
	private Double allPrice;
	private String shopInfo;
	private Date shopDate;
	private String shopLeave;
	private Integer shopState;

	// Constructors

	/** default constructor */
	public Ordertable() {
	}

	/** minimal constructor */
	public Ordertable(Usertable usertable, Address address,
			Goodstable goodstable, Double goodPrice, Long shopNum,
			Double allPrice, String shopInfo, Date shopDate, String shopLeave,
			Integer shopState) {
		this.usertable = usertable;
		this.address = address;
		this.goodstable = goodstable;
		this.goodPrice = goodPrice;
		this.shopNum = shopNum;
		this.allPrice = allPrice;
		this.shopInfo = shopInfo;
		this.shopDate = shopDate;
		this.shopLeave = shopLeave;
		this.shopState = shopState;
	}

	// Property accessors

	public Long getShopId() {
		return this.shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Usertable getUsertable() {
		return this.usertable;
	}

	public void setUsertable(Usertable usertable) {
		this.usertable = usertable;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public String getShopInfo() {
		return this.shopInfo;
	}

	public void setShopInfo(String shopInfo) {
		this.shopInfo = shopInfo;
	}

	public Date getShopDate() {
		return this.shopDate;
	}

	public void setShopDate(Date shopDate) {
		this.shopDate = shopDate;
	}

	public String getShopLeave() {
		return this.shopLeave;
	}

	public void setShopLeave(String shopLeave) {
		this.shopLeave = shopLeave;
	}

	public Integer getShopState() {
		return this.shopState;
	}

	public void setShopState(Integer shopState) {
		this.shopState = shopState;
	}

}