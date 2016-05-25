package com.watchshop.service.impl;

import java.util.Date;
import java.util.List;

import com.watchshop.dao.GoodsTableDao;
import com.watchshop.dao.ShopcartDao;
import com.watchshop.dao.UserTableDao;
import com.watchshop.pojo.Goodstable;
import com.watchshop.pojo.Shopcar;
import com.watchshop.pojo.Shopcartview;
import com.watchshop.service.ShopcartService;

public class ShopcartServiceImpl implements ShopcartService {
	private ShopcartDao dao;
	private UserTableDao userdao;
	private GoodsTableDao goodsdao;

	public boolean doDel(Long shopCarId) {
		return this.dao.doDel(this.dao.findByShopcartIdk(shopCarId));
	}

	public boolean doIns(Long userId,Long goodsId,Long shopNum) {
		Goodstable goods = goodsdao.findByIdk(goodsId);
		Shopcar scar = new Shopcar(userdao.findByIdk(userId),goods,goods.getGoodPrice(),shopNum,goods.getGoodPrice(),new Date(),1);
		return this.dao.doIns(scar);
	}

	public boolean doUpd(Long shopCarId,int updNum) {
		try {
			Shopcar scar = this.dao.findByShopcartIdk(shopCarId);
			scar.setShopNum(scar.getShopNum()+updNum);
			return this.dao.doUpd(scar);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Shopcartview> findByUserIdk(Long userId, int pagesize, int pagecount) {
		return this.dao.findByUserIdk(userId, pagesize, pagecount);
	}
	
	public List<Shopcartview> findByGoodsIdAndUserId(Long goodId,Long userId){
		return this.dao.findByGoodsIdAndUserId(goodId, userId);
	}
	
	//getter和setter方法
	
	public ShopcartDao getDao() {
		return dao;
	}

	public void setDao(ShopcartDao dao) {
		this.dao = dao;
	}

	public UserTableDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserTableDao userdao) {
		this.userdao = userdao;
	}

	public GoodsTableDao getGoodsdao() {
		return goodsdao;
	}

	public void setGoodsdao(GoodsTableDao goodsdao) {
		this.goodsdao = goodsdao;
	}
}
