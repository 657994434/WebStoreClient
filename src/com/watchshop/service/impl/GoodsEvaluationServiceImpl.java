package com.watchshop.service.impl;

import java.util.Date;
import java.util.List;

import com.watchshop.service.GoodsEvaluationService;
import com.watchshop.dao.GoodsEvaluationDao;
import com.watchshop.dao.GoodsTableDao;
import com.watchshop.dao.UserTableDao;
import com.watchshop.pojo.Goodsevaluation;
import com.watchshop.pojo.Goodstable;
import com.watchshop.pojo.Usertable;

public class GoodsEvaluationServiceImpl implements GoodsEvaluationService {
	private GoodsEvaluationDao dao;
	private UserTableDao dao2;
	private GoodsTableDao dao3;
	public GoodsTableDao getDao3() {
		return dao3;
	}

	public void setDao3(GoodsTableDao dao3) {
		this.dao3 = dao3;
	}

	public UserTableDao getDao2() {
		return dao2;
	}

	public void setDao2(UserTableDao dao2) {
		this.dao2 = dao2;
	}

	public GoodsEvaluationDao getDao() {
		return dao;
	}

	public void setDao(GoodsEvaluationDao dao) {
		this.dao = dao;
	}

	public boolean doDel(Goodsevaluation sev) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean doIns(Long userId,String say) {
		Long i = (long) 1;
		Double j = (double) 10;
		Date date = new Date();
		Usertable usertable = this.dao2.findByIdk(userId);
		Goodstable goodstable = this.dao3.findByIdk(i);
		Goodsevaluation goodsevaluation = new Goodsevaluation(usertable,goodstable,say,date,j);
		boolean flag = this.dao.doIns(goodsevaluation);
		return flag;
	}

	public List<Goodsevaluation> findAll(int pagesize, int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Goodsevaluation> findByGoodsIdk(Long goodsidk, int pagesize,
			int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

	public Goodsevaluation findByIdk(Long idk) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Goodsevaluation> findByOrderIdk(Long orderidk, int pagesize,
			int pagecount) {
		// TODO Auto-generated method stub
		return null;
	}

}
