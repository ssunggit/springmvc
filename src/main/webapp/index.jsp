<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><a href="<%= request.getContextPath()%>/hello/hello.do">hello</a></h1>
	
	<h1><a href="<%= request.getContextPath()%>/method/method.do">method</a></h1>
	
	<h1>
							<!-- ContextPath : 서버가 어플리케이션을 인식하는 이름: springmvc -->
		<a href="<%= request.getContextPath()%>/form/joinForm.do">회원가입</a>
	</h1>
	
	<h1><a href="<%= request.getContextPath()%>/resBody.do">responseBody</a></h1>
	
	<h1><a href="<%= request.getContextPath()%>/resJsonBody.json">responseBodyJson.json</a></h1>
	<h1><a href="<%= request.getContextPath()%>/resVOBody.json">resVOBody.json</a></h1>
	<h1><a href="<%= request.getContextPath()%>/resJsonListBody.json">resJsonListBody.json</a></h1>
	
</body>
</html>