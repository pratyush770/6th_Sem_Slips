<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
    int n = Integer.parseInt(request.getParameter("n"));
    int i,result=0,r=0;
    int num = n;
    while(n!=0)
    {
        r=n%10;
        result = result+(r*r*r);
        n = n/10;
    }
    if(result==num)
    {
        out.println("It is an armstrong number");
    }
    else
    {
        out.println("It is not an armstrong number");
    }
    %>
</body>
</html>