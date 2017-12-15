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
인스턴스 생성하기.
<jsp:useBean id="list" class="java.util.ArrayList"/>

<%--
//먼저 PageContext 보관소에서 객체를 찾는다.
java.util.ArrayList<String> list = pageContext.getAttribute("list");

//없으면 생성한다.
if(list == null){
list = new java.util.ArrayList<String>();
//생성한 객체는 PageContext 보관소에 저장한다.
 --%>
 
 <%
 list.add("홍길동");
 list.add("임꺽정");
 list.add("유관순");
 %>
<p>
리스트 개수 : <%=list.size() %>
</p>

<%
java.util.ArrayList list2 = (java.util.ArrayList)pageContext.getAttribute("list");
%>

<p>
list2.get(1): <%=list2.get(1) %>
</p>

</body>
</html>
