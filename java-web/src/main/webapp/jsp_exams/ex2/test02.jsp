<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>스크립트릿(scriptlet element)</h1>
<p>JSP페이지에 자바 코드를 사용한다.</p>

<h2>JSP 스크립트릿 테스트</h2>

<%
int a = 10;
int b = 20;
out.println(a + b);
%>
<p>스크립트잇이 선언된 그 위치, 그 순서 그대로 자바 소스 파일에 복사된다.</p>

</body>
</html>