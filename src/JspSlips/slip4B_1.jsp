<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
    String s[] = request.getParameterValues("prod");
    int t1 = 0;
    for(int i =0;i<s.length;i++)
    {
        t1+=Integer.parseInt(s[i]);
    }
    session.setAttribute("t1",t1);
    response.sendRedirect("slip4B_2.html");
    %>
</body>
</html>