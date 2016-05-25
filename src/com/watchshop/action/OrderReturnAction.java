package com.watchshop.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.watchshop.pojo.OrderUserGoodsAddress;
import com.watchshop.pojo.Orderreturn;
import com.watchshop.pojo.Usertable;
import com.watchshop.service.OrderReturnService;

public class OrderReturnAction extends ActionSupport{
	private String resultString;
	private Long shopId;
	private OrderReturnService service;
	private List<OrderUserGoodsAddress> list;
	private String userName;
	private Long userId;
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	private Usertable service2;
	public String getUserName() {
		return userName;
	}

	public Usertable getService2() {
		return service2;
	}

	public void setService2(Usertable service2) {
		this.service2 = service2;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<OrderUserGoodsAddress> getList() {
		return list;
	}

	public void setList(List<OrderUserGoodsAddress> list) {
		this.list = list;
	}

	public OrderReturnService getService() {
		return service;
	}

	public void setService(OrderReturnService service) {
		this.service = service;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getResultString() {
		return resultString;
	}

	public void setResultString(String resultString) {
		this.resultString = resultString;
	}
	public String  returngood(){
		Usertable usertable = this.service.doIns(shopId,userId);
		ServletActionContext.getRequest().getSession().setAttribute("user", usertable);
		this.setResultString("true");
	    return "success";
	
	}
	
}
