<%-- 
    Document   : index
    Created on : Oct 13, 2022, 9:42:25 AM
    Author     : Shakith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://jiat.com/mytag" prefix="mt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <mt:messaage/>

        <mt:calculation value1="2" value2="20" var="x" scope="application"/>

        <mt:loop count="5">
            <h1>Hello</h1>
        </mt:loop>

        <mt:loop count="2">
            <h1>OK</h1>
        </mt:loop>
    </body>
</html>
