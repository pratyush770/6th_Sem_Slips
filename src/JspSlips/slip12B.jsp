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
    String url = "jdbc:mysql://localhost:3306/mydatabase";
    String uname = "root";
    String pwd = "matsumoto";
    Connection con = DriverManager.getConnection(url,uname,pwd);
    String s = "insert into account values(?,?,?)";
    PreparedStatement pst = con.prepareStatement(s);
    int n1 = Integer.parseInt(request.getParameter("n1"));
    String n2 = request.getParameter("n2");
    int n3 = Integer.parseInt(request.getParameter("n3"));
    pst.setInt(1,n1);
    pst.setString(2,n2);
    pst.setInt(3,n3);
    pst.executeUpdate();
    s = "select * from account";
    ResultSet rs = pst.executeQuery(s);
    out.println("<table border='1'>");
    out.println("<tr><th>Account Number</th><th>Account Type</th><th>Balance</th></tr>");
    while(rs.next())
    {
        out.println("<tr>");
        out.println("<td>" + rs.getInt(1) + "</td>");
        out.println("<td>" + rs.getString(2) + "</td>");
        out.println("<td>" + rs.getInt(3) + "</td>");
        out.println("</tr>");
    }
    out.println("</table>");
    %>
</body>
</html>