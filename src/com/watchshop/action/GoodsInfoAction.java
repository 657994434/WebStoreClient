package com.watchshop.action;


import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.watchshop.pojo.Goodstable;
import com.watchshop.service.GoodsTableService;

import net.sf.json.JSONArray;


public class GoodsInfoAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long goodId;
	private Goodstable good;
	public Goodstable getGood() {
		return good;
	}
	public void setGood(Goodstable good) {
		this.good = good;
	}

	private GoodsTableService service;
	private String searchinfo;
	private List<Goodstable> goods = new ArrayList<Goodstable>();

	public Long getGoodId() {
		return goodId;
	}
	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}
	public List<Goodstable> getGoods() {
		return goods;
	}
	public void setGoods(List<Goodstable> goods) {
		this.goods = goods;
	}

	public String getSearchinfo() {
		return searchinfo;
	}
	public void setSearchinfo(String searchinfo) {
		this.searchinfo = searchinfo;
	}

	public GoodsTableService getService() {
		return service;
	}
	public void setService(GoodsTableService service) {
		this.service = service;
	}
	public String search() throws UnsupportedEncodingException{	
		byte b[] = this.searchinfo.getBytes("ISO8859-1");
		String string = new  String(b,"utf-8");
//		System.out.println(searchinfo);
		try {
			goods = this.service.findByName(searchinfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator it = goods.iterator();
		while (it.hasNext()) {
			Goodstable object = (Goodstable) it.next();
			object.setGoodRemark(String.valueOf((int)((1-object.getAbatePrive()/object.getGoodPrice())*100)));			
		}		
	    this.setGoods(goods);
//	    System.out.println(goods);
	    return "success";	
	}
	
	public String single(){
		good = this.service.findByIdk(goodId);		
//		System.out.println(good);
		if(good.getGoodSex()==1){
			good.setGoodRemark("男");
		}else{
			good.setGoodRemark("女");			
		}
		
		return "single";
	}
}
