<%-- 
    Document   : registrationform
    Created on : Dec 28, 2017, 10:28:53 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Registration Form</title>
    </head>
    <body>
       <div class="container">
            <div class="card">
                <div class="card-header">
                    Registration Form
                </div>
                <div class="card-body">
                    <form:form action="registrasi/save" modelAttribute="registerBean" method="POST">
                </div>
                <div>
                            <form:label path="nama">Nama</form:label>
                                <form:input path="nama"/>
                            <form:label path="jenis_kelamin">Jenis Kelamin</form:label></td>
                                <form:input path="jenis_kelamin"/>
                            <form:label path="email">Email</form:label>
                                <form:input path="email"/>
                            <form:label path="level">Level</form:label>
                                <form:input path="level"/>
                            <tr><td><form:label path="telp">No Telp</form:label></td>
                                <td><form:input path="telp"/></td></tr>
                            <tr><td><form:label path="alamat">Alamat</form:label></td>
                                <td><form:input path="alamat"/></td></tr>
                            <tr><td><form:label path="tgl_lahir">Tanggal Lahir</form:label></td>
                                <td><form:input path="tgl_lahir"/></td></tr>
                            <tr><td><form:label path="username">Username</form:label></td>
                                <td><form:input path="username"/></td></tr>
                            <tr><td><form:label path="password">Password</form:label></td>
                                <td><form:password path="password" /></td></tr>
                            <!--form:hidden path="ordersList" title="null" value="null"--><!--/form:hidden>
                            <tr><td></td><td><form:button name="submitButton" value="Submit">Submit</form:button></td></tr>            
<!---->                                      
                    </form:form>
 </div> 
                </div>
            </div>
        </div>
    </body>
</html>