package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatosBd {
	static String cadena="jdbc:mysql://localhost:3306/comercio";
	static String user="root";
	static String pwd="root";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(cadena,user,pwd);
	}
}
