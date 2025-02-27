package graficos;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JCalculadoraGraficos extends JFrame {
	public JCalculadoraGraficos() {
		
		// Titulo
		super("Calculadora JAVA"); 
		
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
		JLabel jlbl1=new JLabel("NÚMERO 1:");
		JTextField jtf1=new JTextField();
		JLabel jlbl2=new JLabel("NÚMERO 2:");
		JTextField jtf2=new JTextField();
		JButton jbtn1=new JButton("Sumar");
		JButton jbtn2=new JButton("Restar");
		JButton jbtn3=new JButton("Multiplicar");
		JButton jbtn4=new JButton("Dividir");
		JLabel jlbl3=new JLabel(" RESULTADO:");
				
		// Tamaño y posición del boton
		jlbl1.setBounds(125, 10, 250, 50);
		jtf1.setBounds(425, 10, 250, 50);
		jlbl2.setBounds(125, 70, 250, 50);
		jtf2.setBounds(425, 70, 250, 50);
		jbtn1.setBounds(125, 130, 250, 50);
		jbtn2.setBounds(425, 130, 250, 50);
		jbtn3.setBounds(125, 190, 250, 50);
		jbtn4.setBounds(425, 190, 250, 50);
		jlbl3.setBounds(125, 250, 550, 50);
		
		// Color
		jlbl3.setOpaque(true); // Es necesario hacer opaco un label para cambiar el color
		jlbl3.setBackground(Color.yellow);
		
		// Anadir al contenedor
		this.add(jlbl1);
		this.add(jtf1);
		this.add(jlbl2);
		this.add(jtf2);
		this.add(jbtn1);
		this.add(jbtn2);
		this.add(jbtn3);
		this.add(jbtn4);
		this.add(jlbl3);
		
		// Evento
		
		jbtn1.addActionListener(e->{
			jlbl3.setText(" RESULTADO: "+ (Double.parseDouble(jtf1.getText()) + Double.parseDouble(jtf2.getText())) );
			});
		
		jbtn2.addActionListener(e->{
			jlbl3.setText(" RESULTADO: "+ (Double.parseDouble(jtf1.getText()) - Double.parseDouble(jtf2.getText())) );
			});
		
		jbtn3.addActionListener(e->{
			jlbl3.setText(" RESULTADO: "+ (Double.parseDouble(jtf1.getText()) * Double.parseDouble(jtf2.getText())) );
			});
		
		jbtn4.addActionListener(e->{
			jlbl3.setText(" RESULTADO: "+ (Double.parseDouble(jtf1.getText()) / Double.parseDouble(jtf2.getText())) );
			});
		
		// Pérdida de foco para ver si es texto (mediante clase anónima !!!)
		// Lo hacemos sin usar lambdas porque no es una interfaz funcional (tiene +1 método)
		
		FocusListener listener1 = new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				
				// Obtenemos la fuente del evento (el campo)
				JTextField jtf = (JTextField)e.getSource();
				
				// Comprobar si la caja esta vacía, en cuyo caso no hacemos nada
				
				if(jtf.getText().isEmpty()) {
					return; // Abandonamos el método y no sigue (no hace el T&C)
				}
				
				try {
					Double.parseDouble(jtf.getText());
				}
				catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(JCalculadoraGraficos.this, "Debes escribir un número.");
					//Impedir que se vaya
					jtf.requestFocus(); // Vuelve el foco
					jtf.selectAll(); // Deja el texto seleccionado
				}
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		jtf1.addFocusListener(listener1);
		jtf2.addFocusListener(listener1);
		
	}
}
