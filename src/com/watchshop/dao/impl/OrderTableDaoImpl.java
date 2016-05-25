package com.watchshop.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.watchshop.dao.OrderTableDao;
import com.watchshop.pojo.Goodstable;
import com.watchshop.pojo.OrderUserGoodsAddress;
import com.watchshop.pojo.OrderUserGoodsAddressId;
import com.watchshop.pojo.Ordertable;
import com.watchshop.pojo.Usertable;

import jdk.nashorn.internal.ir.Flags;

public class OrderTableDaoImpl implements OrderTableDao {
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean doDel(Ordertable order) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean doIns(Ordertable order) {
		boolean bool = false;
		try {
			this.sessionFactory.getCurrentSession().save(order);
			bool = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bool;
	}

	public boolean doUpd(Ordertable order) {
			// TODO Auto-generated method stub
			boolean bool = false;
			try {
				this.sessionFactory.getCurrentSession().update(order);
				bool = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return bool;
		
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
		List<OrderUserGoodsAddress> list = new ArrayList<OrderUserGoodsAddress>();
		String hql="from OrderUserGoodsAddress where id.userId=?";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setLong(0, useridk);
		list = query.list();			
		return list;
	}
    /**
     * shopid查找订单
     */
	public Ordertable findbyshopid(Long shopid){
		System.out.println("wfwe");
		Ordertable ordertable = null;
		String hql = "from Ordertable where shopId = ?";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setLong(0, shopid);
		List<Ordertable> list = query.list();
		if(list.size() != 0){
			ordertable = list.get(0);
		}
		return ordertable;
				
	}

}
