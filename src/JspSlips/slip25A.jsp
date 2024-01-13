<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%! static int count = 0;%>
    <%
    String uname = request.getParameter("n1");
    String nname = request.getParameter("n2");
    count++;
    if(count%2!=0)
    {
        out.println("The username is : " + uname);
    }
    else
    {
        out.println("The nickname is : " + nname);
    }
    %>
</body>
</html>