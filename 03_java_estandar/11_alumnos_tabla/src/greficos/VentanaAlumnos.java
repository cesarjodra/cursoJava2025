package greficos;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import adapters.ListaAlumnosAdapter;
import adapters.TablaAdapter;
import model.Alumno;
import service.AlumnosService;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class VentanaAlumnos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable jtableAlumnos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAlumnos frame = new VentanaAlumnos();
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
	public VentanaAlumnos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 824, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlblTitulo = new JLabel("Seleccione curso:");
		jlblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jlblTitulo.setBounds(23, 22, 221, 45);
		contentPane.add(jlblTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 78, 180, 31);
		contentPane.add(scrollPane);
		
		JComboBox<String> jcomboCursos = new JComboBox<>();
		scrollPane.setViewportView(jcomboCursos);
		
		JButton jbtnMostrar = new JButton("Mostrar alumnos");
		jbtnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				String curso=jcomboCursos.getSelectedItem().toString();
				jtableAlumnos.setModel(new TablaAdapter(curso));
				
			}
		});
		jbtnMostrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jbtnMostrar.setBounds(23, 158, 179, 51);
		contentPane.add(jbtnMostrar);
		jcomboCursos.setModel(new ListaAlumnosAdapter());
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(254, 37, 519, 357);
		contentPane.add(scrollPane_1);
		
		jtableAlumnos = new JTable();
		jtableAlumnos.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane_1.setViewportView(jtableAlumnos);
		
	}
}
