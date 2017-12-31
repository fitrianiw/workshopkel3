<%-- 
    Document   : successlogin
    Created on : Dec 31, 2017, 8:43:29 PM
    Author     : user
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link href="<c:url value='/resources/css/bootstrap.css'/>" rel="stylesheet">
        <link href="<c:url value='/resources/css/login.css'/>" rel="stylesheet">
        <script src="<c:url value='/resources/js/bootstraps.js'/>"  ></script>
        <title>Login Berhasil </title>
        <jsp:include page="navbar.jsp"/>
    </head>
    <body>
        <div class="container">
            <h1>Selamat datang, ${user.nama}</h1></br>
        </div>
    </body>
</html>
