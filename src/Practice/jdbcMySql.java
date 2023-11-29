import java.sql.*;
public class jdbcMySql
{
	public static void main(String [] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","matsumoto");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from emp");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
		con.close();
	}
}