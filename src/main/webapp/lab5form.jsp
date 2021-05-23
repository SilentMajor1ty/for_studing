<%-- 
    Document   : lab5form
    Created on : 19.05.2021, 18:09:04
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
        <h4>The internet of things, or IoT, is a system of interrelated computing devices, mechanical and digital machines, objects, animals or people that are provided with unique identifiers (UIDs) and the ability to transfer data over a network without requiring human-to-human or human-to-computer interaction."
                A thing in the internet of things can be a person with a heart monitor implant, a farm animal with a biochip transponder, an automobile that has built-in sensors to alert the driver when tire pressure is low or any other natural or man-made object that can be assigned an Internet Protocol (IP) address and is able to transfer data over a network."
                Increasingly, organizations in a variety of industries are using IoT to operate more efficiently, better understand customers to deliver enhanced customer service, improve decision-making and increase the value of the business.How IoT works?An IoT ecosystem consists of web-enabled smart devices that use embedded systems, such as processors, sensors and communication hardware, to collect, send and act on data they acquire from their environments."
                IoT devices share the sensor data they collect by connecting to an IoT gateway or other edge device where data is either sent to the cloud to be analyzed or analyzed locally. Sometimes, these devices communicate with other related devices and act on the information they get from one another. The devices do most of the work without human intervention, although people can interact with the devices -- for instance, to set them up, give them instructions or access the data."
                Why IoT is important?The internet of things helps people live and work smarter, as well as gain complete control over their lives. In addition to offering smart devices to automate homes, IoT is essential to business. IoT provides businesses with a real-time look into how their systems really work, delivering insights into everything from the performance of machines to supply chain and logistics operations</h4>
        
        <div>
            <form method="post" action="lab5">
                <h2>Please enter a search word </h2>
                <input type="text" name="t1find" placeholder="find"/>
                <h2>Enter the starting position of your search in the text(NOT NECESSARILY)</h2>
                <input type="text" name="t1start" placeholder="start"/>
                <h2>Enter the end position of your search in the text(NOT NECESSARILY)</h2>
                <input type="text" name="t1finish" placeholder="finish"/>
                <h2>Enter the length of the list</h2>
                <input type="text" name="t2" placeholder="length"/>
                <h2>Please enter a letter to search</h2>
                <input type="text" name="t3string" placeholder="letter"/>
                <h2>Enter the byte value to search</h2>
                <input type="text" name="t3byte" placeholder="byte"/>
                <p> <p>
                <input type="submit" value="ok"/>
            </form>
        </div>
    </body>
</html>
