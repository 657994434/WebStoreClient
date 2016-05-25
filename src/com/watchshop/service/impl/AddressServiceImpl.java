package com.watchshop.service.impl;

import java.util.List;

import com.watchshop.service.AddressService;
import com.watchshop.dao.AddressDao;
import com.watchshop.dao.UserTableDao;
import com.watchshop.pojo.Address;
import com.watchshop.pojo.Usertable;

public class AddressServiceImpl implements AddressService {
	private AddressDao dao;
	private UserTableDao dao2;
	public UserTableDao getDao2() {
		return dao2;
	}

	public void setDao2(UserTableDao dao2) {
		this.dao2 = dao2;
	}

	public AddressDao getDao() {
		return dao;
	}

	public void setDao(AddressDao dao) {
		this.dao = dao;
	}

	public boolean doDel(Long addressId) {
		Address address = this.dao.findByIdk(addressId);
		boolean flag = this.dao.doDel(address);
		return flag;
	}

	public boolean doIns(String address,String linkman,String tel,Long userId) {
		// TODO Auto-generated method stub
		Usertable usertable = this.dao2.findByIdk(userId);
		Address addr = new Address(usertable,address,linkman,tel,1,1);
		boolean flag = this.dao.doIns(addr);
		if(flag == true){
			return true ;
		}
		  return false;
	}

	public boolean doUpd(Address add) {
		// TODO Auto-generated method stub
		return false;
	}

	public Address findByIdk(Long addidk) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Address> findByUserIdk(Long userIdk) {
		// TODO Auto-generated method stub
		return this.dao.findByUserIdk(userIdk);
	}

}
