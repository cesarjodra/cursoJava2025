package graficos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtf1;
	private JTextField jtf2;
	private JTextField jtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 669, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jtf0 = new JLabel("CALCULADORA JAVA HECHA CON BUILDER");
		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JButton jbtn2 = new JButton("RESTAR");
		JButton jbtn4 = new JButton("DIVIDIR");
		JButton jbtn1 = new JButton("SUMAR");
		JButton jbtn3 = new JButton("MULTIPLICAR");
		JLabel jlbl1 = new JLabel("NUMERO 1");
		JLabel lblNewLabel_1 = new JLabel("NUMERO 2");
		jtf3 = new JTextField();
		JLabel jlbl3 = new JLabel("RESULTADO: ");
		
		jtf1.setHorizontalAlignment(SwingConstants.RIGHT);
		jtf1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtf1.setBounds(335, 137, 241, 56);
		contentPane.add(jtf1);
		jtf1.setColumns(10);
		
		
		jtf2.setHorizontalAlignment(SwingConstants.RIGHT);
		jtf2.setColumns(10);
		jtf2.setBounds(335, 204, 241, 56);
		contentPane.add(jtf2);		
		
		jbtn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jbtn2.setBounds(335, 271, 241, 56);
		contentPane.add(jbtn2);		
		
		jbtn4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jbtn4.setBounds(335, 338, 241, 56);
		contentPane.add(jbtn4);		
		
		jbtn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jbtn1.setBounds(59, 271, 241, 56);
		contentPane.add(jbtn1);		
		
		jbtn3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jbtn3.setBounds(59, 338, 241, 56);
		contentPane.add(jbtn3);		
		
		jlbl1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jlbl1.setBounds(59, 137, 241, 56);
		contentPane.add(jlbl1);		
		
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(59, 204, 241, 56);
		contentPane.add(lblNewLabel_1);		
		
		jtf3.setEditable(false);
		jtf3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jtf3.setHorizontalAlignment(SwingConstants.CENTER);
		jtf3.setColumns(10);
		jtf3.setBounds(203, 415, 373, 56);
		contentPane.add(jtf3);		
		
		jtf0.setForeground(new Color(255, 0, 128));
		jtf0.setHorizontalAlignment(SwingConstants.CENTER);
		jtf0.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jtf0.setBounds(59, 48, 517, 56);
		contentPane.add(jtf0);
				
		jlbl3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jlbl3.setBounds(59, 415, 134, 56);
		contentPane.add(jlbl3);
		
		// EVENTOS DE CALCULADORA
		
		jbtn1.addActionListener(e->{
			jtf3.setText(" SUMA: "+ (Double.parseDouble(jtf1.getText()) + Double.parseDouble(jtf2.getText())) );
			});
		
		jbtn2.addActionListener(e->{
			jtf3.setText(" RESTA: "+ (Double.parseDouble(jtf1.getText()) - Double.parseDouble(jtf2.getText())) );
			});
		
		jbtn3.addActionListener(e->{
			jtf3.setText(" MULTIPLICACIÓN: "+ (Double.parseDouble(jtf1.getText()) * Double.parseDouble(jtf2.getText())) );
			});
		
		jbtn4.addActionListener(e->{
			jtf3.setText(" DIVISIÓN: "+ (Double.parseDouble(jtf1.getText()) / Double.parseDouble(jtf2.getText())) );
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
					JOptionPane.showMessageDialog(Calculadora.this, "Debes escribir un número.");
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
