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
<h1>PageContext 보관소</h1>
JSP 페이지를 실행할 때 생성되고 실행이 끝나면 제거된다.<br>
<pre>
1) request:ServletRequest,
2) response:HTtpServletResponse
    =>_jspServlet()의 파라미터 변수이다.
    =>반드시 request, response라는 이름을 가져야 한다
3) application:ServletContext
4) session:HttpSession
5) pageContext: PageContext
6) config:ServletConfig
7) page == this
8) out:JSpWriter
9) error:Throwable

</pre>
</body>
</html>


