<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    Hello, 
    <%
    String u = session.getAttribute("username").toString();
    out.print(" " + u);
    out.println("<br>");
    String p = session.getAttribute("password").toString();
    if(u.equals(p))
    {
        out.println("Valid password");
    }
    else
    {
        out.println("Invalid password");
    }
    %>
</body>
</html>