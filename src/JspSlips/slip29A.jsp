<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
    String name = request.getParameter("n1");
    int age = Integer.parseInt(request.getParameter("n2"));
    if(age<18)
    {
        out.println("You are not eligible for voting as your age is less than 18");
    }
    else if(age>60)
    {
        out.println("You are not eligible for voting as your age is more than 60");
    }
    else
    {
        out.println("You are eligible for voting");
    }
    %>
</body>
</html>