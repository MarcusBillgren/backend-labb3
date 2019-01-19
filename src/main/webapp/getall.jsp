<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All users listed here</title>
</head>
<body>
<c:forEach items="${users}" var="user">
 User: <c:out value="${user.name}, ${user.profession}"></c:out> <br>
</c:forEach>

<a href="index.jsp">Back</a>
</body>
</html>