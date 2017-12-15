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

<h2>JSP 스크립트릿</h2>

<pre calss="jsp">
&lt;%
int a = 10;
int b = 20;
out.println(a + b);
%>
</pre>

<h2>생성된 자바 코드</h2>
자바소스 그대로 복사된다.
<pre class="java">

a = 10;
b = 20;
out.prinln(a + b);

</pre>

</body>
</html>