package com.watchshop.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.watchshop.pojo.OrderUserGoodsAddress;
import com.watchshop.pojo.Ordertable;
import com.watchshop.service.OrderTableService;

public class OrderTableAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<OrderUserGoodsAddress> list;
	private Long userId;
	private OrderTableService service;
	public OrderTableService getService() {
		return service;
	}
	public void setService(OrderTableService service) {
		this.service = service;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<OrderUserGoodsAddress> getList() {
		return list;
	}
	public void setList(List<OrderUserGoodsAddress> list) {
		this.list = list;
	}
	public String order(){
		
		list = this.service.findByUserIdk(userId);
		this.setList(list);		
		return "success";
	}

}
