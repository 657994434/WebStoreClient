package com.watchshop.service;

import java.util.List;

public interface GoodsTypeService {
	/**
	 * 只需要找到是所有分类就可以了
	 * 并不需要新增或者删除分类
	 * @return
	 */
	List<GoodsTypeService> findAll();
}
