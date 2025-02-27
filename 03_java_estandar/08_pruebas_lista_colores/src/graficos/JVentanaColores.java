package graficos;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import adapters.ListaColoresAdapter;
import model.JColor;

public class JVentanaColores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVentanaColores frame = new JVentanaColores();
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
	public JVentanaColores() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 595, 497);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Jlbl = new JLabel("SELECCIONE COLOR:");
		Jlbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Jlbl.setBounds(72, 82, 173, 31);
		contentPane.add(Jlbl);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(105, 129, 109, 131);
		contentPane.add(scrollPane);
		
		JList<JColor> JlstColores = new JList();
		scrollPane.setViewportView(JlstColores);
		
		// Asignar el adaptador a la lista
		// Si no lo hiceramos en el constructor de la ventana,
			// lo podríamos hacer con un evento de ventana
		
		JlstColores.setModel(new ListaColoresAdapter());
		
		JButton JbtnCambiarColor = new JButton("Cambiar color");
		JbtnCambiarColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JVentanaColores.this.getContentPane().setBackground(JlstColores.getSelectedValue().getColor());				
			}
		});
		JbtnCambiarColor.setBounds(105, 271, 109, 23);
		contentPane.add(JbtnCambiarColor);
	}
}
