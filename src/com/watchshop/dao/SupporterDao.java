package com.watchshop.dao;

import java.util.List;

import com.watchshop.pojo.Supporter;

public interface SupporterDao {
	/**
	 * 新增供货商
	 * @return
	 */
	boolean doIns(Supporter sup);
	/**
	 * 修改供货商
	 * @return
	 */
	boolean doUpd(Supporter sup);
	/**
	 * 删除供货商
	 * @return
	 */
	boolean doDel(Supporter sup);
	/**
	 * 通过商品查找供货商
	 */
	List<Supporter> findByGoodsIdk(Long goodsidk,int pagesize,int pagecount);
	/**
	*  查找全部供货商
	*/
	List<Supporter> findAll(int pagesize,int pagecount);
}
