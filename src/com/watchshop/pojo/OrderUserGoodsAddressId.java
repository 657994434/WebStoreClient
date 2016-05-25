package com.watchshop.pojo;

import java.util.Date;

/**
 * OrderUserGoodsAddressId entity. @author MyEclipse Persistence Tools
 */

public class OrderUserGoodsAddressId implements java.io.Serializable {

	// Fields

	private Long shopId;
	private Long userId;
	private String userName;
	private String goodName;
	private Long shopNum;
	private Double allPrice;
	private Date shopDate;
	private String address;
	private Double price;
	private Integer shopState;

	// Constructors

	public Integer getShopState() {
		return shopState;
	}

	public void setShopState(Integer shopState) {
		this.shopState = shopState;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/** default constructor */
	public OrderUserGoodsAddressId() {
	}

	/** full constructor */
	public OrderUserGoodsAddressId(Long shopId, Long userId, String userName,
			String goodName, Long shopNum, Double allPrice, Date shopDate,
			String address,Double price,Integer shopState) {
		this.shopId = shopId;
		this.userId = userId;
		this.userName = userName;
		this.goodName = goodName;
		this.shopNum = shopNum;
		this.allPrice = allPrice;
		this.shopDate = shopDate;
		this.address = address;
		this.price = price;
		this.shopState = shopState;
	}

	// Property accessors

	public Long getShopId() {
		return this.shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGoodName() {
		return this.goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
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

	public Date getShopDate() {
		return this.shopDate;
	}

	public void setShopDate(Date shopDate) {
		this.shopDate = shopDate;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderUserGoodsAddressId))
			return false;
		OrderUserGoodsAddressId castOther = (OrderUserGoodsAddressId) other;

		return ((this.getShopId() == castOther.getShopId()) || (this
				.getShopId() != null
				&& castOther.getShopId() != null && this.getShopId().equals(
				castOther.getShopId())))
				&& ((this.getUserId() == castOther.getUserId()) || (this
						.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId()
						.equals(castOther.getUserId())))
				&& ((this.getUserName() == castOther.getUserName()) || (this
						.getUserName() != null
						&& castOther.getUserName() != null && this
						.getUserName().equals(castOther.getUserName())))
				&& ((this.getGoodName() == castOther.getGoodName()) || (this
						.getGoodName() != null
						&& castOther.getGoodName() != null && this
						.getGoodName().equals(castOther.getGoodName())))
				&& ((this.getShopNum() == castOther.getShopNum()) || (this
						.getShopNum() != null
						&& castOther.getShopNum() != null && this.getShopNum()
						.equals(castOther.getShopNum())))
				&& ((this.getAllPrice() == castOther.getAllPrice()) || (this
						.getAllPrice() != null
						&& castOther.getAllPrice() != null && this
						.getAllPrice().equals(castOther.getAllPrice())))
				&& ((this.getShopDate() == castOther.getShopDate()) || (this
						.getShopDate() != null
						&& castOther.getShopDate() != null && this
						.getShopDate().equals(castOther.getShopDate())))
				&& ((this.getAddress() == castOther.getAddress()) || (this
						.getAddress() != null
						&& castOther.getAddress() != null && this.getAddress()
						.equals(castOther.getAddress())))
				
				&& ((this.getShopState() == castOther.getShopState()) || (this
						.getShopState() != null
						&& castOther.getShopState() != null && this.getShopState()
						.equals(castOther.getShopState())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getShopId() == null ? 0 : this.getShopId().hashCode());
		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result
				+ (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37 * result
				+ (getGoodName() == null ? 0 : this.getGoodName().hashCode());
		result = 37 * result
				+ (getShopNum() == null ? 0 : this.getShopNum().hashCode());
		result = 37 * result
				+ (getAllPrice() == null ? 0 : this.getAllPrice().hashCode());
		result = 37 * result
				+ (getShopDate() == null ? 0 : this.getShopDate().hashCode());
		result = 37 * result
				+ (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37 * result
				+ (getPrice() == null ? 0 : this.getPrice().hashCode());
		result = 37 * result
				+ (getShopState() == null ? 0 : this.getShopState().hashCode());
		return result;


	}

}