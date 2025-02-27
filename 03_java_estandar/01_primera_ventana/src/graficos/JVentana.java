package graficos;

import java.awt.Color;

import javax.swing.JFrame;

public class JVentana extends JFrame {
	public JVentana() {
		
		// Titulo
		super("Primera Ventana"); // Es un constructor heredado de JFrame. Tiene que ser lo primero
		
		// Tamaño y posición
		this.setBounds(100, 100, 800, 500); // Método heredado de Component (x,y,w,h)
		
		// Configurar el botón de cierre
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Método heredado de Component
		
		// Color de fondo
		//this.getContentPane().setBackground(Color.yellow); // Método heredado de Component
		
		// Visualizar la ventana
		this.setVisible(true); // Método heredado de Component. Tiene que ser lo último
		
		
	}
}
