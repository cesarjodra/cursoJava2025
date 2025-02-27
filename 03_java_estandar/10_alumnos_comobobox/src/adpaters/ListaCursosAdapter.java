package adpaters;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import service.AlumnosService;

public class ListaCursosAdapter extends DefaultComboBoxModel<String> {
	List<String> cursos;
	public ListaCursosAdapter() {
		var service=new AlumnosService();
		cursos=service.cursos();
	}
	@Override
	public int getSize() {
		return cursos.size();
	}
	@Override
	public String getElementAt(int index) {
		return cursos.get(index);
	}
	
	
}
