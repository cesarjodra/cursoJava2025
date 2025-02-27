package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarContactos {

	public static void main(String[] args) {
		// Mostrar los nombres de todos los contactos
		
		String cadena="jdbc:mysql://localhost:3306/agenda";
		String user="root";
		String pwd="root";
		
		// Creamos la conexión
		try(Connection con = DriverManager.getConnection(cadena,user,pwd);){
				
		// Creamos la query
		String query = "SELECT nombre FROM contactos";
		
		// Creamos el objeto Statement para ejecutar la consulta
		Statement st=con.createStatement(); 
		
		// Llamamos a la ejecución, que devuelve un ResultSet
		
		ResultSet rs = st.executeQuery(query);
		
		// Bucleamos
		
		while(rs.next()) {
			System.out.println(rs.getString("nombre")); 
		}
	
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
