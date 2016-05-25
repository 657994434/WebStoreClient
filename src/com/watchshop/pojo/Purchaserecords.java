package com.watchshop.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Purchaserecords entity. @author MyEclipse Persistence Tools
 */

public class Purchaserecords implements java.io.Serializable {

	// Fields

	private Long stockId;
	private Goodstable goodstable;
	private Supporter supporter;
	private Long stockNum;
	private Double stockUnitPrive;
	private Double stockPrive;
	private Date stockDate;
	private String stockPrincipal;
	// Constructors

	/** default constructor */
	public Purchaserecords() {
	}

	/** minimal constructor */
	public Purchaserecords(Goodstable goodstable, Supporter supporter,
			Long stockNum, Double stockUnitPrive, Double stockPrive,
			Date stockDate, String stockPrincipal) {
		this.goodstable = goodstable;
		this.supporter = supporter;
		this.stockNum = stockNum;
		this.stockUnitPrive = stockUnitPrive;
		this.stockPrive = stockPrive;
		this.stockDate = stockDate;
		this.stockPrincipal = stockPrincipal;
	}

	// Property accessors

	public Long getStockId() {
		return this.stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public Goodstable getGoodstable() {
		return this.goodstable;
	}

	public void setGoodstable(Goodstable goodstable) {
		this.goodstable = goodstable;
	}

	public Supporter getSupporter() {
		return this.supporter;
	}

	public void setSupporter(Supporter supporter) {
		this.supporter = supporter;
	}

	public Long getStockNum() {
		return this.stockNum;
	}

	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public Double getStockUnitPrive() {
		return this.stockUnitPrive;
	}

	public void setStockUnitPrive(Double stockUnitPrive) {
		this.stockUnitPrive = stockUnitPrive;
	}

	public Double getStockPrive() {
		return this.stockPrive;
	}

	public void setStockPrive(Double stockPrive) {
		this.stockPrive = stockPrive;
	}

	public Date getStockDate() {
		return this.stockDate;
	}

	public void setStockDate(Date stockDate) {
		this.stockDate = stockDate;
	}

	public String getStockPrincipal() {
		return this.stockPrincipal;
	}

	public void setStockPrincipal(String stockPrincipal) {
		this.stockPrincipal = stockPrincipal;
	}

}