package com.watchshop.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */

public class Address implements java.io.Serializable {

	// Fields

	private Long addressId;
	private Usertable usertable;
	private String address;
	private String linkman;
	private String linktel;
	private Integer isdefault;
	private Integer addState;

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** full constructor */
	public Address(Usertable usertable, String address, String linkman,
			String linktel, Integer isdefault, Integer addState) {
		this.usertable = usertable;
		this.address = address;
		this.linkman = linkman;
		this.linktel = linktel;
		this.isdefault = isdefault;
		this.addState = addState;
	}

	// Property accessors

	public Long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public Usertable getUsertable() {
		return this.usertable;
	}

	public void setUsertable(Usertable usertable) {
		this.usertable = usertable;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getLinktel() {
		return this.linktel;
	}

	public void setLinktel(String linktel) {
		this.linktel = linktel;
	}

	public Integer getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(Integer isdefault) {
		this.isdefault = isdefault;
	}

	public Integer getAddState() {
		return this.addState;
	}

	public void setAddState(Integer addState) {
		this.addState = addState;
	}

}