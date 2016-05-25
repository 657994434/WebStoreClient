package com.watchshop.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Goodsreturntable entity. @author MyEclipse Persistence Tools
 */

public class Goodsreturntable implements java.io.Serializable {

	// Fields

	private Long stockBackId;
	private Purchaserecords purchaserecords;
	private String backRemark;
	private Long backNum;
	private Double backUnitPrice;
	private Double backPrice;
	private Date backDate;
	private BigDecimal backPrincipal;

	// Constructors

	/** default constructor */
	public Goodsreturntable() {
	}

	/** full constructor */
	public Goodsreturntable(Purchaserecords purchaserecords, String backRemark,
			Long backNum, Double backUnitPrice, Double backPrice,
			Date backDate, BigDecimal backPrincipal) {
		this.purchaserecords = purchaserecords;
		this.backRemark = backRemark;
		this.backNum = backNum;
		this.backUnitPrice = backUnitPrice;
		this.backPrice = backPrice;
		this.backDate = backDate;
		this.backPrincipal = backPrincipal;
	}

	// Property accessors

	public Long getStockBackId() {
		return this.stockBackId;
	}

	public void setStockBackId(Long stockBackId) {
		this.stockBackId = stockBackId;
	}

	public Purchaserecords getPurchaserecords() {
		return this.purchaserecords;
	}

	public void setPurchaserecords(Purchaserecords purchaserecords) {
		this.purchaserecords = purchaserecords;
	}

	public String getBackRemark() {
		return this.backRemark;
	}

	public void setBackRemark(String backRemark) {
		this.backRemark = backRemark;
	}

	public Long getBackNum() {
		return this.backNum;
	}

	public void setBackNum(Long backNum) {
		this.backNum = backNum;
	}

	public Double getBackUnitPrice() {
		return this.backUnitPrice;
	}

	public void setBackUnitPrice(Double backUnitPrice) {
		this.backUnitPrice = backUnitPrice;
	}

	public Double getBackPrice() {
		return this.backPrice;
	}

	public void setBackPrice(Double backPrice) {
		this.backPrice = backPrice;
	}

	public Date getBackDate() {
		return this.backDate;
	}

	public void setBackDate(Date backDate) {
		this.backDate = backDate;
	}

	public BigDecimal getBackPrincipal() {
		return this.backPrincipal;
	}

	public void setBackPrincipal(BigDecimal backPrincipal) {
		this.backPrincipal = backPrincipal;
	}

}