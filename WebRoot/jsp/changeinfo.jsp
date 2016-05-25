<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<style type="text/css">
.information .top{
	width: 100%;
	height: 50px;
}
</style>
<!--必要样式-->
<link rel="stylesheet" href="<%=path%>/css/mylist.css">
<link href="<%=path%>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--jQuery(necessary for Bootstrap's JavaScript plugins)-->
<script src="<%=path%>/js/jquery-1.11.0.min.js"></script>
<script src="<%=path%>/js/birthday.js"></script>
<script>
$(function () {
  $.ms_DatePicker({
          YearSelector: ".sel_year",
          MonthSelector: ".sel_month",
          DaySelector: ".sel_day"
  });
});
</script>
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
        <div class="changeinfo_top">
              <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;个人资料</p>
          </div>
          <div class="changeinfo_info">
          <table>
          <form name='changeinfoFrm' class='changeinfoFrm' action='' method='post'>
               <th>亲爱的<span>${user.userName}</span>填写真实的资料,有助于好友找到你哦。</th>
               <tr><td width="70%"><b>当前头像:</b></td><td align="center"><img src="<%=path%>/images/IMG_3729.JPG" alt=""></td></tr>
               <tr><td width=33%><b>真实姓名:</b></td><td><input type='text' id='changeinfo_realname'value='${user.realName}'> </td></tr>
               <tr><td width=33%><b>电话:</b></td><td><input type='text' id='changeinfo_tel'value='${user.telphone}'> </td></tr>
               <tr><td width=60%><b>性别:</b></td><td id="sex" align="right"><input id="man" type="radio" checked="checked" name="changeinfo_sex" />男<span></span><input id="woman" type="radio" name="changeinfo_sex"/>女 </td></tr>
               <tr><td width=42%><b>生日:</b>  </td><td align="left">
                 <select class="sel_year" rel="2000"> </select> 年
                 <select class="sel_month" rel="2"> </select> 月
                 <select class="sel_day" rel="14"> </select> 日
               </td></tr>
              <tr><td></td></tr>
              <tr><td width=38%><b>住址:</b></td><td>
                <select id="s_province" name="s_province"></select>  
                <select id="s_city" name="s_city" ></select>  
                <select id="s_county" name="s_county"></select>             
               </td></tr>
               <tr><td><br></td></tr>
               <tr><td><span></span><span></span><span></span><span></span>
               <input type="button" class='changeinfo_button' name='changeinfo_sub'  id='changeinfo_sub_button' value="保存"> 
               </td></tr>
             </form>
           </table>
      </div>
			</div>
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
<script class="resources library" src="<%=path%>/js/area.js" type="text/javascript"></script>
<script type="text/javascript">_init_area();</script>
<script type="text/javascript">
                  var Gid  = document.getElementById ;
                  var showArea = function(){
                  	Gid('show').innerHTML = "<h3>省" + Gid('s_province').value + " - 市" +
                  	Gid('s_city').value + " - 县/区" +
                  	Gid('s_county').value + "</h3>"
                  							}
                  //Gid('s_county').setAttribute('onchange','showArea()');
                  </script>
  <script>
	 $(function(){$(".changeinfo_button").click(function(){
		 var realname = $("#changeinfo_realname").val();
		 var tel = $("#changeinfo_tel").val();
		 var param2 =  "^[\u4E00-\u9FA5]{2,8}$";//中文名字
		 var param4 = "^[1]{1}[3|4|5|7|8]{1}[0-9]{9}$";//电话号码
		 if("" == realname){
			  alert("姓名不能为空");
			  return ;
	       }else if($("#changeinfo_realname").val()!=$("#changeinfo_realname").val().match(param2)){  
	        	  alert("您的姓名格式错误,请输入2-8位中文！"); 
	        	  $("#changeinfo_realname").focus();
	        	  return; 
	      }else if("" == tel){
			  alert("电话不能为空");
			  return ;
	       }else if($("#changeinfo_tel").val()!=$("#changeinfo_tel").val().match(param4)){  
	        	  alert("您的电话格式错误,请输入正确的电话号码！"); 
	        	  $("#changeinfo_tel").focus();
	        	  return; 
	      }else{
	    	  $.post("<%= path%>/UserInfoAction_update",{realname:realname,tel:tel},
      	    	      function hasDataToDeal1(data){
      	    	              if(data == "true"){     	
      	    	            	alert("修改成功");  	                	    	    	            	 
      	    	                  }else{             
      	    	                	   alert("修改失败");     	                	  
      	    	                  }          
      	    	    })
		      }
		 })})
   </script>
</html>
    