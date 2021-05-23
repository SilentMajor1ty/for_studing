<%-- 
    Document   : lab8
    Created on : 23.05.2021, 18:37:48
    Author     : sereg
--%>

<%@page import="java.util.Arrays"%>
<%@page import="knu.fit.ist.ta.lab8.Algorithms"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! Algorithms lTA = new Algorithms(); %>
        
        <%
        int[] arrayOfInt = new int[] {2, 11, 7, 15};
        int sumInt = 26;
        
        String textArrayOfInt = Arrays.toString(arrayOfInt); 
        
        
        
        
        long startTime = System.nanoTime();
        String firstResult = Arrays.toString(lTA.getFirstResult(arrayOfInt, sumInt));;
        long endTime = System.nanoTime();
        long firstDuration = (endTime - startTime);
        
        long secondStartTime = System.nanoTime();
        String secondResult = Arrays.toString(lTA.getSecondResult(arrayOfInt, sumInt));
        long secondEndTime = System.nanoTime();
        long secondDuration = (secondEndTime - secondStartTime);
        %>
        
        <h1>Task:</h1>
        <p>There is an array of 4 different numbers: <%=textArrayOfInt%></p>
        <p>And the number: <%=sumInt%></p>
        <p>The task is to find positions of 2 numbers from array, that will make up <%=sumInt%> when added.</p>
        
        <h2>Solution № 1:</h2>
        <p>Positions of numbers, that make up <%=sumInt%> when added: <%=firstResult%></p>
        <p>Duration for performing of this method is <%=firstDuration%> nanoseconds</p>
        <p>Big-O notation for time complexity is: O(n2) </p>
        
        <h2>Solution № 2:</h2>
        <p>Positions of numbers, that make up <%=sumInt%> when added: <%=secondResult%></p>
        <p>Duration for performing of this method is <%=secondDuration%> nanoseconds</p>
        <p>Big-O notation for time complexity is: O(n) </p>
        
        <a href="index.jsp">Home</a>
    </body>
</html>
