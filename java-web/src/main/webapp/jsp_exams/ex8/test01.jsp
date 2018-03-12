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
<h1>EL(Expression Language) 사용법</h1>
OGNL 표기법을 이용하여 자바 객체의 프로퍼티 값을 꺼내는 문법이다.<br>
OGNL(Object Gragh Navigation Languge) 이란?<br>
점(.)이나 대괄호([]) 등을 이용하여 객체의 변수 값을 쉽게 꺼내게 해주는 문법이다.<br>

<h2>기본 표기법</h2>
${객체이름.프로퍼티명} 또는 ${객체이름["프로퍼티명"]}<br>
<pre>
<%-- 
예1)
자바 => map.getAttribute("name")
EL   => ${map.name} 또는 ${map["name"]}

예2)
자바 => member.gerFirstName()
EL   => ${member.firstName} 또는 ${member["firstName"]}

예3)
자바 => car.gerEngine()s.getName()
EL   => ${car.engine.name} 또는 ${car["engine"]["name"]}

--%>
</pre>
</body>
</html>


