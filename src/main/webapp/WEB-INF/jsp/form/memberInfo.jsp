<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>memberInfo.jsp 입니다. </h1>
	
	<h2> [memberVO] </h2>
	ID : ${ memberVO.id } <br>
	PASSWORD : ${ memberVO.password } <br>
	Name : ${ memberVO.name } <br>
	
	<h2> [member1] </h2>
	ID : ${ member1.id } <br>
	PASSWORD : ${ member1.password } <br>
	Name : ${ member1.name }
</body>
</html>