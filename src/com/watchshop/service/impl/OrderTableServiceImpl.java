package com.watchshop.service.impl;

import java.util.List;

import com.watchshop.service.OrderTableService;
import com.watchshop.dao.OrderTableDao;
import com.watchshop.pojo.OrderUserGoodsAddress;
import com.watchshop.pojo.OrderUserGoodsAddressId;
import com.watchshop.pojo.Ordertable;

public class OrderTableServiceImpl implements OrderTableService {
	private OrderTableDao dao;
	public OrderTableDao getDao() {
		return dao;
	}

	public void setDao(OrderTableDao dao) {
		this.dao = dao;
	}

	public boolean doDel(Ordertable order) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean doIns(Ordertable order) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean doUpd(Ordertable order) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Ordertable> findAll(int pagesize, int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Ordertable> findByGoodsIdk(Long goodsidk, int pagesize,
			int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<OrderUserGoodsAddress> findByUserIdk(Long useridk) {
		// TODO Auto-generated method stub
		
		return this.dao.findByUserIdk(useridk);
	}

}
