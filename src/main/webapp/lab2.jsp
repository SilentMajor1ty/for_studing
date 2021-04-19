<%-- 
    Document   : lab2
    Created on : 11.04.2021, 18:26:48
    Author     : sereg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 2</title>
    </head>
    <body>
        <h1>This is my lab2!</h1>
        
        
        <p>Реалізувати алгоритм обчислення виразу: sqrt(dх)/(ax^2+bx+c)</p>
        <p>a=-2, b=6,c=3,d=2</p>
        <p>Your answer is:</p><p><%=request.getAttribute("result")%></p>
         <a href="index.jsp">Home</a>
    </body>
</html>
