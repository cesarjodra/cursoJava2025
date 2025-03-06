package adapters;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Producto;
import service.ProductoService;

public class TablaProductosAdapter extends AbstractTableModel {
	private List<Producto> productos;
	
	public TablaProductosAdapter(String categoria) {		
		var productoService = new ProductoService();
		productos = productoService.buscarPorCategoria(categoria);
	}

	@Override
	public int getRowCount() {
		return productos.size();
	}

	@Override
	public int getColumnCount() {
		return 4;
		// return Alumno.class.getDeclaredFields().length; // Obtenemos los campos dinámicamente
	}

	@Override
	public String getColumnName(int column) {
		return switch(column) {
			case 0->"Nombre";
			case 1->"Código";
			case 2->"Precio";
			case 3->"Categoría";
			default->"";
		};
	}

	@Override
	public Object getValueAt(int row, int column) {
		Producto producto=productos.get(row);
		return switch(column) {
			case 0->producto.getNombre();
			case 1->producto.getCodigo();
			case 2->producto.getPrecio();
			case 3->producto.getCategoria();
			default->"";
		};	
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {		
		return switch(columnIndex) {
			case 0->String.class;
			case 1->String.class;
			case 2->Double.class;
			case 3->String.class;
			default->String.class;
		};
	}	
}
