import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Model {
	
	private String name;
	private String email;
	private String upassword;
	private String city;
	private Connection connect = null;
	private PreparedStatement pstmnt = null;
	private int row;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUpassword() {
		return upassword;
	}


	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
    public int register() {
    try
    {
    	connect = JdbcUtilityClass.getDBConnection();
    	String sql = "insert into users(name,email,upassword,city) values(?,?,?,?)";
        pstmnt = connect.prepareStatement(sql);
        
    	pstmnt.setString(1, name);
    	pstmnt.setString(2, email);
    	pstmnt.setString(3, upassword);
    	pstmnt.setString(4, city);
    	
    	 row = pstmnt.executeUpdate();
    	 }
         catch(Exception e)
         {
    	    e.printStackTrace();
          }
         finally
         {
        	try {
        		JdbcUtilityClass.closeResources(connect, pstmnt, null);
        	}
        	catch(SQLException e)
        	{
        		e.printStackTrace();
        	 }	
         }
    	 return row;
    }
    
    }

   