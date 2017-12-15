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
<h1>지시부(directive element)</h1>
서블릿 클래스에 특별한 작업을 지시할때 사용한다.<br>

<h2>JSP 코드</h2>
JSP페이지에 대한 일반 제어 코드를 생성한다.
<pre class="jsp">
&lt;%@ page 
    language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
    autoFlush="true"
    buffer="8kb"
    errorPage="URL"
    import="패키지 및 클래스명"
%>
</pre>

<h3>language 속성</h3>
<p>
JSP 스크립트릿에서 사용할 프로그래밍 언어를 지정한다.<br>
원래는 Java 뿐만 아니라 다른 프로그래밍 언어도 수용하려 하였다.<br>
즉 JSP를 Java에 종속된 기술이 아니라 언어에 독립된 기술로 만들려 하였다.<br>
그러나 지금까지 java만 지원하고 있다.<br>
한 때 개발자들이 java 이외의 언어도 지원하도록 오픈 프로젝트를 진행 한 적이 있다.<br>
그러나 지금은 모두 폐기되었다.<br>
현재는 'java' 값만 지정할 수 있다.<br>
</p>
<h3>contentType 속성</h3>
<p>
출력하는 콘텐츠의 MIME 타입과 문자집합을 설정하는 코드를 생성한다.<br>
즉 다음의 자바 코드를 생성한다.
</p>

<pre class="java">
    //contentType="text/html; charset=UTF-8"
    response.setContentType("text/html; charset=UTF-8");
</pre>

<h3>pageEncoidng 속성</h3>
<p>
JSP 페이지를 작성할 때 사용한 문자집합을 지정한다.<br>
JSP 엔진이 템플릿 데이터를 출력문으로 바꿀 때 참조한다.<br>
JSP 파일을 'UTF-8'로 저장하였으면, 이 속성의 값도 'UTF-8'로 지정하라!<br>
생략해도 된다.
</p>

<h3>trimDirectiveWhitespaces 속성</h3>
<p>
지시부 태그들 사이에 삽인된 공백(스페이스, 줄바꿈, 탭 등)을
출력문으로 바꾸지 않는다.
</p>


<h3>autoFlush 속성</h3>
<p>
출력한 콘텐츠가 버퍼에 꽉 찼을때 자동으로 출력할지를 결정한다.<br>
true 이면, 자동으로 출력한다. true가 기본값이다.<br>
false로 설정하면, 버퍼가 찼을 때 실행 오류를 발생시킨다.<br>
즉 false로 설정했을 때는 개발자가 버퍼가 차기전에
명시적으로 flush()를 호출하여 버퍼의 내용을 출력해야한다.<br>

</p>

<h3>buffer 속성</h3>
<p>

</p>

<h3>errorPage 속성</h3>
<p>

</p>

<h3>import 속성</h3>
<p>
서블릿 클래스에 import문을 추가할 때 사용한다.<br>
import 속성의 값을 설정하면 다음과 같이 자바 코드를 생성한다.<br>
</p>
<pre class="java">
    //import="java.lang.String"
    import java.lang.String;
    
    //import="java.lang.*"
    import java.lang.*;
    
    //import="java.lang.String,java.util/*,java.net,*"
    import java.lang.String;
    import java.util.*;
    import java.net.*;
    
    //다음과 같이 page 태그를 여러 개 추가해도 된다.
    //&lt;%@ page import
   
</pre>

</body>
</html>
