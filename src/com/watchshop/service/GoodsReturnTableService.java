package com.watchshop.service;

import java.util.List;

import com.watchshop.pojo.Goodsreturntable;

public interface GoodsReturnTableService {
	/**
	 * 进货退货记录
	 * @param grt
	 * @return
	 */
	boolean doIns(Goodsreturntable grt);
	/**
	 * 查看某个货物的进货退货记录
	 * @param goodsidk
	 * @return
	 */
	List<Goodsreturntable> findByGoodsIdk(Long goodsidk,int pagesize,int pagecount);
	/**
	 * 查看全部进货退货记录
	 */
	List<Goodsreturntable> findAll(int pagesize,int pagecount);
}
