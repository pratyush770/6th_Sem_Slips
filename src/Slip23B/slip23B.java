//package Slip23B;
import java.sql.*;
public class slip23B
{
    public static void main(String[] args)  throws Exception
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String uname = "root";
            String pwd = "matsumoto";
            Connection con = DriverManager.getConnection(url,uname,pwd);
            PreparedStatement pst;
            String q;
            ResultSet rs;
            String s = args[0];
            char ch = s.charAt(0);
            switch(ch)
            {
                case 'R':
                case 'r': // case insensitive
                    q = "select * from elements";
                    pst = con.prepareStatement(q);
                    rs = pst.executeQuery();
                    while(rs.next())
                    {
                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
                    }
                    break;
                case 'U':
                case 'u':
                    q = "update elements set symbol = ? where ename = ?";
                    pst = con.prepareStatement(q);
                    String c1 = args[1];
                    String c2 = args[2];
                    pst.setString(1,c1);
                    pst.setString(2,c2);
                    pst.executeUpdate();
                    break;
                case 'D':
                case 'd':
                    q = "delete from elements where ename = ?";
                    pst = con.prepareStatement(q);
                    String c3 = args[1];
                    pst.setString(1,c3);
                    pst.executeUpdate();
                    break;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
