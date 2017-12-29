<%-- 
    Document   : register
    Created on : 17-Dec-2017, 10:34:00
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <style>
            .error{color:red}
        </style>
        
        <h1>Hello World!</h1>

        <form:form action="register/save" commandName="registerBean" modelAttribute="registerBean" role="form" method="Post">

            <table>
                <tr>
                    <td><form:label path="firstName">First Name</form:label></td>
                    <td><form:input path="firstName" class="form-control"/></td>
                    <td><form:errors path="firstName" cssClass="error"/></td>
                </tr>

                <tr>
                    <td><form:label path="lastName">Last Name</form:label></td>
                    <td><form:input path="lastName" class="form-control"/></td>
                    <td><form:errors path="lastName" cssClass="error"/></td>
                </tr>


                <tr>
                    <td><form:label path="userName">Username</form:label></td>
                    <td> <form:input path="userName" class="form-control"/></td>
                    <td><form:errors path="userName" cssClass="error"/></td>
                </tr>


                <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:password path="password" class="form-control"/></td>
                    <td><form:errors path="password" cssClass="error"/></td>
                </tr>
                <form:hidden path="levelUser" value="1"></form:hidden>

                <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email" class="form-control"/></td>
                    <td><form:errors path="email" cssClass="error"/></td>
                </tr> 



                <!--form:select path="levelUser" class="form-control" required="true">

                <!--form:option label="Pedagang" value="1"><!--/form:option>
                <!--form:option label="Pembeli" value="2"><!--/form:option-->
                <!--/form:select-->
                <tr>
                <p>
                    <form:button name="submitButton" value="Submit" class="btn btn-md btn-primary">Submit</form:button>
                    </p>
                </tr>
            </table>
    </form:form>

</body>
</html>
