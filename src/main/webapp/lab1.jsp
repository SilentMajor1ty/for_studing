<%-- 
    Document   : lab1
    Created on : 08.04.2021, 20:49:18
    Author     : sereg
--%>


<%@page import="knu.fit.ist.ta.MyFirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 1</title>
    </head>
    <body>
        <h1>This is my lab1!</h1>
        
        <%!MyFirstJavaClass mFJC = new MyFirstJavaClass(5);%>
        
        <%
           int x = mFJC.getMyInt();
           
           x += 3;
           x %= 3;
           
        %>
        
        <p>8mod3 = <%=x%></p>
        
        <a href="index.jsp">Home</a>
    </body>
</html>