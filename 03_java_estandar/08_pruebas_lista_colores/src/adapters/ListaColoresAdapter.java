package adapters;

import java.awt.Color;
import java.util.List;

import javax.swing.DefaultListModel;

import model.JColor;

public class ListaColoresAdapter extends DefaultListModel<JColor> {
	List<JColor> colores=List.of(
			new JColor("Amarillo", Color.YELLOW),
			new JColor("Verde", Color.GREEN),
			new JColor("Azul", Color.BLUE),
			new JColor("Rojo", Color.RED),
			new JColor("Negro", Color.BLACK),
			new JColor("Naranja", Color.ORANGE)
			);

	@Override
	public int getSize() {
		return colores.size();
	}

	@Override
	public JColor getElementAt(int index) {
		return colores.get(index);
	}

	
}
