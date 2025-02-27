package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import locator.LocatorConnection;
import model.Municipio;

public class MunicipiosDaoImp implements MunicipiosDao {

	@Override
	public void save(Municipio municipio) {
		try(Connection con=LocatorConnection.getConnection()){
			String sql="insert into municipios(cod_municipio, nombre, poblacion, superficie, altitud, cod_provincia) values(?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, municipio.getCodigoMunicipio());
			st.setString(2, municipio.getNombreMunicipio());
			st.setInt(3, municipio.getPoblacionMunicipio());
			st.setInt(4, municipio.getAltitudMunicipio());
			st.setDouble(5, municipio.getSuperficieMunicipio());
			st.setString(6, municipio.getCodigoProvincia());				
			st.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public Municipio findByCodigo(String codigo) {
		//buscar provincia por su código, para evitar duplicados
				try(Connection con=LocatorConnection.getConnection()){
					String sql="select * from municipios where cod_municipio=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1, codigo);
					ResultSet rs=ps.executeQuery();
					if(rs.next()) {
						return new Municipio(
								rs.getString("codigo_municipio"),
								rs.getString("nombre"),
								rs.getInt("poblacion"),
								rs.getDouble("superficie"),
								rs.getInt("altitud"),
								rs.getString("cod_provincia")
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
	public void saveAll(List<Municipio> municipios) {
		try(Connection con=LocatorConnection.getConnection()){
			String sql="insert into municipios(cod_municipio, nombre, poblacion, superficie, altitud, cod_provincia) values(?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			for(var municipio:municipios) {
				st.setString(1, municipio.getCodigoMunicipio());
				st.setString(2, municipio.getNombreMunicipio());
				st.setInt(3, municipio.getPoblacionMunicipio());
				st.setInt(4, municipio.getAltitudMunicipio());
				st.setDouble(5, municipio.getSuperficieMunicipio());
				st.setString(6, municipio.getCodigoProvincia());				
				st.execute();
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
