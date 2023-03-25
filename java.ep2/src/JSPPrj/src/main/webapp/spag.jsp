<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
pageContext.setAttribute("aa", "hello");
pageContext.setAttribute("result", "scope test");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4 />result = <%=request.getAttribute("result")%>입니다.<br>
	<h4 />EL 문법 result = ${requestScope.result}입니다.<br>
	<h4 />names[0] = ${names1[0]}입니다.<br>
	<h4 />names[1] = ${names1[1]}입니다.<br>
	
	<br>
	<h4 />Map 출력 = ${notice123.id}입니다.<br>
	<h4 />Map 출력 = ${notice123.title}입니다.<br>
	<h4 />pageContext 출력 = ${aa}입니다.<br>
	<h4 />pageContext result 출력 = ${result}입니다.<br>
	<h4 />requestScope result 출력 = ${requestScope.result}입니다.<br>
	<br>
	
	<h4 />header.accept 출력 = ${header.accept}입니다.<br>
	<h4 />header.host 출력 = ${header.host}입니다.<br>
	<h4 />param.num 출력 (쿼리파리미터 출력) = ${param.num}입니다.<br>
	<br>
	
	<h4 />param.num : ${param.num} > 5 = ${param.num > 5}입니다. <br>
	<h4 />param.num : ${param.num} > 5 = ${param.num gt 5}입니다. >(gt) >=(ge)<br>
	<h4 />param.num : ${param.num} < 5 = ${param.num lt 5}입니다. <(lt) <=(le)<br>
	<h4 />empty(null && "") : ${empty param.num}입니다. <br>
	<h4 />not empty : ${not empty param.num}입니다. <br>
	<h4 />삼항 연산자 : ${empty param.num ? '값이 비어있습니다.' : param.num} <br>
	<h4 />/ : ${param.num / 3} <br>
	

</body>
</html>