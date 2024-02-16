//package Slip29B;
import java.sql.*;
import java.util.*;
public class slip29B
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
            ResultSet rs;
            int ch = 0,rno,percentage;
            int n=0;
            String q,sname;
            Scanner sc;
            PreparedStatement pst;
            do
            {
                System.out.println("1) Insert");
                System.out.println("2) Update");
                System.out.println("3) Delete");
                System.out.println("4) Search");
                System.out.println("5) Display");
                System.out.println("6) Exit");
                System.out.print("Enter your choice : ");
                sc = new Scanner(System.in);
                ch=sc.nextInt();
                switch (ch)
                {
                    case 1:
                        q = "insert into student values(?,?,?)";
                        pst = con.prepareStatement(q);
                        System.out.print("Enter the roll number : ");
                        rno = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the student name : ");
                        sname = sc.nextLine();
//                        sc.nextLine();
                        System.out.print("Enter the percentage  : ");
                        percentage = sc.nextInt();
                        pst.setInt(1,rno);
                        pst.setString(2,sname);
                        pst.setInt(3,percentage);
                        n = pst.executeUpdate();
                        if(n==1)
                        {
                            System.out.println("Record inserted successfully");
                        }
                        else
                        {
                            System.out.println("Record not inserted");
                        }
                        break;
                    case 2 :
                        q = "update student set sname = 'Pratyush' where sname = 'Prayushi'";
                        pst = con.prepareStatement(q);
                        n = pst.executeUpdate(q);
                        if(n==1)
                        {
                            System.out.println("Record updated successfully");
                        }
                        else
                        {
                            System.out.println("Record not updated");
                        }
                        break;
                    case 3:
                        q = "delete from student where rno = ?";
                        pst = con.prepareStatement(q);
                        System.out.print("Enter the roll number you want to delete : ");
                        rno = sc.nextInt();
                        pst.setInt(1,rno);
                        n = pst.executeUpdate();
                        if(n==1)
                        {
                            System.out.println("Record deleted successfully");
                        }
                        else
                        {
                            System.out.println("Record not deleted");
                        }
                        break;
                    case 4 :
                        q = "select * from student where rno = ?";
                        pst = con.prepareStatement(q);
                        System.out.print("Enter the roll number to search : ");
                        rno = sc.nextInt();
                        pst.setInt(1,rno);
                        rs =  pst.executeQuery();
                        while(rs.next())
                        {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                        }
                        break;
                    case 5 :
                        q = "select * from student";
                        pst = con.prepareStatement(q);
                        rs = pst.executeQuery();
                        while(rs.next())
                        {
                            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                        }
                        break;
                    case 6:
                        return;
                }
            }while (ch!=6);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
