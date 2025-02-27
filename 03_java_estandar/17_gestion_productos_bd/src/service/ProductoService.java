package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import exceptions.CorruptDataException;
import model.Producto;

public class ProductoService {
	
	String cadena="jdbc:mysql://localhost:3306/almacen";
	String user="root";
	String pwd="root";
	
	public void guardar(Producto producto) {
		
		// Creamos la conexión
			try(Connection con = DriverManager.getConnection(cadena,user,pwd);){
						
		// Creamos la query
			String query = "INSERT INTO productos(codigo,nombre,precio,categoria) "
					+ "VALUES(?,?,?,?)";
				
		// Creamos el objeto Statement para ejecutar la consulta
			PreparedStatement st=con.prepareStatement(query); 
					
			st.setString(1, producto.getCodigo());
			st.setString(2, producto.getNombre());
			st.setDouble(3, producto.getPrecio());
			st.setString(4, producto.getCategoria());				
			st.execute(); 	
				
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
			
	}
	
	public Producto buscar(String codigo) {	
		return null;		
	}
	
	public void eliminar(String codigo) {		
		// Creamos la conexión
		try(Connection con = DriverManager.getConnection(cadena,user,pwd);){
				
		// Creamos la query
		String query = "DELETE FROM productos WHERE codigo = ? ";		
		
		PreparedStatement st=con.prepareStatement(query); 		
		st.setString(1, codigo);		
		st.execute();	
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}					
	}
	
	public List<Producto> buscarPorCategoria(String categoria){
			return null;
	}
	
	public List<String> categorias() throws CorruptDataException{ //Para poder lanzar esa excepcion
			return null;
	}
		
}

