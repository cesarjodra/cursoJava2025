package dao;

import static dao.DatosBd.getConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import model.Pedido;

public class PedidosDaoImpl implements PedidosDao{

	@Override
	public void save(Pedido pedido) {
		try(Connection con=getConnection()){
			String sql="insert into pedidos(producto,tienda,precio,fechaPedido) values(?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, pedido.getProducto());
			st.setString(2, pedido.getTienda());
			st.setDouble(3, pedido.getPrecio());			
			//convertimos de LocalDate a java.sql.Date para poder grabarlo en la BD
			st.setDate(4, Date.valueOf(pedido.getFechaPedido()));
			st.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public Pedido findByProductoAndTiendaAndFechaPedido(String producto, String tienda, LocalDate fechaPedido) {
		try(Connection con=getConnection()){
			String sql="select * from pedidos where producto=? and tienda=? and fechaPedido=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,producto);
			ps.setString(2,tienda);
			ps.setDate(3,Date.valueOf(fechaPedido));
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return new Pedido(
						rs.getInt("idPedido"),
						rs.getString("producto"),
						rs.getString("tienda"),
						rs.getDouble("precio"),
						rs.getDate("fechaPedido").toLocalDate()
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
