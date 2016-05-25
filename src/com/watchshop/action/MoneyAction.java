package com.watchshop.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.watchshop.pojo.Usertable;
import com.watchshop.service.MoneyTableService;

public class MoneyAction extends ActionSupport{
    private String resultString;
    private Long userId;
    private Double userMoney;
    private MoneyTableService service;
    private Long shopCarId;
    private Long goodId;
	public Long getGoodId() {
		return goodId;
	}
	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}
	public Long getShopCarId() {
		return shopCarId;
	}
	public void setShopCarId(Long shopCarId) {
		this.shopCarId = shopCarId;
	}
	public String getResultString() {
		return resultString;
	}
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Double getUserMoney() {
		return userMoney;
	}
	public void setUserMoney(Double userMoney) {
		this.userMoney = userMoney;
	}
	public MoneyTableService getService() {
		return service;
	}
	public void setService(MoneyTableService service) {
		this.service = service;
	}
	public String recharge(){
		Usertable user = this.service.doIns(userId, userMoney);
		ServletActionContext.getRequest().getSession().setAttribute("user",user);
		this.setResultString("true");
		return "success";
	}
	public String buy(){
		Usertable user = this.service.doDel(userId,userMoney,shopCarId);
		ServletActionContext.getRequest().getSession().setAttribute("user",user);
		this.setResultString("true");
		return "success";
	}
}
