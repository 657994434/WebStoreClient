package com.watchshop.dao;

import java.util.List;

import com.watchshop.pojo.OrderUserGoodsAddress;
import com.watchshop.pojo.OrderUserGoodsAddressId;
import com.watchshop.pojo.Ordertable;
import com.watchshop.pojo.Usertable;

public interface OrderTableDao {
	/**
	 * 新增订单
	 * @return
	 */
	boolean doIns(Ordertable order);
	/**
	 * 修改订单
	 * @return
	 */
	boolean doUpd(Ordertable order);
	/**
	 * 删除订单
	 * @return
	 */
	boolean doDel(Ordertable order);
	/**
	 * 通过用户查看订单
	 */
	List<OrderUserGoodsAddress> findByUserIdk(Long useridk);
	/**
	 * 通过商品查看订单
	 */
	List<Ordertable> findByGoodsIdk(Long goodsidk,int pagesize,int pagecount);
	/**
	* 查看全部订单
	*/
	List<Ordertable> findAll(int pagesize,int pagecount);
    /**
     * shopid查找订单
     */
	Ordertable findbyshopid(Long shopid);
	
}
