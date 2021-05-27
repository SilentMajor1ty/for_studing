<%-- 
    Document   : lab6-7
    Created on : 22.05.2021, 22:12:44
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
        <h1>Complete the task using recursion and build a binary tree</h1>
        
        <h1>Lab6</h1>
        
        
        <h1>Amount of 2s in <%=request.getAttribute("l6n")%> number:</h1>
        <h2><%=request.getAttribute("lab6")%></h2>
        
        <h1>Lab7</h1>
        <h2>[7, 1, 5, 3, 10, 2, 8, 9]</h2>
        
        <h1> the order of adding numbers to the tree</h1>
        <h2><%=request.getAttribute("lab7ind")%></h2>

        
        <h1> Is <%=request.getAttribute("n1")%> in this tree?</h1>
        <h2><%=request.getAttribute("lab7n1")%></h2>
        
        <h1> Is <%=request.getAttribute("n2")%> in this tree?</h1>
        <h2><%=request.getAttribute("lab7n2")%></h2>
        
        <h1> traverseInOrder</h1>
        <h2><%=request.getAttribute("lab7sort")%></h2>
        
        <h1>traversePreOrder</h1>
        <h2><%=request.getAttribute("lab7pre")%></h2>
        
        <h1>traversePostOrder</h1>
        <h2><%=request.getAttribute("lab7post")%></h2>
        
        <h1>traverseLevelOrder</h1>
        <h2><%=request.getAttribute("lab7lev")%></h2>
        
        <div>
            <form action="lab6-7form.jsp">  
                <input type="submit" value="Once again">
            </form> 
        </div>
        
        <p><a href="index.jsp">Home</a></p>
    </body>
</html>
