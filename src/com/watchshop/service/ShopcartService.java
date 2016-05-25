package com.watchshop.service;

import java.util.Date;
import java.util.List;

import com.watchshop.pojo.Goodstable;
import com.watchshop.pojo.Shopcar;
import com.watchshop.pojo.Shopcartview;
import com.watchshop.pojo.Usertable;

public interface ShopcartService {
	/**
	 * 加入购物车
	 * @return
	 */
	boolean doIns(Long userId,Long goodsId,Long shopNum);
	/**
	 * 修改要购买的个数
	 * @return
	 */
	boolean doUpd(Long shopCarId,int updNum);
	/**
	 * 删除购物车记录
	 * @return
	 */
	boolean doDel(Long shopCarId);
	/**
	 * 通过用户查找购物车记录
	 */
	List<Shopcartview> findByUserIdk(Long userId,int pagesize,int pagecount);
	/**
	 * 加入购物车之前查重
	 */
	List<Shopcartview> findByGoodsIdAndUserId(Long goodId,Long userId);
}
