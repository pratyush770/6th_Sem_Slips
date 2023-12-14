//package Slip11A;
import java.sql.*;
public class slip11A
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String uname = "root";
            String pwd = "matsumoto";
            Connection con = DriverManager.getConnection(url,uname,pwd);
            String q = "alter table student1 drop column percentage";
            Statement st = con.createStatement();
            st.executeUpdate(q);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
