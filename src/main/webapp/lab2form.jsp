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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insert x</h1>
        <div>
            <form action="./lab2" method="post">           
                <input type="text" name="x" placeholder="enter x as ##.###" />
                <input type="submit" value="Ok"/>
            </form>
        </div>
    </body>
</html>
