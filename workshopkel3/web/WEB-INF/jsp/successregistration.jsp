<%-- 
    Document   : successregistration
    Created on : Dec 28, 2017, 11:08:41 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link href="<c:url value='/resources/css/bootstrap.css'/>" rel="stylesheet">
        <link href="<c:url value='/resources/css/login.css'/>" rel="stylesheet">
        <script src="<c:url value='/resources/js/bootstraps.js'/>"  ></script>
        <title>Registrasi Berhasil </title>
        <jsp:include page="navbar.jsp"/>
    </head>
    <body>
        <h1>Registrasi Berhasil, Selamat Berbelanja ${user.username}</h1>
    </body>
</html>
