package graficos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JVentana extends JFrame {
	public JVentana() {
		
		// Titulo
		super("Ventana controles"); 
		
		// Tamaño y posición
		this.setBounds(100, 100, 800, 500); 
		
		// Configurar el botón de cierre
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		
		// Llamar a un método para que cree los componentes
		initComponents();
		
		// Visualizar la ventana
		this.setVisible(true); 		
	}
	
	public void initComponents() {
		// Eliminar el gestor de la organización
		this.setLayout(null);
		// Crear control
		JButton jbtn1=new JButton("Pulsar aquí");
		// Tamaño y posición del boton
		jbtn1.setBounds(150, 80, 300, 50);			
		// Color
		//jbtn1.setBackground(Color.red);
		// Anadir al contenedor
		this.add(jbtn1);	
		
	}
}
