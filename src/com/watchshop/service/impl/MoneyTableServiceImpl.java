package com.watchshop.service.impl;

import java.util.Date;
import java.util.List;

import com.watchshop.service.MoneyTableService;

import jdk.nashorn.internal.ir.Flags;

import com.watchshop.dao.AddressDao;
import com.watchshop.dao.GoodsTableDao;
import com.watchshop.dao.MoneyTableDao;
import com.watchshop.dao.OrderTableDao;
import com.watchshop.dao.ShopcartDao;
import com.watchshop.dao.UserTableDao;
import com.watchshop.pojo.Address;
import com.watchshop.pojo.Goodstable;
import com.watchshop.pojo.Moneytable;
import com.watchshop.pojo.Ordertable;
import com.watchshop.pojo.Shopcar;
import com.watchshop.pojo.Shopcartview;
import com.watchshop.pojo.Usertable;

public class MoneyTableServiceImpl implements MoneyTableService {
	private MoneyTableDao dao;
	private UserTableDao dao2;
	private ShopcartDao dao3;
	private AddressDao dao4;
	private OrderTableDao dao5;
	public ShopcartDao getDao3() {
		return dao3;
	}

	public void setDao3(ShopcartDao dao3) {
		this.dao3 = dao3;
	}

	public AddressDao getDao4() {
		return dao4;
	}

	public void setDao4(AddressDao dao4) {
		this.dao4 = dao4;
	}

	public OrderTableDao getDao5() {
		return dao5;
	}

	public void setDao5(OrderTableDao dao5) {
		this.dao5 = dao5;
	}

	public MoneyTableDao getDao() {
		return dao;
	}

	public void setDao(MoneyTableDao dao) {
		this.dao = dao;
	}

	public UserTableDao getDao2() {
		return dao2;
	}

	public void setDao2(UserTableDao dao2) {
		this.dao2 = dao2;
	}

	public Usertable doIns(Long userId,Double money) {
		Usertable usertable = this.dao2.findByIdk(userId);
		Date date = new Date();
		Moneytable moneytable = new Moneytable(usertable,money,0,date,"充值");
		this.dao.doIns(moneytable);
		double oldMoney = usertable.getUserMoney();
		Double newMoney = money + oldMoney;
		usertable.setUserMoney(newMoney);
		boolean flag =  this.dao2.doUpd(usertable);
		
		return usertable;

	}

	public List<Moneytable> findByUserIdk(Long useridk, int pagesize,
			int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usertable doDel(Long userId, Double money,Long shopCarId) {
		Usertable usertable = this.dao2.findByIdk(userId);
		Date date = new Date();
		Moneytable moneytable = new Moneytable(usertable,money,1,date,"花去");
		this.dao.doIns(moneytable);
		double oldMoney = usertable.getUserMoney();
		Double newMoney =  oldMoney - money;
		usertable.setUserMoney(newMoney);
		boolean flag =  this.dao2.doUpd(usertable);
		Address address = this.dao4.findByUserIdk(userId).get(0);
		Shopcar shopInfo = this.dao3.findByShopcartIdk(shopCarId);
		Ordertable ordertable = new Ordertable(usertable,address,shopInfo.getGoodstable(),shopInfo.getGoodPrice(),shopInfo.getShopNum(),shopInfo.getGoodPrice()*shopInfo.getShopNum(),shopInfo.getGoodstable().getGoodRemark(),date,"1",1);
		this.dao5.doIns(ordertable);
		return usertable;
	}

}
