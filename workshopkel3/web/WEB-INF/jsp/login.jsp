<%-- 
    Document   : login
    Created on : Dec 29, 2017, 9:15:04 AM
    Author     : user
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="jumbotron">Form Login</h1>
        <form:form  action="login/check" modelAttribute="loginBean"  method="POST" >
            <form:label path="username">Username</form:label>
            <form:input path="username"/><br/>
            <form:label path="password">Password</form:label>
            <form:password path="password"/>
            <p>
                <form:button name="submitButton" value="Submit" class="btn btn-primary">Submit</form:button>
            </p>
        </form:form>
    </body>
</html>
