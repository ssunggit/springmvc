<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원가입 화면입니다.
	
	<form action="<%= request.getContextPath()%>/join.do">
		ID : <input type="text" name="id" size="20"/> <br>
		password : <input type="text" name="password" size="20"/> <br>
		Name : <input type="text" name="name" size="20"/> <br>
		<input type="submit" value="회원가입" />
	</form>	
	
</body>
</html>