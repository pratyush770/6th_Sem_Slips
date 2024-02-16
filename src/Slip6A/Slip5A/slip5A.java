//package Slip5A;
import java.sql.*;
public class slip5A
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/mydatabase";
            String uname = "root";
            String pwd = "matsumoto";
            Connection con = DriverManager.getConnection(url,uname,pwd);
            Statement st = con.createStatement();
            String q= "create table teacher(tid INT PRIMARY KEY,tname VARCHAR(45), tsal INT, tdes VARCHAR(45))";
            st.executeUpdate(q);
            q = "insert into teacher values(1,'Pratyush',80000,'HOD')";
            st.executeUpdate(q);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
