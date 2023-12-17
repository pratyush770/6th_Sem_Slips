//package Slip15A;
import java.sql.*;
import java.util.*;
public class slip15A
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String uname = "root";
        String pwd = "matsumoto";
        Connection con = DriverManager.getConnection(url,uname,pwd);
        String q = "update customer set address = ? where cname = ?";
        PreparedStatement pst = con.prepareStatement(q);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer name : ");
        String name = sc.nextLine();
        System.out.print("Enter the address you want to update : ");
        String add = sc.nextLine();
        pst.setString(2,name);
        pst.setString(1,add);
        pst.executeUpdate();
        q = "select * from customer";
        ResultSet rs = pst.executeQuery(q);
        while(rs.next())
        {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)
                    + " " + rs.getString(4));
        }
    }
}
