package com.watchshop.dao;


import java.util.List;

import com.watchshop.pojo.Imagetable;

public interface ImageTableDao {
	/**
	 * 新增图片
	 * @return
	 */
	boolean doIns(Imagetable ima);
	/**
	 * 修改图片
	 * @return
	 */
	boolean doUpd(Imagetable ima);
	/**
	 * 删除图片
	 * @return
	 */
	boolean doDel(Imagetable ima);
	/**
	 * 找到属于该商品的所有图片
	 */
	List<Imagetable> findByGoodsIdk(Long goodsidk);
}
