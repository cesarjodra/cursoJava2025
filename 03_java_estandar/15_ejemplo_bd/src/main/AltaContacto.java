package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AltaContacto {

	public static void main(String[] args) {
		String cadena="jdbc:mysql://localhost:3306/agenda";
		String user="root";
		String pwd="root";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del contacto:");
		String nombre = scan.nextLine(); 
		
		System.out.println("Introduce el email del contacto:");
		String email = scan.nextLine();
		
		System.out.println("Introduce la edad del contacto:");
		int edad = Integer.parseInt(scan.nextLine());
		
		// Creamos la conexión
		try(Connection con = DriverManager.getConnection(cadena,user,pwd);){
				
		// Creamos la query
		String query = "INSERT INTO contactos(nombre,email,edad)"
							+ "VALUES('"+nombre+"','"+email+"',"+edad+")";
		
		// Creamos el objeto Statement para ejecutar la consulta
		Statement st=con.createStatement();
		st.execute(query);
		System.out.println("Contacto añadido !");
		
		//con.close(); No hace falta cerrarla porque usamos un "try con recursos"
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}

}
