<%@page import="java100.app.domain.Room"%>
<%@page import="java100.app.dao.RoomDao"%>
<%@page import="java100.app.domain.Score"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class); %>
<!DOCTYPE html>
<html>
<head>
<title>강의실관리</title>
<link rel='stylesheet'
    href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
    <div class='container'>
        <jsp:include page="/header.jsp"/>
        <h1>새 강의실</h1>
        <%

        try {
            Room room = new Room();
            room.setLocation(request.getParameter("location"));
            room.setName(request.getParameter("name"));
            room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
            
            roomDao.insert(room);
            %>
            
            <p>저장하였습니다.</p>
            <% 
        } catch (Exception e) {
            e.printStackTrace(); %>
            
            <%=e.getMessage()%> 
            <% 
        }
        %>

        <p>
            <a href='list.jsp' class='btn btn-primary btn-sm'>목록</a>
        </p>
        <jsp:include page="/footer.jsp"/>
    </div>
   <%@ include file="../jslib.txt"%>
</body>
</html>