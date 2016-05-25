package com.watchshop.service;

import java.util.List;

import com.watchshop.pojo.Orderreturn;
import com.watchshop.pojo.Usertable;

public interface OrderReturnService {
	/**
	 * 新增订单退货记录
	 * @return
	 */
	Usertable doIns(Long shopId,Long userId);
	/**
	 * 查看某个订单的退货记录
	 * @param goodsidk
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
