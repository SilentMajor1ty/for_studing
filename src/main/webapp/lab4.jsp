<%-- 
    Document   : lab4
    Created on : 23.04.2021, 0:04:56
    Author     : sereg
--%>

<%@page import="knu.fit.ist.ta.lab4.Text"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab4</title>
    </head>
    <body>
        <%Text text = new Text("The internet of things, or IoT, is a system of interrelated computing devices, mechanical and digital machines, objects, animals or people that are provided with unique identifiers (UIDs) and the ability to transfer data over a network without requiring human-to-human or human-to-computer interaction."
                + "A thing in the internet of things can be a person with a heart monitor implant, a farm animal with a biochip transponder, an automobile that has built-in sensors to alert the driver when tire pressure is low or any other natural or man-made object that can be assigned an Internet Protocol (IP) address and is able to transfer data over a network."
                + "Increasingly, organizations in a variety of industries are using IoT to operate more efficiently, better understand customers to deliver enhanced customer service, improve decision-making and increase the value of the business.How IoT works?An IoT ecosystem consists of web-enabled smart devices that use embedded systems, such as processors, sensors and communication hardware, to collect, send and act on data they acquire from their environments."
                + "IoT devices share the sensor data they collect by connecting to an IoT gateway or other edge device where data is either sent to the cloud to be analyzed or analyzed locally. Sometimes, these devices communicate with other related devices and act on the information they get from one another. The devices do most of the work without human intervention, although people can interact with the devices -- for instance, to set them up, give them instructions or access the data."
                + "Why IoT is important?The internet of things helps people live and work smarter, as well as gain complete control over their lives. In addition to offering smart devices to automate homes, IoT is essential to business. IoT provides businesses with a real-time look into how their systems really work, delivering insights into everything from the performance of machines to supply chain and logistics operations");
        %>
<h1>This is my lab4!</h1>

<h2>Clear text,count the number of words,count unique words,count three most frequent words,count words without "b",count words with exactly 3 unique letters,count most common 8-letter sequences</h2>

<p>Original text: </p>
<p> <%= text.getText() %></p>

<p>Clean text: </p>
<p><%= text.getCleanText() %></p>

<p>Count of words: <%= text.getTotalWordCount() %></p>

<p>Unique words: <%= text.getUniqueWordsCount() %></p>

<p>Three most frequent words: <%= text.getMostFrequentWords() %></p>

<p>Words without "b": <%= text.getWordsWithoutB() %> </p>

<p>Words with exactly 3 unique letters: <%= text.getThreeDifferentLetterWords() %></p>

<p>Most common 8-letter sequences: <%= text.getThreeLetterSeqs() %></p>

<a href="index.jsp">Home</a>

    </body>
</html>
