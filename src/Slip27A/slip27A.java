import java.sql.*;
public class slip27A
{
	public static void main(String [] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String database = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "matsumoto";
		Connection con = DriverManager.getConnection(database,username,password);
		String q = "delete from emp where eid = ?";
		PreparedStatement pst = con.prepareStatement(q);
		int eid =Integer.parseInt(args[0]);
		pst.setInt(1,eid);
		pst.executeUpdate();
	}
}