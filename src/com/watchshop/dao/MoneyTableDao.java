package com.watchshop.dao;

import java.util.List;

import com.watchshop.pojo.Moneytable;

public interface MoneyTableDao {
	/**
	 * 新增资金流动记录
	 * @return
	 */
	boolean doIns(Moneytable mon);
	/**
	 * 查看资金流动记录
	 */
	List<Moneytable> findByUserIdk(Long useridk,int pagesize,int pagecount);
}
