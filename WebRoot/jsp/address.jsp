<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <% String path = request.getContextPath(); %>
       <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<style type="text/css">
.information .top{
	width: 100%;
	height: 50px;
	margin-top: 700px !important;
}
</style>
<!--必要样式-->
<link rel="stylesheet" href="<%=path%>/css/mylist.css">
<link href="<%=path%>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--jQuery(necessary for Bootstrap's JavaScript plugins)-->
<script src="<%=path%>/js/jquery-1.11.0.min.js"></script>
<script>
$(document).ready(function(){
$("dd:not(:first)").hide(); //隐藏 dd不是第一个的. E:first:相当于E:eq(0)
// $("dd:not(:last)").hide();  //试试$("dd:not(:last)").hide();
$("dt a").click(function(){
$("dd:visible").slideUp("slow");
	$(this).parent().next().slideDown("slow");
return false;
});
	});
	</script>
<!--Custom-Theme-files-->
<!--theme-style-->
<link href="<%=path%>/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Luxury Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--start-menu-->
<script src="<%=path%>/js/simpleCart.min.js"> </script>
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
						<div class="info"><p>
							<a href="<%= path %>/UserInfoAction!checkLogin">MyAccount</a>
						</p>
					</div>
					<div class="cart box_1">
						<a href="<%= path%>/jsp/checkout.jsp">
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
		<a href="<%= path%>/jsp/index.jsp"><h1>Luxury Watches</h1></a>
	</div>
	<!--start-logo-->
	<!--bottom-header-->
	<div class="header-bottom">
		<div class="container">
			<div class="header">
				<div class="col-md-9 header-left">
				<div class="top-nav">
					<ul class="memenu skyblue"><li class="active"><a href="<%= path%>/jsp/index.jsp">Home</a></li>
						<li class="grid"><a href="#">Men</a>
							<div class="mepanel">
								<div class="row">
									<div class="col1 me-one">
										<h4>Shop</h4>
										<ul>
											<li><a href="<%= path%>/jsp/products.jsp">New Arrivals</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Blazers</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Swem Wear</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Handbags</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">T-Shirts</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">My Shopping Bag</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>Style Zone</h4>
										<ul>
											<li><a href="<%= path%>/jsp/products.jsp">Shoes</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Brands</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Coats</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Trousers</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>Popular Brands</h4>
										<ul>
											<li><a href="<%= path%>/jsp/products.jsp">499 Store</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Fastrack</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Casio</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Fossil</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Maxima</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Timex</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">TomTom</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Titan</a></li>
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
											<li><a href="<%= path%>/jsp/products.jsp">New Arrivals</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Blazers</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Swem Wear</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Handbags</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">T-Shirts</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">My Shopping Bag</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>Style Zone</h4>
										<ul>
											<li><a href="<%= path%>/jsp/products.jsp">Shoes</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Brands</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Coats</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Trousers</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>Popular Brands</h4>
										<ul>
											<li><a href="<%= path%>/jsp/products.jsp">499 Store</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Fastrack</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Casio</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Fossil</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Maxima</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Timex</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">TomTom</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Titan</a></li>
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
											<li><a href="<%= path%>/jsp/products.jsp">New Arrivals</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Blazers</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Swem Wear</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Handbags</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">T-Shirts</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">My Shopping Bag</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>Style Zone</h4>
										<ul>
											<li><a href="<%= path%>/jsp/products.jsp">Shoes</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Watches</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Brands</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Coats</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Accessories</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Trousers</a></li>
										</ul>
									</div>
									<div class="col1 me-one">
										<h4>Popular Brands</h4>
										<ul>
											<li><a href="<%= path%>/jsp/products.jsp">499 Store</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Fastrack</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Casio</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Fossil</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Maxima</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Timex</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">TomTom</a></li>
											<li><a href="<%= path%>/jsp/products.jsp">Titan</a></li>
										</ul>
									</div>
								</div>
							</div>
						</li>
						<li class="grid"><a href="<%= path%>/jsp/typo.jsp">Blog</a>
						</li>
						<li class="grid"><a href="<%= path%>/jsp/contact.jsp">Contact</a>
						</li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="col-md-3 header-right">
				<div class="search-bar">
					<form action="<%= path%>/GoodsInfoAction_search" method="post">
					<input type="text"  name="searchinfo" id="search_text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}">
					<input type="submit" value="" id="search_btn" >
					</form>
				</div>
			</div>
			<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--bottom-header-->
	<!--banner-starts-->
	<div class="bnr" id="home">

	</div>
	<!--banner-ends-->
	<!--about-starts-->

	<!--about-end-->
	<!--product-starts-->
	<div class="product">
		<div class="mylist">
			<div class="left">
				<div class="top">
 	 				<div class="mypic">
 	 					<div class="pics"><img src="<%=path%>/images/IMG_3729.JPG" /></div>

 	 				</div>
 	 				<div class="name"><span>昵称</span>&nbsp;&nbsp;(<span>${user.userName}</span>)</div>
				</div>
				<div class="bottom">
					<dl>
					<dt><a href="#">订单管理</a></dt>
						<dd>
						<ul>
							<li><a href="<%=path%>/OrderTableAction_order?userId=${user.userId}">我的订单</a></li>
							<li><a href="<%=path%>/OrderTableAction_order?userId=${user.userId}">退货管理</a></li>
							<li><a href="<%= path%>/Address_addresss?userId=${user.userId}">收获地址</a></li>
						</ul>
						</dd>
					<dt><a href="#">个人信息</a></dt>
						<dd>
						<ul>
							<li><a href="<%= path%>/jsp/changeinfo.jsp">修改个人信息</a></li>
							<li><a href="<%= path%>/jsp/changepwd.jsp">修改密码</a></li>
						</ul>
						</dd>
					<dt><a href="#">余额管理</a></dt>
						<dd>
						<ul>
							<li><a href="<%= path%>/jsp/myblance.jsp">我的余额</a></li>
							<li><a href="<%= path%>/jsp/myblance.jsp">余额充值</a></li>
							<li><a href="<%= path%>/jsp/myblance.jsp">转账管理</a></li>
						</ul>
						</dd>
					<dt><a href="#">客服管理</a></dt>
						<dd>
						<ul>
							<li><a href="<%= path%>/jsp/service.jsp">客服信息</a></li>
							<li><a href="<%= path%>/jsp/service.jsp">我的通告</a></li>
							<li><a href="<%= path%>/jsp/service.jsp">联系客户</a></li>
						</ul>
						</dd>
					</dl>
				</div>
			</div>

			<div class="right">
				<div class="address_top">
							<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;收货地址</p>
					</div>
					<div class="address_info">
			    <table>
					<form name='addressFrm' class='addressFrm' action='' method='post'>
			         <th>新增收货地址&nbsp;&nbsp;&nbsp;<span>电话号码、手机号选填一项,其余均为必填项</span></th>
					 <tr><td><input type='text' id='address_address' onblur='if (this.value ==""){this.value="请输入你的地址"}' onfocus='if (this.value =="请输入你的地址"){this.value =""}' value='请输入你的地址'> </td><td align="right"><b style='color:#f00'>* 必填项</b></td></tr>
			         <tr><td><input type='text' id='address_uname'   onblur='if (this.value ==""){this.value="请输入您的称呼"}' onfocus='if (this.value =="请输入您的称呼"){this.value =""}' value='请输入您的称呼'> </td><td align="right"><b style='color:#f00'>* 必填项</b></td></tr>
			         <tr><td><input type='text' id='address_upost'   onblur='if (this.value ==""){this.value="请输入您的邮编"}' onfocus='if (this.value =="请输入您的邮编"){this.value =""}' value='请输入您的邮编'></td></tr>
			         <tr><td><input type='text' id='address_utel' onblur='if (this.value ==""){value="请输入您的电话"}' onfocus='if (this.value =="请输入您的电话"){this.value =""}' value='请输入您的电话'></td><td align="right"><b style='color:#f00'>* 必填项</b></td></tr>
			         <tr><td><textarea id='addresstext' onblur='if (this.value ==""){this.value="请输入附加内容"}' onfocus='if (this.value =="请输入附加内容"){value =""}'>请输入附加内容</textarea> </td></tr>
			         <tr><td><input type='button' class='address_button' name='address_sub'  id='address_sub_button' value="保  存"/></td></tr>
			  	   </form>
					 </table>
			</div>
			<script>
				$(function(){$("#address_sub_button").click(function(){
						var address = $("#address_address").val();
						var linkman = $("#address_uname").val();
						var tel = $("#address_utel").val();
						var upost_param = "^[0-9]{6}$";//邮编正则
						var tel_param = "^[1]{1}[3|4|5|7|8]{1}[0-9]{9}$"; //电话号码
						if("" == address){
			          		alert("地址不能为空");
			          		return;
				       }else if("" == linkman){
				    	   alert("联系人不能为空");
			          		return;
					   }else if("" == $("#address_upost").val()){
				    	   alert("邮编不能为空");
			          		return;
					   }else if($("#address_upost").val()!=$("#address_upost").val().match(upost_param)){
						   alert("邮编格式错误,请输入正确的邮编");
			          		return;
					   }else if("" == tel){
						    alert("电话不能为空");
						     return;
					   }else if($("#address_utel").val()!=$("#address_utel").val().match(tel_param)){
						    alert("电话格式错误,请输入正确的11位电话");
					   }else{
						   $.post("<%= path%>/AddressAction_doIns",{address:address,linkman:linkman,tel:tel,userId:"${user.userId}"},
				      	    	      function hasDataToDeal1(data){
				      	    	              if(data == "true"){     	
					      	    	              	alert("添加成功");   
					      	    	              window.location.href="<%= path%>/Address_addresss?userId="+"${user.userId}";
				      	    	                  }else{             
				      	    	                	alert("添加失败！");
				      	    	                  }          
				      	    	    })

						   }
						
						
	
					})})

			</script>

			<div class="address_num">
				 <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;共有<span>2</span>条收货地址</p>
			</div>
			
			<div class="address_detail_top">

					<table>
						<tr>
							<td border="1" width="100">收货人</td>
							<td border="1" width="300">地址</td>
							<td border="1" width="100">邮编</td>
							<td border="1" width="100">电话</td>
							<td border="1" width="100">操作</td>
						</tr>

					</table>

			</div>
	<s:iterator var='c' value='list'>
			<div class="address_detail_info">

					<table>
						<tr>
							<td border="1" width="100"><s:property value="#c.linkman"/></td>
							<td border="1" width="300"><s:property value="#c.address"/></td>
							<td border="1" width="100">330000</td>
							<td border="1" width="100"><s:property value="#c.linktel"/></td>
							<td border="1" width="100">
									<p><a href="#" >修改</a></p>
									<p><a href="#" onClick="return confirmAct(${c.addressId});">删除</a></p></td>
						</tr>
					</table>
					<script type="text/javascript" language="javascript"> 
							
							function confirmAct(id) 
							{ 
							    if(confirm('确定要执行此操作吗?')) 
							    { 	
							    	 $.post("<%= path%>/AddressAction_doDel",{addressId:id},
						      	    	      function hasDataToDeal1(data){
						      	    	              if(data == "true"){     
						          	    	              alert("删除成功");  
						          	    	            window.location.href="<%= path%>/Address_addresss?userId="+"${user.userId}";	
						         	    	                  }else{             
						      	    	                	alert("删除失败");
						      	    	                  }          
						      	    	    })
							        return true; 
							    } 
							    return false; 
							} 
						
							</script> 
			</div>
	</s:iterator>
		</div>
	</div>

	<!--product-end-->
	<!--information-starts-->
	<div class="information">

		<div class="container">
			<div class="top"></div>
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
						<li><a href="<%= path%>/jsp/contact.jsp"><p>Contact Us</p></a></li>
						<li><a href="#"><p>Top Sellers</p></a></li>
					</ul>
				</div>
				<div class="col-md-3 infor-left">
					<h3>My Account</h3>
					<ul>
						<li><a href="<%= path%>/jsp/account.jsp"><p>My Account</p></a></li>
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
					<p>Copyright &copy; 2016.WANCZY.DH08<a target="_blank" href="#"></a></p>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--footer-end-->
</body>
</html>
    