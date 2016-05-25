package com.watchshop.action;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.bind.v2.TODO;
import com.watchshop.pojo.Ordertable;
import com.watchshop.pojo.Usertable;
import com.watchshop.service.UserTableService;



public class UserInfoAction extends ActionSupport{
	private String username;
	private String password;
	private String realname;
	private String idcard;
	private String tel;
	private String sex;
	private String message;
	private Date date;
	private Date birthday = null;
	private Integer userstate = 1;
	private Integer role = 1;
	private String newpassword;
	private List<Ordertable> list;
	private Long userId;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<Ordertable> getList() {
		return list;
	}
	public void setList(List<Ordertable> list) {
		this.list = list;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getUserstate() {
		return userstate;
	}
	public void setUserstate(Integer userstate) {
		this.userstate = userstate;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	private String resultString;
	private UserTableService service;
	
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public UserTableService getService() {
		return service;
	}
	public void setService(UserTableService service) {
		this.service = service;
	}
	public String getResultString() {
		return resultString;
	}
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String login(){
//		TODO
		try{
			Usertable user = this.service.LoginForUser(username, password);			
			if(user!=null ){
				this.setResultString("true");	
			ServletActionContext.getRequest().getSession().setAttribute("user",user);
				return "success";	
			}else{
				this.setResultString("false");	
				return "fail";
			}
			
		}catch(Exception e){
			e.printStackTrace();
			return "fail";
		}
	}

	public String checkLogin(){
		Usertable user = null;
		user=(Usertable)ServletActionContext.getRequest().getSession().getAttribute("user");
		if(null!=user&&!"".equals(user.getRealName())){
			return "success";
		}
			return "fail";
		
	}
	public String register(){
		date=new Date();
		Double userMoney = 10000d;
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=format.format(date);
		Usertable user = new Usertable(username,password,date,idcard,realname,tel,birthday,userstate,role,userMoney);
		Boolean flag  = this.service.doIns(user);		
		if(flag == true){
			this.setResultString("true");
			return "success";
		}else{
			this.setResultString("false");
			return "fail";
		}
	}
	public String update(){
		Usertable user = null;
		user = (Usertable)ServletActionContext.getRequest().getSession().getAttribute("user");
		user.setRealName(realname);
		user.setTelphone(tel);
		Boolean flag = this.service.doUpd(user);
		if(flag == true){
			this.setResultString("true");
			ServletActionContext.getRequest().getSession().setAttribute("user",user);
			return "success";
		}else{
			this.setResultString("false");
			return "fail";
		}
	}
	public String changepwd() {
		Usertable user = null;
		user = (Usertable)ServletActionContext.getRequest().getSession().getAttribute("user");
		user.setPassword(newpassword);
		Boolean flag = this.service.doUpd(user);
		if(flag == true){
			this.setResultString("true");
			ServletActionContext.getRequest().getSession().setAttribute("user",user);
			return "success";
		}else{
			this.setResultString("false");
			return "fail";
		}
	}	
}
