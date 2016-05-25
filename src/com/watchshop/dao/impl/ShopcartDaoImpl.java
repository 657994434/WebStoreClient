package com.watchshop.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.watchshop.dao.ShopcartDao;
import com.watchshop.pojo.Shopcar;
import com.watchshop.pojo.Shopcartview;

public class ShopcartDaoImpl implements ShopcartDao {
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean doDel(Shopcar scar) {
		boolean bool = false;
		this.sessionFactory.getCurrentSession().delete(scar);
		bool = true;
		return bool;
	}

	public boolean doIns(Shopcar scar) {
		boolean bool = false;
		this.sessionFactory.getCurrentSession().save(scar);
		bool = true;
		return bool;
	}

	public boolean doUpd(Shopcar scar) {
		boolean bool = false;
		this.sessionFactory.getCurrentSession().update(scar);
		bool = true;
		return bool;
	}

	public List<Shopcartview> findByUserIdk(Long userId, int pagesize, int pagecount) {
		List<Shopcartview> list = new ArrayList<Shopcartview>();
		String hql = "from Shopcartview where id.userId = ?";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setLong(0, userId);
		query.setFirstResult((pagecount-1)* pagesize);
		query.setMaxResults(pagesize);
		list = query.list();
		return list;
	}

	public Shopcar findByShopcartIdk(Long shopCarId) {
		Shopcar scar = null;
		List<Shopcar> list = null;
		String hql = "from Shopcar where shopCarId = ?";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setLong(0, shopCarId);
		list = query.list();
		if(list.size()>0){
			scar = list.get(0);
		}
		return scar;
	}
	
	public List<Shopcartview> findByGoodsIdAndUserId(Long goodId,Long userId){
		List<Shopcartview> list = null;
		String hql = "from Shopcartview where id.goodId = ? and id.userId = ?";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setLong(0, goodId);
		query.setLong(1, userId);
		list = query.list();
		return list;
	}
}
