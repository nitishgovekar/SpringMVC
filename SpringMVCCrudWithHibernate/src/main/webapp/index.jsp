<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>as</title>
<body>
<h2>Hello World!</h2>


<%--  <form:form id="loginForm" method="post" action="login" modelAttribute="user">
 
            <form:label path="username">Enter your user-name</form:label>
            <form:input id="username" name="username" path="username" /><br>
            <form:label path="username">Please enter your password</form:label>
            <form:password id="password" name="password" path="password" /><br>
            <input type="submit" value="Submit" />
        </form:form> --%>

<!-- <b>Please  <a href="./hello">click here</a></b> -->
<b>Please<a href="./employeePortal">Click here to go to Employee Management Portal</a></b><br><br>

<b>Please<a href="./showLoginPage">Please Login here </a></b>




</body>
</html>
