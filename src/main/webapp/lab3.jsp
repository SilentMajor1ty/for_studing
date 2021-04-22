<%-- 
    Document   : lab3
    Created on : 15.04.2021, 21:09:08
    Author     : sereg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is my lab3!</h1>
        "Fill the array with natural numbers.Find the position of max number before zero"</h2>
        
        
        <p><%=request.getAttribute("print")%></p>
        
        <p>The index of max number is: <%=request.getAttribute("func")%></p>
        
         <div>
            <form action="lab3form.jsp">  
                <input type="submit" value="New array">
            </form> 
        </div>
        
        <p><a href="index.jsp">Home</a></p>
        
    </body>
</html>
