// this is not the actual slip and is done without using swing
import java.sql.*;
import java.util.*;
public class slip24Bnoc
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String uname = "root";
        String pass = "matsumoto";
        Connection con = DriverManager.getConnection(url,uname,pass);
        String q = "insert into college values (?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(q);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the college id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the college name : ");
        String cname = sc.nextLine();
        System.out.print("Enter the college address : ");
        String add = sc.nextLine();
        System.out.print("Enter the year : ");
        int yr = sc.nextInt();
        pst.setInt(1,id);
        pst.setString(2,cname);
        pst.setString(3,add);
        pst.setInt(4,yr);
        pst.executeUpdate();
    }
}
