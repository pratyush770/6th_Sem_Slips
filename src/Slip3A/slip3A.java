import java.sql.*;
public class slip3A
{
    public static void main(String [] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String database = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "matsumoto";
        Connection con = DriverManager.getConnection(database,username,password);
        Statement st = con.createStatement();
        String q = "select * from emp where department = 'Computer Science'";
        ResultSet rs = st.executeQuery(q);
        while(rs.next())
        {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3)
            + " " + rs.getString(4));
        }
    }
}