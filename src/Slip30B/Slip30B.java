import java.sql.*;
import java.io.*;
import javax.servlet.*;
public class Slip30B extends GenericServlet
{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String uname = "root";
            String pwd = "matsumoto";
            Connection con = DriverManager.getConnection(url,uname,pwd);
            res.setContentType("text/html");
            PrintWriter pw = res.getWriter();
            String q = "select * from product";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            pw.println("<table border = 1>");
            pw.println("<th> ProductCode <th> ProductName <th> Price");
            while(rs.next())
            {
                pw.println("<tr> <td>" + rs.getInt(1));
                pw.println("<td>" + rs.getString(2));
                pw.println("<td>" + rs.getInt(3));
            }
            pw.println("</table>");
            pw.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
