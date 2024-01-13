<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
   
</head>
<body>
    <%
    String n1 = request.getParameter("n1");
    String n2 = request.getParameter("n2");
    String n3 = request.getParameter("n3");
    String n4 = request.getParameter("n4");
    String n5 = request.getParameter("n5");
    out.println("The roll number of the student is : " + n1 + "<br>");
    out.println("The name of the student is : " + n2 + "<br>");
    out.println("The gender of the student is : " + n3 + "<br>");
    out.println("The computer knowledge of the student is : " + n4 + "<br>");
    out.println("The class of the student is : " + n5);
    %>
</body>
</html>