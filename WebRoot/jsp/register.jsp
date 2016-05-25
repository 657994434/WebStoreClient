<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<link href="<%=path%>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--jQuery(necessary for Bootstrap's JavaScript plugins)-->
<script src="<%=path%>/js/jquery-1.11.0.min.js"></script>
<!--Custom Theme files-->
<!--theme-style-->
<link href="<%=path%>/css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Luxury Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>	
<!--start-menu-->
<link href="<%=path%>/css/animate.css" rel="stylesheet" type="text/css" media="all" />	
<link href="<%=path%>/css/common.css" rel="stylesheet" type="text/css" media="all" />	
<script src="<%=path%>/js/simpleCart.min.js"> </script>
<script src="<%=path%>/js/jquery.hDialog.js"> </script>
<link href="<%=path%>/css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="<%=path%>/js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>	
<!--dropdown-->
<script src="<%=path%>/js/jquery.easydropdown.js"></script>			
</head>
<body> 
	<!--top-header-->
	<div class="top-header">
		<div class="container">
			<div class="top-header-main">
				<div class="col-md-6 top-header-left">
					<div class="drop">
						<div class="box">
							<select tabindex="4" class="dropdown drop">
								<option value="" class="label">Dollar :</option>
								<option value="1">Dollar</option>
								<option value="2">Euro</option>
							</select>
						</div>
						<div class="box1">
							<select tabindex="4" class="dropdown">
								<option value="" class="label">English :</option>
								<option value="1">English</option>
								<option value="2">French</option>
								<option value="3">German</option>
							</select>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="col-md-6 top-header-left">
					<div class="cart box_1">
						<a href="<%=path%>/jsp/checkout.jsp">
							<div class="total">
								<span class="simpleCart_total"></span></div>
								<img src="<%=path%>/images/cart-1.png" alt="" />
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--top-header-->
	<!--start-logo-->
	<div class="logo">
		<a href="<%=path%>/jsp/index.jsp"><h1>Luxury Watches</h1></a>
	</div>
	<!--start-logo-->
	<!--bottom-header-->
	<div class="header-bottom">
		<div class="container">
			<div class="header">
				<div class="col-md-9 header-left">
				<div class="top-nav">
					<ul class="memenu skyblue"><li class="active"><a href="<%=path%>/jsp/index.jsp">Home</a></li>
						<li class="grid"><a href="#">Men</a>
							<div class="mepanel">
								<div class="row">
									<div class="col1 me-one">
										<h4>Shop</h4>
										<ul>
											<li><a href="<%=path%>/jsp/products.jsp">New Arrivals</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Blazers</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Swem Wear</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Handbags</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">T-Shirts</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">My Shopping Bag</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>Style Zone</h4>
										<ul>
											<li><a href="<%=path%>/jsp/products.jsp">Shoes</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Brands</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Coats</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Trousers</a></li>
										</ul>	
									</div>
									<div class="col1 me-one">
										<h4>Popular Brands</h4>
										<ul>
											<li><a href="<%=path%>/jsp/products.jsp">499 Store</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Fastrack</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Casio</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Fossil</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Maxima</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Timex</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">TomTom</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Titan</a></li>
										</ul>		
									</div>
								</div>
							</div>
						</li>
						<li class="grid"><a href="#">Women</a>
							<div class="mepanel">
								<div class="row">
									<div class="col1 me-one">
										<h4>Shop</h4>
										<ul>
											<li><a href="<%=path%>/jsp/products.jsp">New Arrivals</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Blazers</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Swem Wear</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Handbags</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">T-Shirts</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">My Shopping Bag</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>Style Zone</h4>
										<ul>
											<li><a href="<%=path%>/jsp/products.jsp">Shoes</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Brands</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Coats</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Trousers</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>Popular Brands</h4>
										<ul>
											<li><a href="<%=path%>/jsp/products.jsp">499 Store</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Fastrack</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Casio</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Fossil</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Maxima</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Timex</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">TomTom</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Titan</a></li>
										</ul>	
									</div>
								</div>
							</div>
						</li>
						<li class="grid"><a href="#">Kids</a>
							<div class="mepanel">
								<div class="row">
									<div class="col1 me-one">
										<h4>Shop</h4>
										<ul>
											<li><a href="<%=path%>/jsp/products.jsp">New Arrivals</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Blazers</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Swem Wear</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Handbags</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">T-Shirts</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">My Shopping Bag</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>Style Zone</h4>
										<ul>
											<li><a href="<%=path%>/jsp/products.jsp">Shoes</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Brands</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Coats</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Trousers</a></li>
										</ul>	
									</div>
									<div class="col1 me-one">
										<h4>Popular Brands</h4>
										<ul>
											<li><a href="<%=path%>/jsp/products.jsp">499 Store</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Fastrack</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Casio</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Fossil</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Maxima</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Timex</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">TomTom</a></li>
											<li><a href="<%=path%>/jsp/products.jsp">Titan</a></li>
										</ul>	
									</div>
								</div>
							</div>
						</li>
						<li class="grid"><a href="<%=path%>/jsp/typo.jsp">Blog</a>
						</li>
						<li class="grid"><a href="<%=path%>/jsp/contact.jsp">Contact</a>
						</li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="col-md-3 header-right"> 
				<div class="search-bar">
					<input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}">
					<input type="submit" value="">
				</div>
			</div>
			<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--bottom-header-->
	<!--start-breadcrumbs-->
	<div class="breadcrumbs">
		<div class="container">
			<div class="breadcrumbs-main">
				<ol class="breadcrumb">
					<li><a href="<%=path%>/jsp/index.jsp">Home</a></li>
					<li class="active">Register</li>
				</ol>
			</div>
		</div>
	</div>
	<!--end-breadcrumbs-->
	<!--register-starts-->
	<div class="register">
		<div class="container">
			<div class="register-top heading">
				<h2>REGISTER</h2>
			</div>
			<div class="register-main">
				<div class="col-md-6 account-left">
					<input id="Account" placeholder="Account" type="text" tabindex="1" required>
						<input id="Realname" placeholder="Realname" type="text" tabindex="2" required>
						<input id="IdCard" placeholder="Id Card" type="text" tabindex="3" required>
						<input id="Mobile" placeholder="Mobile" type="text" tabindex="3" required>
						<ul>
							<li><label class="radio left"><input id="sex" value="1" type="radio" name="sex" checked=""><i></i>Male</label></li>
							<li><label class="radio"><input id="sex" type="radio" value="0" name="sex"><i></i>Female</label></li>
							<div class="clearfix"></div>
						</ul>
				</div>
			
				<div class="col-md-6 account-left">
					<input id="password" placeholder="Password" type="password" tabindex="4" required>
						<input id="repassword" placeholder="Retype password" type="password" tabindex="4" required>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="address submit">
							<input type="submit" value="Submit" id="register_btn">
						</div>
		</div>
	</div>
		<script>
					$(function(){$("#register_btn").click(function(){
					
						var username = $("#Account").val();
						var realname = $("#Realname").val();
						var idcard = $("#IdCard").val();
						var tel = $("#Mobile").val();
						var sex_obj = document.getElementsByName('sex');   
						var temp_sex = false;   
						for(var i = 0; i < sex_obj.length; i ++){   
						if(sex_obj[i].checked){   
						var sex = sex_obj[i].value;   
						temp_sex = true;   
						break;   
						}   
						}  				
						var password = $("#password").val();
						var repassword = $("#repassword").val();
						var param = "^[A-Za-z0-9]{5,15}$";//账号密码
						var param2 =  "^[\u4E00-\u9FA5]{2,8}$";//中文名字
						var param3 = "^[1-9]{1}[0-9]{16}[x|X|0-9]{1}|[1-9]{1}[0-9]{14}$";//身份证号
						var param4 = "^[1]{1}[3|4|5|7|8]{1}[0-9]{9}$";//电话号码
						 if("" == username){
				          		alert("账号不能为空");
				          		return;
				       }else if($("#Account").val()!=$("#Account").val().match(param)){  
				        	  alert("您的账号格式错误,请用5-15位由数字和26个英文字母组成的字符串！"); 
				        	  $("#Account").focus(); 
				        	  return;
				       }else if("" == realname){
						  alert("姓名不能为空");
						  return ;
				       }else if($("#Realname").val()!=$("#Realname").val().match(param2)){  
				        	  alert("您的姓名格式错误,请输入2-8位中文！"); 
				        	  $("#Realname").focus();
				        	  return; 
				      }else if("" == idcard){
						  alert("身份证号不能为空");
						  return ;
				       }else if($("#IdCard").val()!=$("#IdCard").val().match(param3)){  
				        	  alert("您的身份证格式错误,请输入正确的15位或18位！"); 
				        	  $("#IdCard").focus();
				        	  return; 
				      }else if("" == tel){
						  alert("电话不能为空");
						  return ;
				       }else if($("#Mobile").val()!=$("#Mobile").val().match(param4)){  
				        	  alert("您的电话格式错误,请输入正确的电话号码！"); 
				        	  $("#Mobile").focus();
				        	  return; 
				      }else if("" == password){
						  alert("密码不能为空");
						  return ;
				       }else if($("#password").val()!=$("#password").val().match(param)){  
				        	  alert("您的密码格式错误,请用5-15位由数字和26个英文字母组成的字符串！"); 
				        	  $("#password").focus();
				        	  return; 
				      }else if("" == repassword){
						  alert("密码不能为空");
						  return ;
				       }else if($("#repassword").val()!=$("#password").val()){  
				        	  alert("两次密码输入不一致"); 
				        	  $("#repassword").focus();
				        	  return; 
				      }else{

				    	  $.post("<%= path%>/UserInfoAction_register",{username:username,password:password,idcard:idcard,tel:tel,realname:realname},
			      	    	      function hasDataToDeal1(data){
			      	    	              if(data == "true"){     	
				      	    	              	alert("注册成功");    	                	
			      	    	                	window.location.href="<%= path%>/jsp/login.jsp"
			      	    	                  }else{             
			      	    	                	alert("注册失败！");
			      	    	                  }          
			      	    	    })

					      }
									    
						})})
				</script>
	<!--register-end-->
	<!--information-starts-->
	<div class="information">
		<div class="container">
			<div class="infor-top">
				<div class="col-md-3 infor-left">
					<h3>Follow Us</h3>
					<ul>
						<li><a href="#"><span class="fb"></span><h6>Facebook</h6></a></li>
						<li><a href="#"><span class="twit"></span><h6>Twitter</h6></a></li>
						<li><a href="#"><span class="google"></span><h6>Google+</h6></a></li>
					</ul>
				</div>
				<div class="col-md-3 infor-left">
					<h3>Information</h3>
					<ul>
						<li><a href="#"><p>Specials</p></a></li>
						<li><a href="#"><p>New Products</p></a></li>
						<li><a href="#"><p>Our Stores</p></a></li>
						<li><a href="<%=path%>/jsp/contact.jsp"><p>Contact Us</p></a></li>
						<li><a href="#"><p>Top Sellers</p></a></li>
					</ul>
				</div>
				<div class="col-md-3 infor-left">
					<h3>My Account</h3>
					<ul>
						<li><a href="<%=path%>/jsp/account.jsp"><p>My Account</p></a></li>
						<li><a href="#"><p>My Credit slips</p></a></li>
						<li><a href="#"><p>My Merchandise returns</p></a></li>
						<li><a href="#"><p>My Personal info</p></a></li>
						<li><a href="#"><p>My Addresses</p></a></li>
					</ul>
				</div>
				<div class="col-md-3 infor-left">
					<h3>Store Information</h3>
					<h4>The company name,
						<span>Lorem ipsum dolor,</span>
						Glasglow Dr 40 Fe 72.</h4>
					<h5>+955 123 4567</h5>	
					<p><a href="mailto:example@email.com">contact@example.com</a></p>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--information-end-->
	<!--footer-starts-->
	<div class="footer">
		<div class="container">
			<div class="footer-top">
				<div class="col-md-6 footer-left">
					<form>
						<input type="text" value="Enter Your Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Your Email';}">
						<input type="submit" value="Subscribe">
					</form>
				</div>
				<div class="col-md-6 footer-right">					
					<p>Copyright &copy; 2016.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--footer-end-->	
</body>
</html>