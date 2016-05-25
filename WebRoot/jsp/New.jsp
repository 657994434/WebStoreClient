<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>kkkkkkk</h1>
					<s:iterator value="goods" id="list" status="st">
					<s:property value="#st.index"/>
					<s:iterator value="list" id="value">
					<s:property value="#value.goodtype" />
					</s:iterator>
					</s:iterator> 
</body>
</html>