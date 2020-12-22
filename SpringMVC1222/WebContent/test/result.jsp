<%@ page contentType="text/html; charset=utf-8"%>
<%
	String msg =(String)request.getAttribute("msg");
	
	out.print(msg);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
안녕 spring mvc 동작 성공! 
</body>
</html>