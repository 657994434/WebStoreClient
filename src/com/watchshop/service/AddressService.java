package com.watchshop.service;

import java.util.List;

import com.watchshop.pojo.Address;

public interface AddressService {
	/**
	 * 新增收货地址
	 * @return
	 */
	boolean doIns(String address,String linkman,String tel,Long userId);
	/**
	 * 修改收货地址
	 * @return
	 */
	boolean doUpd(Address add);
	/**
	 * 删除收货地址
	 * 即从数据库中直接删除 不留记录
	 * @return
	 */
	boolean doDel(Long addressId);
	/**
	 * 通过收货地址主键查找收货地址
	 */
	Address findByIdk(Long addidk);
	/**
	 * 通过所属用户查找该用户的全部收货地址
	 */
	List<Address> findByUserIdk(Long userIdk);
}
