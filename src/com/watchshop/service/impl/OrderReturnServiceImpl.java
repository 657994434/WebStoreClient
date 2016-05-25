package com.watchshop.service.impl;

import java.util.Date;
import java.util.List;

import com.watchshop.service.OrderReturnService;
import com.watchshop.dao.MoneyTableDao;
import com.watchshop.dao.OrderReturnDao;
import com.watchshop.dao.OrderTableDao;
import com.watchshop.pojo.Moneytable;
import com.watchshop.pojo.Orderreturn;
import com.watchshop.pojo.Ordertable;
import com.watchshop.pojo.Usertable;
import com.watchshop.dao.UserTableDao;

public class OrderReturnServiceImpl implements OrderReturnService {
	private OrderReturnDao dao;
	private OrderTableDao dao2;
	private MoneyTableDao dao3;
	private UserTableDao dao4;
	private MoneyTableDao dao5;
	public MoneyTableDao getDao5() {
		return dao5;
	}

	public void setDao5(MoneyTableDao dao5) {
		this.dao5 = dao5;
	}

	public UserTableDao getDao4() {
		return dao4;
	}

	public void setDao4(UserTableDao dao4) {
		this.dao4 = dao4;
	}

	public MoneyTableDao getDao3() {
		return dao3;
	}

	public void setDao3(MoneyTableDao dao3) {
		this.dao3 = dao3;
	}

	public Usertable doIns(Long shopId,Long userId) {

		Ordertable ordertable = this.dao2.findbyshopid(shopId);
		ordertable.setShopState(2);
		this.dao2.doUpd(ordertable);
		Date date = new Date();
		Orderreturn orderreturn = new Orderreturn(ordertable,ordertable.getGoodPrice(),ordertable.getShopNum(),ordertable.getAllPrice(),date,1);
		this.dao.doIns(orderreturn);
		Usertable usertable = this.dao4.findByIdk(userId);
		Moneytable moneytable = new Moneytable(usertable,orderreturn.getAllPrice(),0,date,"退款");
		this.dao5.doIns(moneytable);
		Double newMoney = usertable.getUserMoney() + ordertable.getAllPrice();
		usertable.setUserMoney(newMoney);
		this.dao4.doUpd(usertable);	
		
		return usertable;
	}

	public OrderTableDao getDao2() {
		return dao2;
	}

	public void setDao2(OrderTableDao dao2) {
		this.dao2 = dao2;
	}

	public OrderReturnDao getDao() {
		return dao;
	}

	public void setDao(OrderReturnDao dao) {
		this.dao = dao;
	}

	public List<Orderreturn> findAll(int pagesize, int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public Orderreturn findByOrderIdk(Long orderidk,int pagesize,int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

}
