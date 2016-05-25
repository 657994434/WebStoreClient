package com.watchshop.intercepter;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.watchshop.pojo.Usertable;

public class MyInfoIntercepter extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation intercept) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session = intercept.getInvocationContext().getSession();
		Usertable usertable = (Usertable)session.get("user");
		if(null == usertable|| "".equals(usertable.getRealName())){
			return "fail";
		}
		return intercept.invoke();//表示向下执行
	}
	
}
