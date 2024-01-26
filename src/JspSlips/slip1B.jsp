<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    out.println("<h2>Username is : " + username);
    session.setAttribute("username",username);
    out.println("<h2>Session variable is : " + username);
    session.setAttribute("password",password);
    %>
    <br>
    <a href="slip1B_2.jsp">Continue</a>
</body>
</html>