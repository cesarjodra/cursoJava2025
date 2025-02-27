package adapters;

import java.util.List;

import javax.swing.DefaultListModel;

import service.AlumnosService;

public class ListaAlumnosAdapter extends DefaultListModel<String> {	
	List<String> listaCursos;

	public ListaAlumnosAdapter() {
		var service = new AlumnosService();
		listaCursos=service.cursos();
	}

	@Override
	public int getSize() {
		return listaCursos.size();
	}

	@Override
	public String getElementAt(int index) {
		return listaCursos.get(index);
	}
}
