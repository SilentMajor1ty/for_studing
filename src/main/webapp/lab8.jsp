<%-- 
    Document   : lab8
    Author     : sereg
--%>

<%@page import="java.util.Arrays"%>
<%@page import="knu.fit.ist.ta.lab8.Search"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>The problem solved via jumpSearch, linearSearch, binarySearch</h1>
                <%! int[] arr= {0, 4, 6, 9, 11, 4, 6, 9, 11, 4, 6, 9, 11, 4, 6, 9, 11, 7, 8, 78, 82, 93, 100, 11}; %>
                <%! Search alg = new Search();%>
                <%int number = (int)request.getAttribute("lab8"); %>
                <h3 style="color:#2246B1">Array: <%=Arrays.toString(arr)%></h3>
           
                <%
                long startTime = System.nanoTime();
                int i = alg.jumpSearch(arr, number);
                long endTime = System.nanoTime();
                long SearchDuration = (endTime - startTime);         
                %>
                <h1>Algorithm: jump search</h1>
                <h3>Іndex: <%=i%></h3>
                <h3>Execution time: <%=SearchDuration%></h3>
                <h3>Algorithm complexity: O(sqrt (N))</h3>
                <%
                startTime = System.nanoTime();
                i = alg.binarySearch(arr, number);
                endTime = System.nanoTime();
                SearchDuration = (endTime - startTime);         
                %>
                <h1>Algorithm: binary search</h1>
                <h3>Іndex: <%=i%></h3>
                <h3>Execution time: <%=SearchDuration%></h3>
                <h3>Algorithm complexity: O(log (N))</h3>
                <%
                startTime = System.nanoTime();
                i = alg.linearSearch(arr, number);
                endTime = System.nanoTime();
                SearchDuration = (endTime - startTime); 
                %>
                <h1>Algorithm: linear search</h1>
                <h3>Іndex: <%=i%></h3>
                <h3>Execution time: <%=SearchDuration%></h3>
                <h3>Algorithm complexity: O(N)</h3>
                
        <div>
            <form action="lab8form.jsp">  
                <input type="submit" value="Once again">
            </form> 
        </div>
        
        <p><a href="index.jsp">Home</a></p>
    </body>
</html>
