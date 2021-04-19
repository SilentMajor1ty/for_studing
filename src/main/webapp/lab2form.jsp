<%-- 
    Document   : lab2form
    Created on : 11.04.2021, 18:27:58
    Author     : sereg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert page</title>
    </head>
    <body>
        <h1>Insert x</h1>
        <p>Your equation is: sqrt(dх)/(ax^2+bx+c)</p>
        <div>
            <form action="./lab2" method="post">           
                <input type="text" name="x" placeholder="enter x" />
                <input type="submit" value="Ok"/>
            </form>
        </div>
    </body>
</html>
