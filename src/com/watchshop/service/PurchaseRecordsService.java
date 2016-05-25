package com.watchshop.service;

import java.util.List;

import com.watchshop.pojo.Purchaserecords;

public interface PurchaseRecordsService {
	/**
	 * 新增进货记录
	 * @return
	 */
	boolean doIns(Purchaserecords pur);
	/**
	 * 修改进货记录
	 * @return
	 */
	boolean doUpd(Purchaserecords pur);
	/**
	 * 删除进货记录
	 * @return
	 */
	boolean doDel(Purchaserecords pur);
	/**
	 * 通过主键查找进货记录
	 */
	Purchaserecords findByIdk(Long puridk);
	/**
	 * 通过商品查找进货记录
	 */
	List<Purchaserecords> findByGoodsIdk(Long goodsidk,int pagesize,int pagecount);
	/**
	 * 通过供货商查找进货记录
	 */
	List<Purchaserecords> findBySupportIdk(Long Supportidk,int pagesize,int pagecount);
	/**
	*  查找全部进货记录
	*/
	List<Purchaserecords> findAll(int pagesize,int pagecount);
}
