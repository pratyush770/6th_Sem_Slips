import java.sql.*;
import java.io.*;
import javax.servlet.*;
public class Slip8B extends GenericServlet
{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/mydatabase";
            String user = "root";
            String pwd = "matsumoto";
            Connection con = DriverManager.getConnection(url,user,pwd);
            res.setContentType("text/html");
            PrintWriter pw = res.getWriter();
            String username = req.getParameter("t1");
            String password = req.getParameter("t2");
            String q = "select * from login_table where uname=?";
            PreparedStatement pst = con.prepareStatement(q);
            pst.setString(1,username);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                if(rs.getString(2).equals(password))
                {
                    pw.println("Valid details");
                }
                else
                {
                    pw.println("Invalid details");
                }
            }
            pw.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
