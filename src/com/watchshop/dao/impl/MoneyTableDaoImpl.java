package com.watchshop.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.watchshop.dao.MoneyTableDao;
import com.watchshop.pojo.Moneytable;

public class MoneyTableDaoImpl implements MoneyTableDao {
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean doIns(Moneytable mon) {
		boolean bool = false;
		try {
			this.sessionFactory.getCurrentSession().save(mon);
			bool = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bool;
	}

	public List<Moneytable> findByUserIdk(Long useridk, int pagesize,
			int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

}
