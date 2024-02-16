//package Slip6A;
import java.sql.*;
import java.util.*;
public class slip6A
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3307/mydatabase";
        String uname = "root";
        String pwd = "matsumoto";
        Connection con = DriverManager.getConnection(url,uname,pwd);
        String q = "insert into customer values(?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(q);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the customer name : ");
        String name = sc.nextLine();
        System.out.print("Enter the address : ");
        String add = sc.nextLine();
        System.out.print("Enter the phone number : ");
        String pno = sc.nextLine();
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setString(3,add);
        pst.setString(4,pno);
        pst.executeUpdate();
    }
}
