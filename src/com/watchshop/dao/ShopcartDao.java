package com.watchshop.dao;

import java.util.List;

import com.watchshop.pojo.Shopcar;
import com.watchshop.pojo.Shopcartview;

public interface ShopcartDao {
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
	List<Shopcartview> findByUserIdk(Long userId,int pagesize,int pagecount);
	/**
	 * 通过购物车主键查找购物车记录
	 */
	Shopcar findByShopcartIdk(Long shopCarId);
	/**
	 * 加入购物车之前查重
	 */
	List<Shopcartview> findByGoodsIdAndUserId(Long goodId,Long userId);
}
