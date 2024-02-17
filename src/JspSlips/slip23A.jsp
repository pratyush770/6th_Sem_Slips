<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
   
</head>
<body>
    <%@ page import="java.sql.*"%>
    <%@ page import="java.io.*"%>
    <%
    int n1 = Integer.parseInt(request.getParameter("n1"));
    String n2 = request.getParameter("n2");
    String n3 = request.getParameter("n3");
    String n4 = request.getParameter("n4");
    String n5 = request.getParameter("n5");
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3307/mydatabase";
    String uname = "root";
    String pwd = "matsumoto";
    Connection con = DriverManager.getConnection(url,uname,pwd);
    String q = "insert into student2 values(?,?,?,?,?)";
    PreparedStatement pst = con.prepareStatement(q);
    pst.setInt(1,n1);
    pst.setString(2,n2);
    pst.setString(3,n3);
    pst.setString(4,n4);
    pst.setString(5,n5);
    pst.executeUpdate();
    q = "select * from student2";
    ResultSet rs = pst.executeQuery(q);
    out.println("<table border=1>");
    out.println("<th>Roll Number" + "<th>Student Name" + "<th>Gender" + "<th>Computer Knowledge" + "<th>Class");
    while(rs.next())
    {
        out.println("<tr><td>" + rs.getInt(1) + "<td>" + rs.getString(2) + "<td>" + rs.getString(3) + "<td>" + rs.getString(4) + "<td>" + rs.getString(5) + "</tr>");
    }
    out.println("</table>");
    %>
</body>
</html>