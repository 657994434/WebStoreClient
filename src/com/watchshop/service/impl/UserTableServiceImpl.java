package com.watchshop.service.impl;

import java.util.List;

import com.watchshop.service.UserTableService;
import com.watchshop.dao.UserTableDao;
import com.watchshop.dao.impl.UserTableDaoImpl;
import com.watchshop.pojo.Usertable;

public class UserTableServiceImpl implements UserTableService {
	private UserTableDao dao;
	
	public UserTableDao getDao() {
		return dao;
	}

	public void setDao(UserTableDao dao) {
		this.dao = dao;
	}

	public Usertable LoginForAdmin(String username,String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usertable LoginForUser(String username,String password) {
		// TODO Auto-generated method stub
		return this.dao.LoginForUser(username, password);
	}

	public boolean doDel(Usertable user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean doIns(Usertable user) {
		// TODO Auto-generated method stub
		return this.dao.doIns(user);
	}

	public boolean doUpd(Usertable user) {
		// TODO Auto-generated method stub
		return this.dao.doUpd(user);
	}

	public List<Usertable> findAll(int pagesize, int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usertable findByIdk(Long idk) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Usertable> findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
