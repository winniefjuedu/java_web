<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Welcome todo!!!</title>
	</head>
	<body>	
		<h1>Welcome ${name}</h1>
		<div>
		Your Todo's are
		<ol>
		<c:forEach items="${todos}" var="todo">
		   <li>${todo.name}</li>
		</c:forEach>
		</ol>
		</div>
	</body>
</html>