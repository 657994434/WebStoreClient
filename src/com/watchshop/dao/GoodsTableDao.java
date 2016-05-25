package com.watchshop.dao;

import java.util.List;

import com.watchshop.pojo.Goodstable;

public interface GoodsTableDao {
	/**
	 * 新增商品
	 * @param goods
	 * @return
	 */
	boolean doIns(Goodstable goods);
	/**
	 * 删除商品，即将商品状态改为不出售
	 * @param goods
	 * @return
	 */
	boolean doDel(Goodstable goods);
	/**
	 * 修改商品信息
	 * @param goods
	 * @return
	 */
	boolean doUpd(Goodstable goods);
	/**
	 * 通过商品主键查找
	 * @param goodsid
	 * @return
	 */
	Goodstable findByIdk(Long goodid);
	/**
	 * 通过商品类型查找
	 * @param type
	 * @return
	 */
	List<Goodstable> findByType(int type,int pagesize,int pagecount);
	/**
	 * 通过商品名字模糊查询
	 * @param goodsname
	 * @return
	 */
	List<Goodstable> findByName(String goodsname);
	/**
	 * 通过价钱查找
	 * @param minprice
	 * @param maxprice
	 * @return
	 */
	List<Goodstable> findByPrice(Double minprice,Double maxprice,int pagesize,int pagecount);
	/**
	 * 查找全部商品，并按最大销量排序
	 * @return
	 */
	List<Goodstable> findByMaxSell(int pagesize,int pagecount);
	/**
	 * 查找全部商品，并按最小销量排序
	 * @return
	 */
	List<Goodstable> findByMinSell(int pagesize,int pagecount);
	/**
	 * 查找全部商品
	 * @return
	 */
	List<Goodstable> findAll(int pagesize,int pagecount);
}
