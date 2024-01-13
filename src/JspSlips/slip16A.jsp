<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%@ page import="java.util.*"%>
    <%
    String name = request.getParameter("n");
    Date d = new Date();
    int hr = d.getHours();
    if(hr>6 && hr<12)
    {
        out.println("Good Morning " + name);
    }
    else if(hr>=12 && hr<16)
    {
        out.println("Good Afternoon " + name);
    }
    else if(hr>=16 && hr<20)
    {
        out.println("Good Evening " + name);
    }
    else
    {
        out.println("Good Night" + name);
    }
    %>
</body>
</html>