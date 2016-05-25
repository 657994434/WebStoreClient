package com.watchshop.service.impl;

import java.util.List;

import com.watchshop.service.GoodsTableService;
import com.watchshop.dao.GoodsTableDao;
import com.watchshop.pojo.Goodstable;

public class GoodsTableServiceImpl implements GoodsTableService {
	private GoodsTableDao dao;
	public boolean doDel(Goodstable goods) {
		// TODO Auto-generated method stub
		return false;
	}

	public GoodsTableDao getDao() {
		return dao;
	}

	public void setDao(GoodsTableDao dao) {
		this.dao = dao;
	}

	public boolean doIns(Goodstable goods) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean doUpd(Goodstable goods) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Goodstable> findAll(int pagesize, int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public Goodstable findByIdk(Long goodid) {
		// TODO Auto-generated method stub
		return this.dao.findByIdk(goodid);
	}

	public List<Goodstable> findByMaxSell(int pagesize, int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Goodstable> findByMinSell(int pagesize, int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Goodstable> findByName(String goodsname) {
		// TODO Auto-generated method stub
		return this.dao.findByName(goodsname);
	}

	public List<Goodstable> findByPrice(Double minprice, Double maxprice,
			int pagesize, int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Goodstable> findByType(int type, int pagesize, int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

}
