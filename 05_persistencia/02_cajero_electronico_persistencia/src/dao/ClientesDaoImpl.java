package dao;

import java.util.List;

import model.Cliente;

class ClientesDaoImpl implements ClientesDao {

	@Override
	public List<Cliente> findByCuenta(int idCuenta) {
			/*List<Cliente> lista=new ArrayList<Cliente>();
			try(Connection con=LocatorConnection.getConnection()) {
				String sql="select clientes.* from clientes, titulares  where titulares.idCuenta = ? and titulares.idCliente = clientes.dni";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, idCuenta);
				ResultSet rs =ps.executeQuery();
				while(rs.next()) {
					lista.add(new Cliente(rs.getInt("dni"),
							rs.getString("nombre"),
							rs.getString("direccion"),
							rs.getInt("telefono")));
					
				}
				
			}catch (SQLException ex) {
				ex.printStackTrace();
			}
			return lista;	*/
		
		return List.of();
		
	}

}
