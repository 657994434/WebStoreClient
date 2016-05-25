package com.watchshop.service;

import java.util.List;

import com.watchshop.pojo.Usertable;

public interface UserTableService {
	/**
	 * 新增用户
	 */
	boolean doIns(Usertable user);
	/**
	 * 删除用户
	 */
	boolean doDel(Usertable user);
	/**
	 * 修改用户
	 */
	boolean doUpd(Usertable user);
	/**
	 * 管理员登录登录
	 */
	Usertable LoginForAdmin(String username,String password);
	/**
	 * 用户登录登录
	 */
	Usertable LoginForUser(String username,String password);
	/**
	 * 按主键查找
	 */
	Usertable findByIdk(Long idk);
	/**
	 * 按姓名查找
	 */
	List<Usertable> findByUserName(String username);
	/**
	 * 查找全部
	 */
	List<Usertable> findAll(int pagesize,int pagecount);
}

