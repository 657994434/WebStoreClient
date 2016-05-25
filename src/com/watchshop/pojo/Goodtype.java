package com.watchshop.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Goodtype entity. @author MyEclipse Persistence Tools
 */

public class Goodtype implements java.io.Serializable {

	// Fields

	private Long typeId;
	private String typeName;
	private String remark;

	// Constructors

	/** default constructor */
	public Goodtype() {
	}

	/** minimal constructor */
	public Goodtype(String typeName, String remark) {
		this.typeName = typeName;
		this.remark = remark;
	}

	// Property accessors

	public Long getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}