<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String path = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<title>Checkout</title>
<style type="text/css">
.info a:hover {
    color:white;
    text-decoration:underline;
    }
.info{
	float: left;
	text-align:center;
}
.info p{
	position:absolute;
	right:120px;
	padding-top: 8px;
	color: white;
	text-transform: none;
	float: 100px;
}
.enter{
 	display:block;
 	float:right;
}
</style>
<link href="<%=path%>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--jQuery(necessary for Bootstrap's JavaScript plugins)-->
<script src="<%=path%>/js/jquery-1.11.0.min.js"></script>
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
	<!--start-breadcrumbs-->
	<div class="breadcrumbs">
		<div class="container">
			<div class="breadcrumbs-main">
				<ol class="breadcrumb">
					<li><a href="<%= path%>/jsp/index.jsp">Home</a></li>
					<li class="active">Checkout</li>
				</ol>
			</div>
		</div>
	</div>
	<!--end-breadcrumbs-->
	<!--start-ckeckout-->
	<div class="ckeckout">
		<div class="container">
			<div class="ckeck-top heading">
				<h2>CHECKOUT</h2>
			</div>
			<div class="ckeckout-top">
			<div class="cart-items">
			 <h3>My Shopping Bag (3)</h3>
			<div class="in-check" >
				<ul class="unit">
					<li><span>Item</span></li>
					<li><span>Product Name</span></li>		
					<li><span>Shop Number</span></li>
					<li><span>Unit Price</span></li>
					<li><span>Delivery Details</span></li>
					<li><span>Deal</span></li>
					<div class="clearfix"> </div>
				</ul>
				<div id = "findTable"></div>
			</div>
			</div>  
		 </div>
		</div>
	</div>
	<!--end-ckeckout-->
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
<script type="text/javascript">
	var xmlHttp;//定义Ajax的核心对象
		var pagecount = 1;//显示的页数
		var pagesize = 10;
		var userId = ${user.userId};
		query(0);//页面一启动就会调用query方法
		function query(x){
			$(document).ready(function(){
                $.post("<%=path%>/shopcart_findAll",{userId:userId,pagesize:pagesize,pagecount:pagecount},
                function hasDataToDeal1(data){  //执行Action完成之后返回的内容
                	document.getElementById("findTable").innerHTML = data;
                });
       		 });
		}
		function goMinus(id){
			var shopCarId = id;
			var minus = -1;
			$(document).ready(function(){
               $.post("<%=path%>/shopcart_doUpd",{shopCarId:shopCarId,updNum:minus},
               function hasDataToDeal1(data){
               	if(data =="false"){
               		alert("操作失败，请联系管理员！");
               	}
               	query(0);
               });
       		});
		}
		function goGal(id){
			var shopCarId = id;
			var gal = 1;
			$(document).ready(function(){
                $.post("<%=path%>/shopcart_doUpd",{shopCarId:shopCarId,updNum:gal},
                function hasDataToDeal1(data){
                	if(data =="false"){
                		alert("操作失败，请联系管理员！");
                	}
                	query(0);
                });
                
       		 });
		}

		function goDel(id){
			var shopCarId = id;
			$(document).ready(function(){
                $.post("<%=path%>/shopcart_doDel",{shopCarId:shopCarId},
                function hasDataToDeal1(data){
                	if(data =="false"){
                		alert("操作失败，请联系管理员！");
                	}
                	query(0);
                });
       		 });
		}
		//TODO
		function goPay(id,id2,id3){
			var shopCarId = id;
			var userMoney = id2;
			var shopCarId = id3;
			$(document).ready(function(){
                $.post("<%=path%>/MoneyAction_buy",{userId:"${user.userId}",userMoney:userMoney,shopCarId:shopCarId},
                function hasDataToDeal1(data){
                	if(data =="false"){
                		alert("操作失败，请联系管理员！");
                	}else{
						alert("购买成功");
                    	}
                	goDel(id);
                	query(0);
                });
       		 });
		}
</script>
</html>