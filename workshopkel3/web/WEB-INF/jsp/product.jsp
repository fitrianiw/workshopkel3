<%-- 
    Document   : product
    Created on : Dec 29, 2017, 9:34:55 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="prod" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Page</title>
    </head>
    <body>
        <prod:forEach var="p" items="${products}">
           Nama Product : ${p.namaProduct}<br>
           Deskripsi Product : ${p.deskripsi}<br>
           Qty Product : ${p.qty}<br>
           Kategori Product : ${p.idKategori.kategori}<br>
           Harga Product : ${p.harga} <br>
           
        </prod:forEach>
                  <a href="/workshopkel3/product/tambah"><button>Tambah</button></a> <br>    
    </body>
</html>
