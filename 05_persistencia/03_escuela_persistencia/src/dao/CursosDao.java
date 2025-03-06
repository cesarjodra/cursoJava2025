package dao;

import static dao.DatosBd.getConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import model.Curso;

public class CursosDao {
	public double averagePrecio() {
		
	}
	
	public void save(Curso curso) {
		
	}
	public Curso findByIdCurso(int codigo) {
		//buscar curso por su código
		try(Connection con=getConnection()){
			String sql="select * from cursos where idCurso=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return new Curso(
						rs.getInt("idCurso"),
						rs.getString("denominacion"),
						rs.getInt("duracion"),
						rs.getDouble("precio"),
						rs.getDate("fechaInicio").toLocalDate()
						);
			}
			return null;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public Curso findByDenominacionAndFechaInicio(String denominacion, LocalDate fechaInicio) {
		try(Connection con=getConnection()){
			String sql="select * from cursos where denominacion=? and fechaInicio=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,denominacion);
			ps.setDate(2,Date.valueOf(fechaInicio));
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return new Curso(
						rs.getInt("idCurso"),
						rs.getString("denominacion"),
						rs.getInt("duracion"),
						rs.getDouble("precio"),
						rs.getDate("fechaInicio").toLocalDate()
						);
			}
			return null;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	public void delete(int idCurso) {
		try(Connection con=getConnection()){
			String sql="delete from cursos where idCurso=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, idCurso);
			st.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();	
		}
	}
	

}
