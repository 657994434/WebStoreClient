package com.watchshop.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.watchshop.dao.GoodsEvaluationDao;
import com.watchshop.pojo.Goodsevaluation;

public class GoodsEvaluationDaoImpl implements GoodsEvaluationDao {
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean doDel(Goodsevaluation sev) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean doIns(Goodsevaluation sev) {
		boolean bool = false;
		try {
			this.sessionFactory.getCurrentSession().save(sev);
			bool = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bool;
	}

	public List<Goodsevaluation> findAll(int pagesize, int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Goodsevaluation> findByGoodsIdk(Long goodsidk, int pagesize,
			int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public Goodsevaluation findByIdk(Long idk) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Goodsevaluation> findByOrderIdk(Long orderidk, int pagesize,
			int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

}
