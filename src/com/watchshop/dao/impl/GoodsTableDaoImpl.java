package com.watchshop.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.watchshop.dao.GoodsTableDao;
import com.watchshop.pojo.Goodstable;

public class GoodsTableDaoImpl implements GoodsTableDao {
	private SessionFactory sessionFactory;
	public boolean doDel(Goodstable goods) {
		// TODO Auto-generated method stub
		return false;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
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
	
		Goodstable goodstable = (Goodstable)this.sessionFactory.getCurrentSession().get(Goodstable.class, goodid);
		return goodstable;
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
		String hql = "from Goodstable a where a.goodName like ?";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0,"%"+goodsname+"%");
		List<Goodstable> goods = query.list();
		return goods;
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
