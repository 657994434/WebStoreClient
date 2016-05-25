package com.watchshop.pojo;

/**
 * Shopcartview entity. @author MyEclipse Persistence Tools
 */

public class Shopcartview implements java.io.Serializable {

	// Fields

	private ShopcartviewId id;

	// Constructors

	/** default constructor */
	public Shopcartview() {
	}

	/** full constructor */
	public Shopcartview(ShopcartviewId id) {
		this.id = id;
	}

	// Property accessors

	public ShopcartviewId getId() {
		return this.id;
	}

	public void setId(ShopcartviewId id) {
		this.id = id;
	}

}