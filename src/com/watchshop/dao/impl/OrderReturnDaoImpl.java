package com.watchshop.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.watchshop.dao.OrderReturnDao;
import com.watchshop.pojo.Orderreturn;

public class OrderReturnDaoImpl implements OrderReturnDao {
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private SessionFactory sessionFactory;
	public boolean doIns(Orderreturn orderreturn) {
		// TODO Auto-generated method stub
				boolean bool = false;
				try {
					this.sessionFactory.getCurrentSession().save(orderreturn);
					bool = true;
				} catch (Exception e) {
					e.printStackTrace();
				}
				return bool;
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
