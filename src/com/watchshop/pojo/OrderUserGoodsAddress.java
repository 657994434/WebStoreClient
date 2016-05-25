package com.watchshop.pojo;

/**
 * OrderUserGoodsAddress entity. @author MyEclipse Persistence Tools
 */

public class OrderUserGoodsAddress implements java.io.Serializable {

	// Fields

	private OrderUserGoodsAddressId id;

	// Constructors

	/** default constructor */
	public OrderUserGoodsAddress() {
	}

	/** full constructor */
	public OrderUserGoodsAddress(OrderUserGoodsAddressId id) {
		this.id = id;
	}

	// Property accessors

	public OrderUserGoodsAddressId getId() {
		return this.id;
	}

	public void setId(OrderUserGoodsAddressId id) {
		this.id = id;
	}

}