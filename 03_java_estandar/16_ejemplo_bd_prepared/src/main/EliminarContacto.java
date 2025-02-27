package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EliminarContacto {

	public static void main(String[] args) {
		// Solicita la introducción de un idContacto y elimina el contacto con dicho id
		
		String cadena="jdbc:mysql://localhost:3306/agenda";
		String user="root";
		String pwd="root";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el ID del contacto que quieres eliminar:");
		int id = scan.nextInt(); 		
		
		// Creamos la conexión
		try(Connection con = DriverManager.getConnection(cadena,user,pwd);){
				
		// Creamos la query
		String query = "DELETE FROM contactos WHERE idContacto = ? ";		
		
		PreparedStatement st=con.prepareStatement(query); 		
		st.setInt(1, id);
		
		st.execute();
		System.out.println("Contacto eliminado !");		
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}		
		
}