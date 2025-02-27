package adapters;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Pais;
import service.PaisesServiceImpl;

public class TablaPaisesAdapter extends AbstractTableModel {
	private List<Pais> paises;
	
	public TablaPaisesAdapter(String continente) {		
		var paisesService = new PaisesServiceImpl();
		paises = paisesService.paisesPorContinente(continente);
	}

	@Override
	public int getRowCount() {
		return paises.size();
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public String getColumnName(int column) {
		return switch(column) {
			case 0->"Nombre";
			case 1->"Continente";
			case 2->"Capital";
			case 3->"Población";
			default->"";
		};
	}

	@Override
	public Object getValueAt(int row, int column) {
		Pais pais=paises.get(row);
		return switch(column) {
			case 0->pais.getName();
			case 1->pais.getRegion();
			case 2->pais.getCapital();
			case 3->pais.getPopulation();
			default->"";
		};	
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {		
		return switch(columnIndex) {
			case 0->String.class;
			case 1->String.class;
			case 2->String.class;
			case 3->Long.class;
			default->String.class;
		};
	}	
}
