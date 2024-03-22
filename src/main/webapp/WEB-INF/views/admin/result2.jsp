<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 폼.xml 에 기본적으로 라이브러리가 저장되어 있어 taglib 쓸수있다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결과보기</h1>
	<h2>강아지 이름</h2>
	<h3>
		<c:forEach var="k" items="${dogName}">
			<li>${k}</li>
		</c:forEach>
	</h3>
	<h2>배우 이름</h2>
	<h3>
		<c:forEach var="k" items="${list}">
			<li>${k}</li>
		</c:forEach>
	</h3>
</body>
</html>





















