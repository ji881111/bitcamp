<%@page import="domain.Member"%>
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

<h1>jsp:setProperty,jsp:getProperty,</h1>
셋터 호출하기

<jsp:useBean id ="m" class="domain.Member">
    <jsp:setProperty name="m" property="name" value="홍길동"/>
    <jsp:setProperty name="m" property="age" value="20"/>
    <jsp:setProperty name="m" property="working" value="true"/>
</jsp:useBean>
<p>
이름:<jsp:getProperty name="m" property="name" /><br>
나이:<jsp:getProperty name="m" property="age" /><br>
재직자:<jsp:getProperty name="m" property="working" /><br>
</p>
</body>
</html>
  