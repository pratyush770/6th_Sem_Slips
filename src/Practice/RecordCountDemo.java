import java.sql.*;
public class RecordCountDemo
{
	public static void main(String [] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:TYDSN2");
		Statement st = con.createStatement();
		int count = 0;
		ResultSet rs = st.executeQuery("select * from EMP");
		while(rs.next())
		{
			count++;
		}
		System.out.println("The count is : " + count);
		con.commit();
		con.close();
	}

}