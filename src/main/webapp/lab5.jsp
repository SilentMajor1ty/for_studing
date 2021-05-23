<%-- 
    Document   : lab5
    Created on : 13.05.2021, 18:54:28
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
        <h1>This is my lab5!</h1>
        <h1>Task 1: Use linearSearch to analyze text from previous lab </h1>
        <h2>Search <%=request.getAttribute("t1find")%> in text (linearSearch)</h2>
        <h2><%=request.getAttribute("t1")%></h2>
        
        <h1>Task 2: Generate list of String and Byte objects</h1>
        <h2>Unsorted list of string values</h2>
        <h2><%=request.getAttribute("t2s")%></h2>
        
        
        <h2>Unsorted list of byte values</h2>
        <h2><%=request.getAttribute("t2b")%></h2>
        
        
        <h2>Sorted list of string values</h2>
        <h2><%=request.getAttribute("sortedList")%></h2>
        
        <h2>Sorted list of byte values</h2>
        <h2><%=request.getAttribute("sortedListv2")%></h2>
        
        <h1>Task 3: Use sorting and search algorithms</h1>
        <h2>Search <%=request.getAttribute("t3string")%> in string list (sortAproach3)</h2>
        <h2><%=request.getAttribute("findt3s")%></h2>
        
        <h2>Search <%=request.getAttribute("t3byte")%> in byte list (sortAproach3)</h2>
        <h2><%=request.getAttribute("findt3b")%></h2>
        
        <div>
            <form action="lab5form.jsp">  
                <input type="submit" value="Once again">
            </form>
</html>
