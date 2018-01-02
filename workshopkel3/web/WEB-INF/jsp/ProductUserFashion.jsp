<%-- 
    Document   : ProductUser
    Created on : Jan 2, 2018, 9:50:16 AM
    Author     : Harry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            /* Remove the navbar's default margin-bottom and rounded borders */ 
            .navbar {
                margin-bottom: 100;
                border-radius: 0;
            }

            /* Add a gray background color and some padding to the footer */
            footer {
                background-color: #f2f2f2;
                padding: 25px;
            }

            .carousel-inner img {
                width: 100%; /* Set width to 100% */
                margin: auto;
                min-height:200px;
            }

            /* Hide the carousel text when the screen is less than 600 pixels wide */
            @media (max-width: 600px) {
                .carousel-caption {
                    display: none; 
                }
            }
        </style>
    </head>
    <body>
        <jsp:include page="navbarUser.jsp"/>

        <div class="container text-center" align="center">     
            <h3>Fashion Baju</h3><br>
            <div class="row">
                <div class="col-sm-4">
                    <img src ="<c:url value="/resources/img/kasur9.jpg"/>" alt="Image">
                    <br/>
                    <a class="btn btn-lg btn-primary" href="#">Add To Cart</a>
                </div>
                <div class="col-sm-4">
                    <img src ="<c:url value="/resources/img/kasur9.jpg"/>" alt="Image">
                    <br/>
                    <a class="btn btn-lg btn-primary" href="#">Add To Cart</a>
                </div>
                <div class="col-sm-4">
                    <img src ="<c:url value="/resources/img/kasur9.jpg"/>" alt="Image">
                    <br/>
                    <a class="btn btn-lg btn-primary" href="#">Add To Cart</a>
                  
                </div>
            </div>
        </div>
                    
                    <div class="container text-center" align="center">
                        <br/>
                        <br/>
                        <br/>
                        <br/>
                        <h3>Fashion Celana</h3><br>
            <div class="row">
                <div class="col-sm-4">
                    <img src ="<c:url value="/resources/img/kasur9.jpg"/>" alt="Image">
                    <br/>
                    <a class="btn btn-lg btn-primary" href="#">Add To Cart</a>
                </div>
                <div class="col-sm-4">
                    <img src ="<c:url value="/resources/img/kasur9.jpg"/>" alt="Image">
                    <br/>
                    <a class="btn btn-lg btn-primary" href="#">Add To Cart</a>
                </div>
                <div class="col-sm-4">
                    <img src ="<c:url value="/resources/img/kasur9.jpg"/>" alt="Image">
                    <br/>
                    <a class="btn btn-lg btn-primary" href="#">Add To Cart</a>
                </div>
            </div>
        </div>
                    
                    
                    <div class="container text-center" align="center">
                        <br/>
                        <br/>
                        <br/>
                        <br/>
                        <h3>Fashion Aksesori</h3><br>
            <div class="row">
                <div class="col-sm-4">
                    <img src ="<c:url value="/resources/img/kasur9.jpg"/>" alt="Image">
                    <br/>
                    <a class="btn btn-lg btn-primary" href="#">Add To Cart</a>
                </div>
                <div class="col-sm-4">
                    <img src ="<c:url value="/resources/img/kasur9.jpg"/>" alt="Image">
                    <br/>
                    <a class="btn btn-lg btn-primary" href="#">Add To Cart</a>
                </div>
                <div class="col-sm-4">
                    <img src ="<c:url value="/resources/img/kasur9.jpg"/>" alt="Image">
                    <br/>
                    <a class="btn btn-lg btn-primary" href="#">Add To Cart</a>
                </div>
            </div>
        </div>
                    
            <br/>
            <jsp:include page="footer.jsp"/>
    </body>
</html>
