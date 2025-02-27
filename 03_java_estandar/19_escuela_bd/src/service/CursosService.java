package service;

import static service.DatosBd.getConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Alumno;
import model.Curso;

public class CursosService {
	public double precioMedio() {
		try(Connection con=getConnection()){
			String sql="select avg(precio) from cursos";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getDouble(1);
			}
			return 0;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
	
	public void altaCurso(Curso curso) {
		try(Connection con=getConnection()){
			String sql="insert into cursos(denominacion,duracion,precio,fechaInicio) values(?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, curso.getDenominacion());
			st.setInt(2, curso.getDuracion());
			st.setDouble(3, curso.getPrecio());
			//convertimos de LocalDate a java.sql.Date para 
			//poder grabarlo en la BD
			st.setDate(4, Date.valueOf(curso.getFechaInicio()));
			st.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	public Curso buscarCurso(int codigo) {
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
	

}
