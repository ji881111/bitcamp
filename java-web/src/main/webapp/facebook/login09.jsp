<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="facebookUrl" value="http://graph.facebook.com/v2.12/me">
    <c:param name="access_token" value="${param.accessToken}"/>
    <c:param name="fileds" value="id,name,email,gender"/>
</c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
<c:import url="${facebookUrl}"></c:import>
</body>
</html>