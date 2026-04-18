
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class JdbcUtilityClass {
	
	 static
	 {
		 try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver loaded successfully");
		 }
		 catch(ClassNotFoundException e)
		 {
			 System.out.println("Driver loading failed");
			 e.printStackTrace();
		 }
	 }
	 public static Connection getDBConnection() throws SQLException
	 {
		 String url = "jdbc:mysql://localhost:3306/registrationapp";
		 String username = "root";
		 String password = "methodmystic@9906";
		 Connection connect = DriverManager.getConnection(url, username, password);
		 System.out.println("Connection established successfully");
		 return connect;
	 }

	 public static void closeResources(Connection con, PreparedStatement ps, ResultSet rs) throws SQLException {
	     if (rs != null) rs.close();
	     if (ps != null) ps.close();
	     if (con != null) con.close();
	 }
}
	