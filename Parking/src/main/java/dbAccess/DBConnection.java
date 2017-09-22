package dbAccess;
import java.sql.*;
public class DBConnection {
private Connection myConn;



public DBConnection() throws Exception {
	String dbUrl ="jdbc:mysql://localhost:3306/parking";
	String user = "root";
	String password = "";
	System.out.println("Weclome databse");
	//Class.forName("com.mysql.jdbc.Driver");
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		
	}
	myConn = DriverManager.getConnection(dbUrl, user, password);
	System.out.println("initiating database");
	myConn.createStatement();
	}

public boolean searchUser (String username, String passwrd) throws SQLException {
	PreparedStatement myStmt = null;
	ResultSet myRS = null;
	try {
		myStmt = myConn.prepareStatement("select * from userlogin where Username=? and Passwrd=? ");
		myStmt.setString(1, username);
		myStmt.setString(2, passwrd);
		myRS = myStmt.executeQuery();
		if(myRS.next()) {
			return true;
		}
		else {
			return false;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		myConn.close();
	}
	return false;
}
public boolean adduser(String username) {
	return true;
} 
}
		