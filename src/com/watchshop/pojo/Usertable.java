package com.watchshop.pojo;

import java.util.Date;

/**
 * Usertable entity. @author MyEclipse Persistence Tools
 */

public class Usertable implements java.io.Serializable {

	// Fields

	private Long userId;
	private String userName;
	private String password;
	private Date regeisterDate;
	private String idCard;
	private String realName;
	private String telphone;
	private Date birthday;
	private Integer userState;
	private Integer role;
	private Double userMoney;
	public Double getUserMoney() {
		return userMoney;
	}

	public void setUserMoney(Double userMoney) {
		this.userMoney = userMoney;
	}

	// Constructors
	/** default constructor */
	public Usertable() {
	}

	/** full constructor */
	public Usertable(String userName, String password, Date regeisterDate,
			String idCard, String realName, String telphone, Date birthday,
			Integer userState, Integer role,Double userMoney) {
		this.userName = userName;
		this.password = password;
		this.regeisterDate = regeisterDate;
		this.idCard = idCard;
		this.realName = realName;
		this.telphone = telphone;
		this.birthday = birthday;
		this.userState = userState;
		this.role = role;
		this.userMoney = userMoney;
	}

	// Property accessors

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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegeisterDate() {
		return this.regeisterDate;
	}

	public void setRegeisterDate(Date regeisterDate) {
		this.regeisterDate = regeisterDate;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getTelphone() {
		return this.telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getUserState() {
		return this.userState;
	}

	public void setUserState(Integer userState) {
		this.userState = userState;
	}

	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

}