<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value='/resources/css/bootstrap.css'/>" rel="stylesheet">
        <title>Beranda</title>
    </head>

    <body>
        <jsp:include page="navbar.jsp"/>
        <jsp:include page="head.jsp"/>
        <jsp:include page="carousel.jsp"/>
        
        <div class="card text-center" style="padding: 10px;" align="center">
        <div class="card-header">
        </div>
            <div class="card-body">
                <h2 class="card-title">Selamat Datang</h2>
                <p class="card-text">Di dieu...</p>
                <a href="register" class="btn btn-primary">Register</a>
                <a href="#" class="btn btn-danger">Login</a>
            </div>
        </div>
        

        
        <!---this the js to run animation-->
        <script src="<c:url value='/resources/js/jquery.js'/>" type='text/javascript'/></script>
        <script src="<c:url value='/resources/js/bootstrap.min.js'/>" type='text/javascript'></script>
        <script src="<c:url value='/resources/js/google-code-prettify/prettify.js'/>"></script>
        <script src="<c:url value='/resources/js/bootshop.js'/>"></script>
        <script src="<c:url value='/resources/js/jquery.lightbox-0.5.js'/>"></script>
        <!--- end js blok---->
        
    </body>
</html>
