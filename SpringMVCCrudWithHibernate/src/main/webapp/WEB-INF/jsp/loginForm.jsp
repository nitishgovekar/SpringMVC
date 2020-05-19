<%@ page contentType="text/html;charset=UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "f"%>

<html>
<body>
	<h1 >Welcome To login</h1>

<c:if test="${isValidCredential}">
	<h2>Either UserName or password is incorrect</h2><
	<br/>
</c:if>
	
		<h2>Login Details</h2>
		<form action="loginCheck" method="POST">
			<br />
			
			
			<label>UserName</label>
			<input id="userName" name="userName" type="text" />
			<br />
			<label>Password</label>
			<input id="password" type="password" name="password" />
			 <br />
			<input type="submit" value="Submit">
		</form>

</body>
</html>