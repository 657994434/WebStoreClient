package com.watchshop.action;

import com.opensymphony.xwork2.ActionSupport;
import com.watchshop.service.GoodsEvaluationService;

public class GoodsEvaluationAction extends ActionSupport{
	private Long userId;
	private String resultString;
	private GoodsEvaluationService service;
	private String say;
	public String getSay() {
		return say;
	}
	public void setSay(String say) {
		this.say = say;
	}
	public GoodsEvaluationService getService() {
		return service;
	}
	public void setService(GoodsEvaluationService service) {
		this.service = service;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getResultString() {
		return resultString;
	}
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}
	public String say(){
		boolean flag = this.service.doIns(userId,say);
		if(flag == true){
			this.setResultString("true");
			return "success";
		}else{
			this.setResultString("false");
			return "fail";
		}
	}
}
