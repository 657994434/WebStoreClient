<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <% String path = request.getContextPath();
          /*  String searchinfo =  new String(request.getParameter("searchinfo").getBytes("ISO-8859-1"),"utf-8");  */
        %>
        <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>Product</title>
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
</style>
<link href="<%=path%>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--jQuery(necessary for Bootstrap's JavaScript plugins)-->
<script src="<%=path%>/js/jquery-1.11.0.min.js"></script>
<script src="<%=path%>/js/jquery.page.js"></script>
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
						<div class="info"><p><a href="<%= path %>/UserInfoAction!checkLogin">MyAccount</a></p>
					</div>
					<div class="cart box_1">
						<a href="<%=path %>/jsp/checkout.jsp">
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
		<a href="<%=path %>/jsp/index.jsp"><h1>Luxury Watches</h1></a>
	</div>
	<!--start-logo-->
	<!--bottom-header-->
	<div class="header-bottom">
		<div class="container">
			<div class="header">
				<div class="col-md-9 header-left">
				<div class="top-nav">
					<ul class="memenu skyblue"><li class="active"><a href="<%=path %>/jsp/index.jsp">Home</a></li>
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
						<li class="grid"><a href="<%=path %>/jsp/typo.jsp">Blog</a>
						</li>
						<li class="grid"><a href="<%=path %>/jsp/contact.jsp">Contact</a>
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
					<li><a href="<%=path %>/jsp/index.jsp">Home</a></li>
					<li class="active">New Products</li>
				</ol>
			</div>
		</div>
	</div>
	<!--end-breadcrumbs-->
	<!--prdt-starts-->

	<div class="prdt"> 
		<div class="container">
			<div class="prdt-top">
				<div class="col-md-9 prdt-left">
					<div class="product-one">
					
						<div class="clearfix"></div>
					</div>
					<div class="product-one">
					<s:iterator var='c' value='goods'>	
						<div class="col-md-4 product-left p-left">
							<div class="product-main simpleCart_shelfItem">
								<a href="<%= path%>/GoodsInfoAction_single?goodId=${c.goodId}" class="mask"><img class="img-responsive zoom-img" src="<%=path%>/images/p-5.png" alt="" /></a>
								<div class="product-bottom">							
									<h3><s:property value="#c.goodName"/></h3>
									<p>Explore Now</p>
									<h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$<s:property value="#c.abatePrive"/></span></h4>
								</div>
								<div class="srch srch1">
									<span>-<s:property value="#c.goodRemark"/>%</span>
								</div>
							</div>
						</div>
						
								</s:iterator>
						
						<div class="clearfix"></div>
					</div>	
				</div>	
				<div class="col-md-3 prdt-right">
					<div class="w_sidebar">
						<section  class="sky-form">
							<h4>Catogories</h4>
							<div class="row1 scroll-pane">
								<div class="col col-4">
									<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>All Accessories</label>
								</div>
								<div class="col col-4">								
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Women Watches</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Kids Watches</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Men Watches</label>			
								</div>
							</div>
						</section>
						<section  class="sky-form">
							<h4>Brand</h4>
							<div class="row1 row2 scroll-pane">
								<div class="col col-4">
									<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>kurtas</label>
								</div>
								<div class="col col-4">
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Sonata</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Titan</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Casio</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Omax</label>
									<label class="checkbox"><input type="checkbox" name="checkbox" ><i></i>shree</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Fastrack</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Sports</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Fossil</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Maxima</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Yepme</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Citizen</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Diesel</label>									
								</div>
							</div>
						</section>
						<section class="sky-form">
							<h4>Colour</h4>
								<ul class="w_nav2">
									<li><a class="color1" href="#"></a></li>
									<li><a class="color2" href="#"></a></li>
									<li><a class="color3" href="#"></a></li>
									<li><a class="color4" href="#"></a></li>
									<li><a class="color5" href="#"></a></li>
									<li><a class="color6" href="#"></a></li>
									<li><a class="color7" href="#"></a></li>
									<li><a class="color8" href="#"></a></li>
									<li><a class="color9" href="#"></a></li>
									<li><a class="color10" href="#"></a></li>
									<li><a class="color12" href="#"></a></li>
									<li><a class="color13" href="#"></a></li>
									<li><a class="color14" href="#"></a></li>
									<li><a class="color15" href="#"></a></li>
									<li><a class="color5" href="#"></a></li>
									<li><a class="color6" href="#"></a></li>
									<li><a class="color7" href="#"></a></li>
									<li><a class="color8" href="#"></a></li>
									<li><a class="color9" href="#"></a></li>
									<li><a class="color10" href="#"></a></li>
								</ul>
						</section>
						<section class="sky-form">
							<h4>discount</h4>
								<div class="row1 row2 scroll-pane">
									<div class="col col-4">
										<label class="radio"><input type="radio" name="radio" checked=""><i></i>60 % and above</label>
										<label class="radio"><input type="radio" name="radio"><i></i>50 % and above</label>
										<label class="radio"><input type="radio" name="radio"><i></i>40 % and above</label>
									</div>
									<div class="col col-4">
										<label class="radio"><input type="radio" name="radio"><i></i>30 % and above</label>
										<label class="radio"><input type="radio" name="radio"><i></i>20 % and above</label>
										<label class="radio"><input type="radio" name="radio"><i></i>10 % and above</label>
									</div>
								</div>						
						</section>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--product-end-->
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
						<li><a href="<%=path %>/jsp/contact.jsp"><p>Contact Us</p></a></li>
						<li><a href="#"><p>Top Sellers</p></a></li>
					</ul>
				</div>
				<div class="col-md-3 infor-left">
					<h3>My Account</h3>
					<ul>
						<li><a href="<%=path %>/jsp/account.jsp"><p>My Account</p></a></li>
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
<script>
<%-- 	showgoods();
    
    function showgoods(){
		 	$(document).ready(function(){
			$.post("",{searchinfo:"<%= searchinfo%>"},
			function hasDataToDeal(data) {
				alert(data);
			}
    	    	      )
			}) 
		 window.location.href = "<%= path%>/GoodsInfoAction_search?searchinfo=<%= searchinfo%>"; 
			
        }
     --%>

</script>

</html>