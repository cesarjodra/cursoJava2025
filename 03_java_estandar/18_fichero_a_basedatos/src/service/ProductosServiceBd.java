package service;

import static service.DatosBd.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.Producto;

public class ProductosServiceBd {
	
	public void guardarProducto(Producto producto) {
		try(Connection con=getConnection()){
			String sql="insert into productos(codigo,nombre,precio,categoria) values(?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, producto.getCodigo());
			st.setString(2, producto.getNombre());
			st.setDouble(3, producto.getPrecio());
			st.setString(4, producto.getCategoria());
			st.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	public Producto buscarProductoCodigo(String codigo) {		
		try(Connection con=getConnection()){
			String sql="select * from productos where codigo=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, codigo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return new Producto(
						rs.getString("nombre"),
						rs.getString("codigo"),
						rs.getDouble("precio"),
						rs.getString("categoria")
						);
			}
			return null;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
			
	}
	
}
