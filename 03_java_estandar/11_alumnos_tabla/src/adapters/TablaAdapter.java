package adapters;

import java.time.LocalDate;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Alumno;
import service.AlumnosService;

public class TablaAdapter extends AbstractTableModel {
	private List<Alumno> alumnos;
	
	public TablaAdapter(String curso) {		
		var service = new AlumnosService();		
		alumnos=service.totalAlumnosCurso(curso);
	}

	@Override
	public int getRowCount() {
		return alumnos.size();
	}

	@Override
	public int getColumnCount() {
		return 4;
		// return Alumno.class.getDeclaredFields().length; // Obtenemos los campos dinámicamente
	}

	@Override
	public String getColumnName(int column) {
		return switch(column) {
			case 0->"Nombre Alumno";
			case 1->"Curso";
			case 2->"Nota";
			case 3->"Fecha Alta";
			default->"";
		};
	}

	@Override
	public Object getValueAt(int row, int column) {
		Alumno alumno=alumnos.get(row);
		return switch(column) {
			case 0->alumno.getNombre();
			case 1->alumno.getCurso();
			case 2->alumno.getNota();
			case 3->alumno.getFechaIngreso();
			default->"";
		};	
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {		
		return switch(columnIndex) {
			case 0->String.class;
			case 1->String.class;
			case 2->Double.class;
			case 3->LocalDate.class;
			default->String.class;
		};
	}	
}
