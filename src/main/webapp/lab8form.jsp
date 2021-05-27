<%-- 
    Document   : lab8form
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
        <h1>Solve the problem using three algorithms</h1>
        
         <div>
            <form action="./lab8" method="post">
                <h2 style="color:#2246B1">Array: {125, 2354, 35, 456 , 1, 1, 3, 45, 0, 456, 0}</h2>
                <h3>Enter the number you want to find:</h3>
                 
                <input type="text" name="number" placeholder="like 10"/>
                <input type="submit" value="Ok">
            </form>
        </div>
    </body>
</html>
