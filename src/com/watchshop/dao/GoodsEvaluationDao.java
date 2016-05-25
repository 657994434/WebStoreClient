package com.watchshop.dao;

import java.util.List;

import com.watchshop.pojo.Goodsevaluation;

public interface GoodsEvaluationDao {
	/**
	 * 新增评价
	 * @param sev
	 * @return
	 */
	boolean doIns(Goodsevaluation sev);
	/**
	 * 删除评价
	 * @param sev
	 * @return
	 */
	boolean doDel(Goodsevaluation sev);
	/**
	 * 通过主键查找评价
	 * @param idk
	 * @return
	 */
	Goodsevaluation findByIdk(Long idk);
	/**
	 * 通过订单号查找评价
	 */
	List<Goodsevaluation> findByOrderIdk(Long orderidk,int pagesize,int pagecount);
	/**
	 * 通过商品主键查找全部评价
	 */
	List<Goodsevaluation> findByGoodsIdk(Long goodsidk,int pagesize,int pagecount);
	/**
	 * 查找全部评价
	 * @return
	 */
	List<Goodsevaluation> findAll(int pagesize,int pagecount);
}
