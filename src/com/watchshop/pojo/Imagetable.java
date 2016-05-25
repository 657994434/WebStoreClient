package com.watchshop.pojo;

/**
 * Imagetable entity. @author MyEclipse Persistence Tools
 */

public class Imagetable implements java.io.Serializable {

	// Fields

	private Long imgId;
	private Goodstable goodstable;
	private String imgName;
	private String imgAdd;
	private Integer imgState;

	// Constructors

	/** default constructor */
	public Imagetable() {
	}

	/** full constructor */
	public Imagetable(Goodstable goodstable, String imgName, String imgAdd,
			Integer imgState) {
		this.goodstable = goodstable;
		this.imgName = imgName;
		this.imgAdd = imgAdd;
		this.imgState = imgState;
	}

	// Property accessors

	public Long getImgId() {
		return this.imgId;
	}

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public Goodstable getGoodstable() {
		return this.goodstable;
	}

	public void setGoodstable(Goodstable goodstable) {
		this.goodstable = goodstable;
	}

	public String getImgName() {
		return this.imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getImgAdd() {
		return this.imgAdd;
	}

	public void setImgAdd(String imgAdd) {
		this.imgAdd = imgAdd;
	}

	public Integer getImgState() {
		return this.imgState;
	}

	public void setImgState(Integer imgState) {
		this.imgState = imgState;
	}

}