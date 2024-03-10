<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
    String n = request.getParameter("t1");
    char ch;
    int i;
    for(i=0;i<n.length();i++)
    {
        ch = n.charAt(i);
        switch(ch)
        {
            case '0':out.print("<font color='red'> Zero ");break;
            case '1':out.print("<font color='red'> One ");break;
            case '2':out.print("<font color='red'> Two ");break;
            case '3':out.print("<font color='red'> Three ");break;
            case '4':out.print("<font color='red'> Four ");break;
            case '5':out.print("<font color='red'> Five ");break;
            case '6':out.print("<font color='red'> Six ");break;
            case '7':out.print("<font color='red'> Seven ");break;
            case '8':out.print("<font color='red'> Eight ");break;
            case '9':out.print("<font color='red'> Nine ");break;
        }
    }
    %>
</body>
</html>