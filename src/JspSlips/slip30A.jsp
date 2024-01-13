<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .result
        {
            color:blue;
        }
    </style>
</head>
<body>
    <%
    int n = Integer.parseInt(request.getParameter("n"));
    StringBuffer sb = new StringBuffer();
    int i,j,count,index;
    for(i=2;i<=n;i++)
    {
        count=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            sb.append(i).append(" ");
        }
    }
    %>
    <p class="result">The prime numbers are : <%= sb.toString() %></p>
</body>
</html>