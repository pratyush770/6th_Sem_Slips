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
    int t2 = 0;
    for(int i =0;i<s.length;i++)
    {
        t2+=Integer.parseInt(s[i]);
    }
    int total = Integer.parseInt(session.getAttribute("t1").toString());
    int gtotal = total + t2;
    out.println("<table border = '1'>");
    out.println("<tr><th>Page 1 Total</th><th>Page 2 Total</th><th>Grand Total</th></tr>");
    out.println("<tr><td>" + total + "</td>");
    out.println("<td>" + t2 + "</td>");
    out.println("<td>" + gtotal +  "</td></tr>");
    out.println("</table>");
    %>
</body>
</html>