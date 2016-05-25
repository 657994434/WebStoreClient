package com.watchshop.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.watchshop.pojo.Address;
import com.watchshop.service.AddressService;

public class AddressAction extends ActionSupport{
	private String resultString;
	private String address;
	private String linkman;
	private String tel;
	private Long userId;
	private AddressService service;
	private List<Address> list;
	private Long addressId;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public List<Address> getList() {
		return list;
	}
	public void setList(List<Address> list) {
		this.list = list;
	}
	public String getResultString() {
		return resultString;
	}
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public AddressService getService() {
		return service;
	}
	public void setService(AddressService service) {
		this.service = service;
	}
	public String doIns(){
		Boolean flag = this.service.doIns(address, linkman, tel, userId);
		if(flag == true){
			this.setResultString("true");
			return "success";
		}else{
			this.setResultString("false");
			return "fail";
		}
	}
	public String addresss(){
		list = this.service.findByUserIdk(userId);
		this.setList(list);
		return "address";
	}
	public String doDel(){
		Boolean flag = this.service.doDel(addressId);
		if(flag == true){
			this.setResultString("true");
			return "success";
		}else{
			this.setResultString("false");
			return "fail";
		}
		
	}
}
