import java.sql.*;
import javax.swing.*;
public class sqlconnection {
Connection conn=null;
public static Connection dbConnector(){
	try {
		 String url = "jdbc:mysql://localhost:3306/";
		    String dbName = "restaurant";        //Enter your database
		    String driver = "com.mysql.cj.jdbc.Driver";
		    String userName = "root";
		    String password = "shivam";
		    Class.forName(driver);
		Connection conn = DriverManager.getConnection(url+dbName,userName,password);
		//JOptionPane.showMessageDialog(null,"Connection Successful");
		return conn;
	}
	catch(Exception e) {
		JOptionPane.showMessageDialog(null,e);
		return null;
	}
}
}
