package com.watchshop.pojo;

/**
 * ShopcartviewId entity. @author MyEclipse Persistence Tools
 */

public class ShopcartviewId implements java.io.Serializable {

	// Fields

	private Long userId;
	private Long goodId;
	private Long shopCarId;
	private String goodName;
	private Integer shopNum;
	private Double allPrice;
	private String goodRemark;

	// Constructors

	/** default constructor */
	public ShopcartviewId() {
	}

	/** full constructor */
	public ShopcartviewId(Long userId, Long goodId, Long shopCarId,
			String goodName, Integer shopNum, Double allPrice, String goodRemark) {
		this.userId = userId;
		this.goodId = goodId;
		this.shopCarId = shopCarId;
		this.goodName = goodName;
		this.shopNum = shopNum;
		this.allPrice = allPrice;
		this.goodRemark = goodRemark;
	}

	// Property accessors

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGoodId() {
		return this.goodId;
	}

	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}

	public Long getShopCarId() {
		return this.shopCarId;
	}

	public void setShopCarId(Long shopCarId) {
		this.shopCarId = shopCarId;
	}

	public String getGoodName() {
		return this.goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public Integer getShopNum() {
		return this.shopNum;
	}

	public void setShopNum(Integer shopNum) {
		this.shopNum = shopNum;
	}

	public Double getAllPrice() {
		return this.allPrice;
	}

	public void setAllPrice(Double allPrice) {
		this.allPrice = allPrice;
	}

	public String getGoodRemark() {
		return this.goodRemark;
	}

	public void setGoodRemark(String goodRemark) {
		this.goodRemark = goodRemark;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ShopcartviewId))
			return false;
		ShopcartviewId castOther = (ShopcartviewId) other;

		return ((this.getUserId() == castOther.getUserId()) || (this
				.getUserId() != null
				&& castOther.getUserId() != null && this.getUserId().equals(
				castOther.getUserId())))
				&& ((this.getGoodId() == castOther.getGoodId()) || (this
						.getGoodId() != null
						&& castOther.getGoodId() != null && this.getGoodId()
						.equals(castOther.getGoodId())))
				&& ((this.getShopCarId() == castOther.getShopCarId()) || (this
						.getShopCarId() != null
						&& castOther.getShopCarId() != null && this
						.getShopCarId().equals(castOther.getShopCarId())))
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
				&& ((this.getGoodRemark() == castOther.getGoodRemark()) || (this
						.getGoodRemark() != null
						&& castOther.getGoodRemark() != null && this
						.getGoodRemark().equals(castOther.getGoodRemark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result
				+ (getGoodId() == null ? 0 : this.getGoodId().hashCode());
		result = 37 * result
				+ (getShopCarId() == null ? 0 : this.getShopCarId().hashCode());
		result = 37 * result
				+ (getGoodName() == null ? 0 : this.getGoodName().hashCode());
		result = 37 * result
				+ (getShopNum() == null ? 0 : this.getShopNum().hashCode());
		result = 37 * result
				+ (getAllPrice() == null ? 0 : this.getAllPrice().hashCode());
		result = 37
				* result
				+ (getGoodRemark() == null ? 0 : this.getGoodRemark()
						.hashCode());
		return result;
	}

}