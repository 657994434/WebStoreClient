package com.watchshop.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.watchshop.dao.AddressDao;
import com.watchshop.pojo.Address;
import com.watchshop.pojo.OrderUserGoodsAddress;

public class AddressDaoImpl implements AddressDao {
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean doDel(Address add) {
		boolean flag = false;
		this.sessionFactory.getCurrentSession().delete(add);
		flag = true;
		return flag;
	}

	public boolean doIns(Address add) {
		// TODO Auto-generated method stub
		boolean bool = false;
		try {
			this.sessionFactory.getCurrentSession().save(add);
			bool = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bool;
	}

	public boolean doUpd(Address add) {
		// TODO Auto-generated method stub
		return false;
	}

	public Address findByIdk(Long addidk) {
	    Address address = null;
	    String hql ="from Address where addressId = ?";
	    Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
	    query.setLong(0, addidk);
	    List<Address> list = query.list();
	    if (list.size()!=0) {
			address = list.get(0);
		}
	   
	    
		return address;
	}

	public List<Address> findByUserIdk(Long userIdk) {
		// TODO Auto-generated method stub
		List<Address> list = new ArrayList<Address>();
		String hql="from Address where usertable.userId=?";
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		query.setLong(0, userIdk);
		list = query.list();			
		return list;
	}

}
