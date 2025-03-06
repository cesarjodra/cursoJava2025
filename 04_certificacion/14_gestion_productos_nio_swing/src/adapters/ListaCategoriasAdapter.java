package adapters;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import exceptions.CorruptDataException;
import service.ProductoService;

public class ListaCategoriasAdapter extends DefaultComboBoxModel<String> {
	List<String> categorias;
	public ListaCategoriasAdapter() throws CorruptDataException {
		var productoService = new ProductoService();
		categorias = productoService.categorias();
	}
	
		@Override
		public int getSize() {
			return categorias.size();
		}

		@Override
		public String getElementAt(int index) {
			return categorias.get(index);
		}
	
}
