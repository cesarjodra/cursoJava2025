package locator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocatorConnection {
	static String cadena="jdbc:mysql://localhost:3306/spain";
	static String user="root";
	static String pwd="root";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(cadena,user,pwd);
	}
}
