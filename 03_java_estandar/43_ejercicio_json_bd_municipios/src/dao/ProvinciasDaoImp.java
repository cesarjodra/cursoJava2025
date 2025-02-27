package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import locator.LocatorConnection;
import model.Provincia;

public class ProvinciasDaoImp implements ProvinciasDao {
	@Override
	public void save(Provincia provincia) {
		try(Connection con=LocatorConnection.getConnection()){
			String sql="insert into provincias(cod_provincia, nombre_provincia, capital_provincia) values(?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, provincia.getCodigoProvincia());
			st.setString(2, provincia.getNombreProvincia());
			st.setString(3, provincia.getCapitalProvincia());				
			st.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	@Override
	public Provincia findByCodigo(String codigo) {
		//buscar provincia por su código, para evitar duplicados
		try(Connection con=LocatorConnection.getConnection()){
			String sql="select * from provincias where cod_provincia=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, codigo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return new Provincia(
						rs.getString("cod_provincia"),
						rs.getString("nombre_provincia"),
						rs.getString("capital_provincia")
						);
			}
			return null;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	@Override
	public void saveAll(List<Provincia> provincias) {
		try(Connection con=LocatorConnection.getConnection()){
			String sql="insert into provincias(cod_provincia, nombre_provincia, capital_provincia) values(?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);			
			for(var p:provincias){
				st.setString(1, p.getCodigoProvincia());
				st.setString(2, p.getNombreProvincia());
				st.setString(3, p.getCapitalProvincia());				
				st.execute();
			}				
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}		
	}	
}
