package com.watchshop.dao;


import java.util.List;

import com.watchshop.pojo.Inventory;

public interface InventoryDao {
	/**
	 * 新增库存盘点记录
	 * @return
	 */
	boolean doIns();
	/**
	 * 查找全部库存盘点记录
	 */
	List<Inventory> findAll(int pagesize,int pagecount);
}
