package com.watchshop.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * 供应商表
 * Supporter entity. @author MyEclipse Persistence Tools
 */

public class Supporter implements java.io.Serializable {

	// Fields

	private Long gysId;
	private String gysName;
	private String remark;
	private String gysTel;
	private String gysAddress;
	private String gysLinkman;

	// Constructors

	/** default constructor */
	public Supporter() {
	}

	/** minimal constructor */
	public Supporter(String gysName, String remark, String gysTel,
			String gysAddress, String gysLinkman) {
		this.gysName = gysName;
		this.remark = remark;
		this.gysTel = gysTel;
		this.gysAddress = gysAddress;
		this.gysLinkman = gysLinkman;
	}

	// Property accessors

	public Long getGysId() {
		return this.gysId;
	}

	public void setGysId(Long gysId) {
		this.gysId = gysId;
	}

	public String getGysName() {
		return this.gysName;
	}

	public void setGysName(String gysName) {
		this.gysName = gysName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGysTel() {
		return this.gysTel;
	}

	public void setGysTel(String gysTel) {
		this.gysTel = gysTel;
	}

	public String getGysAddress() {
		return this.gysAddress;
	}

	public void setGysAddress(String gysAddress) {
		this.gysAddress = gysAddress;
	}

	public String getGysLinkman() {
		return this.gysLinkman;
	}

	public void setGysLinkman(String gysLinkman) {
		this.gysLinkman = gysLinkman;
	}

}