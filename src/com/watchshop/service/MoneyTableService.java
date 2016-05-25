package com.watchshop.service;

import java.util.List;

import com.watchshop.pojo.Moneytable;
import com.watchshop.pojo.Usertable;

public interface MoneyTableService {
	/**
	 * 新增资金流动记录
	 * @return
	 */
	Usertable doIns(Long userId,Double money);
	/**
	 * 查看资金流动记录
	 */
	List<Moneytable> findByUserIdk(Long useridk,int pagesize,int pagecount);
	/**
	 * 花费资金
	 */
	Usertable doDel(Long userId,Double money,Long shopCarId);
}
