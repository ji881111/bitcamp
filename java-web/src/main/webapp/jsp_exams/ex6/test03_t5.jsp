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
scope 지정하기.<br>
보관소를 지정하지 않으면 기본이 pageContext이다.

<jsp:useBean id="list1" class="java.util.ArrayList"/>

<jsp:useBean id="list2" class="java.util.ArrayList" scope="request"/>
<h2>PageContext 보관소</h2>
list1 : <%=pageContext.getAttribute("list1")%><br>
list2 : <%=pageContext.getAttribute("list2")%><br>

<h2>ServletRequest 보관소</h2>
list1 : <%=request.getAttribute("list1")%><br>
list2 : <%=request.getAttribute("list2")%><br>
</body>
</html>
