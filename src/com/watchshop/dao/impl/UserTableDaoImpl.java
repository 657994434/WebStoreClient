package com.watchshop.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.watchshop.dao.UserTableDao;
import com.watchshop.pojo.Usertable;


public class UserTableDaoImpl implements UserTableDao {
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Usertable LoginForAdmin(String username,String password) {		
		return null;
	}

	public Usertable LoginForUser(String username,String password) {
		// TODO Auto-generated method stub
		Usertable user = null;
		try {
			String hql = "from Usertable where userName = ? and password = ? and userState = 1";
			Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
			query.setString(0, username);
			query.setString(1, password);
			List<Usertable> list = query.list();
			if(list.size() != 0){
				user = list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return user;
	}

	public boolean doDel(Usertable user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean doIns(Usertable user) {
		// TODO Auto-generated method stub
		boolean bool = false;
		try {
			this.sessionFactory.getCurrentSession().save(user);
			bool = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bool;
	}

	public boolean doUpd(Usertable user) {
		// TODO Auto-generated method stub
		boolean bool = false;
		try {
			this.sessionFactory.getCurrentSession().update(user);
			bool = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bool;
	}

	public List<Usertable> findAll(int pagesize, int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usertable findByIdk(Long idk) {
		// TODO Auto-generated method stub
		Usertable usertable = null;
		String hql = "from Usertable where userId = ?";
		Query query  = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setLong(0, idk);
		List<Usertable> list = query.list();
		if(list.size()!=0){
			usertable = list.get(0);
		}
		
		return usertable;
	}

	public List<Usertable> findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
