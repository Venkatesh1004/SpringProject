<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<form:form action="login" modelAttribute="modelObjForm" method="post">  

<span style = "color:red"><form:errors path = "username"></form:errors></span><br>
Username: <form:input path="username" /><br>

<span style = "color:blue"><form:errors path = "password">  </form:errors></span><br>
Password: <form:input path="password" /><br>
		<input type="submit" value="Login to Spring" />




	</form:form>

</body>
</html>