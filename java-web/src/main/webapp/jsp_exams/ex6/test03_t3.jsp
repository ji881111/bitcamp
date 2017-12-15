<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h2>jsp:useBean 테스트</h2>
인스턴스 꺼내기
<%
pageContext.setAttribute("list", new java.util.ArrayList());
%>

<jsp:useBean id="list" type="java.util.ArrayList"/>

<p>
리스트 크기 : <%=list.size()%>
</p>

</body>
</html>
