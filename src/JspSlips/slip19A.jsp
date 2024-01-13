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
            case '0':out.print(" Zero ");break;
            case '1':out.print(" One ");break;
            case '2':out.print(" Two ");break;
            case '3':out.print(" Three ");break;
            case '4':out.print(" Four ");break;
            case '5':out.print(" Five ");break;
            case '6':out.print(" Six ");break;
            case '7':out.print(" Seven ");break;
            case '8':out.print(" Eight ");break;
            case '9':out.print(" Nine ");break;
        }
    }
    %>
</body>
</html>