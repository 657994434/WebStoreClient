package com.watchshop.action;

import java.util.List;

import com.watchshop.pojo.Shopcartview;
import com.watchshop.service.ShopcartService;

public class ShopcarAction{
	private ShopcartService service;
	private int pagesize;
	private int pagecount;
	private String resultString;
	private Long goodId;
	private Long userId;
	private Long shopCarId;
	private Long shopNum;
	private int updNum;
	
	public String doIns(){
		boolean bool =false;
		bool = this.service.doIns(this.userId,this.goodId,this.shopNum);
		this.setResultString(String.valueOf(bool));
		return "success";				
	}
	
	public String doInsCheck(){
		List<Shopcartview> list = this.service.findByGoodsIdAndUserId(goodId, userId);
		if(list.size()>0){
			this.setShopCarId(list.get(0).getId().getShopCarId());
			this.setResultString("true");
			return "success";
		}
		this.setResultString("false");
		return "fail";
	}
	
	public String doUpd(){
		boolean bool =false;
		bool = this.service.doUpd(this.shopCarId,this.updNum);
		this.setResultString(String.valueOf(bool));
		return "success";				
	}
	
	public String doDel(){
		boolean bool =false;
		bool = this.service.doDel(this.shopCarId);
		this.setResultString(String.valueOf(bool));
		return "success";				
	}
	
	public String findAll(){
		List<Shopcartview> list = this.service.findByUserIdk(userId, pagesize, pagecount);
		StringBuffer sb = new StringBuffer();
		if(list.size() != 0){
			for(int i = 0 ; i <list.size() ; i ++){
				Shopcartview pojo = list.get(i);
				sb.append("<ul class='cart-header'>");
				sb.append("<div class='close1' onclick = 'goDel("+pojo.getId().getShopCarId()+")'> </div>");
				sb.append("<li class='ring-in'><a href='../GoodsInfoAction_single?goodId="+pojo.getId().getGoodId()+"' ><img src='../images/c-1.jpg' class='img-responsive' alt=''></a></li>");
				sb.append("<li><span class='name'>"+pojo.getId().getGoodName()+"</span></li>");
				sb.append("<li><span class='cost'>");
				if(pojo.getId().getShopNum() > 1){
					sb.append("<input type = 'button' id='minus' value = '-' onclick = 'goMinus("+pojo.getId().getShopCarId()+")' />");
				}else{
					sb.append("<input type = 'button' id='minus' value = '-' onclick = 'goMinus("+pojo.getId().getShopCarId()+")' disabled = 'true' />");
				}
				sb.append(pojo.getId().getShopNum()+"<input type = 'button' id='gal' value = '+' onclick = 'goGal("+pojo.getId().getShopCarId()+")' /></span></li>");
				sb.append("<li><span class='cost'>"+pojo.getId().getAllPrice()+"</span></li>");
				sb.append("<li><span>"+pojo.getId().getGoodRemark()+"</span>");
				sb.append("<p>Delivered in 2-3 business days</p></li>");
				sb.append(
						"<a herf = '#' class='enter' onclick = goPay("+pojo.getId().getShopCarId()+","+pojo.getId().getAllPrice()+","+pojo.getId().getShopCarId()+")><h3>结账</h3></a></li>");
				sb.append("<div class='clearfix'> </div>");
				sb.append("</ul>");
				
			}
			this.setResultString(sb.toString());
			return "success";
		}
		this.setResultString("对不起，您的购物车为空，请添加一些商品哟~");
		return "fail";
	}
	
	public ShopcartService getService() {
		return service;
	}
	public void setService(ShopcartService service) {
		this.service = service;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public String getResultString() {
		return resultString;
	}
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}
	public Long getGoodId() {
		return goodId;
	}
	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getShopCarId() {
		return shopCarId;
	}
	public void setShopCarId(Long shopCarId) {
		this.shopCarId = shopCarId;
	}

	public Long getShopNum() {
		return shopNum;
	}

	public void setShopNum(Long shopNum) {
		this.shopNum = shopNum;
	}

	public int getUpdNum() {
		return updNum;
	}

	public void setUpdNum(int updNum) {
		this.updNum = updNum;
	}
	
}
