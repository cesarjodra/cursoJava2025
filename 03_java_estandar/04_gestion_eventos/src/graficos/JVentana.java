package graficos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JVentana extends JFrame {
	public JVentana() {
		
		// Titulo
		super("Gestión de eventos"); 
		
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
		// Crear controles
		JButton jbtn1=new JButton("Pulsar aquí");
		JLabel jlbl1=new JLabel("------------");
		JButton jbtn2=new JButton("Cambiar Color");
		JButton jbtn3=new JButton("Cerrar sesión");
		// Tamaño y posición
		jbtn1.setBounds(150, 80, 300, 50);	
		jlbl1.setBounds(600, 80, 200, 50);
		jbtn2.setBounds(150, 150, 300, 50);
		jbtn3.setBounds(150, 220, 300, 50);
		// Anadir al contenedor
		this.add(jbtn1);	
		this.add(jlbl1);
		this.add(jbtn2);
		this.add(jbtn3);
		
		//Gestión del evento
		jbtn1.addActionListener(e->jlbl1.setText("Cambiado"));
		jbtn2.addActionListener(e->this.getContentPane().setBackground(Color.yellow));
		
		//jbtn3.addActionListener(e->this.dispose()); //Método para cerrar la ventana
		
		// Añadiendo un confirm para validar el cierre de la ventana
		jbtn3.addActionListener(e->{
			int result = JOptionPane.showConfirmDialog(
					JVentana.this, "Está seguro que quiere cerrar?", "Salir", JOptionPane.YES_NO_OPTION);
			
			if(result == JOptionPane.YES_OPTION) {
				this.dispose();
			}				
			});
		
	}
}
