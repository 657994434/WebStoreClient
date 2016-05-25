package com.watchshop.dao;

import java.util.List;

import com.watchshop.pojo.Orderreturn;

public interface OrderReturnDao {
	/**
	 * 新增订单退货记录
	 * @return
	 */
	boolean doIns(Orderreturn orderreturn);
	/**
	 * 查看某个订单的退货记录
	 * @param orderidk
	 * @param pagesize
	 * @param pagecount
	 * @return
	 */
	Orderreturn findByOrderIdk(Long orderidk,int pagesize,int pagecount);
	/**
	 * 查看全部订单退货记录
	 */
	List<Orderreturn> findAll(int pagesize,int pagecount);
}
