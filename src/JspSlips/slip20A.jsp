<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3307/mydatabase";
    String uname = "root";
    String pwd = "matsumoto";
    Connection con = DriverManager.getConnection(url,uname,pwd);
    String s = "select * from hospital";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(s);
    out.println("<table border='1'>");
    out.println("<tr><th>Hospital Number</th><th>Hospital Name</th><th>Address</th></tr>");
    while(rs.next())
    {
        out.println("<tr>");
        out.println("<td>" + rs.getInt(1) + "</td>");
        out.println("<td>" + rs.getString(2) + "</td>");
        out.println("<td>" + rs.getString(3) + "</td>");
        out.println("</tr>");
    }
    out.println("</tr>");
    out.println("</table>");
    %>
</body>
</html>