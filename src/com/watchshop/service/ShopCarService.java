package com.watchshop.service;

import java.util.List;

import com.watchshop.pojo.Shopcar;

public interface ShopCarService {
	/**
	 * 加入购物车
	 * @return
	 */
	boolean doIns(Shopcar scar);
	/**
	 * 修改要购买的个数
	 * @return
	 */
	boolean doUpd(Shopcar scar);
	/**
	 * 删除购物车记录
	 * @return
	 */
	boolean doDel(Shopcar scar);
	/**
	 * 通过用户查找购物车记录
	 */
	List<Shopcar> findByUserIdk(Long useridk,int pagesize,int pagecount);
}
