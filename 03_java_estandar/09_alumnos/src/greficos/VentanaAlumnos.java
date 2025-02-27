package greficos;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import adapters.ListaAlumnosAdapter;
import model.Alumno;
import service.AlumnosService;

public class VentanaAlumnos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setBounds(100, 100, 223, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlblTitulo = new JLabel("Seleccione curso:");
		jlblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jlblTitulo.setBounds(23, 22, 221, 45);
		contentPane.add(jlblTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 78, 153, 211);
		contentPane.add(scrollPane);
		
		JList<String> jlstCursos = new JList<>();
		scrollPane.setViewportView(jlstCursos);
		
		JButton jbtnTotal = new JButton("Total alumnos");
		jbtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				List<Alumno> alumnosCurso;
				var service = new AlumnosService();
				alumnosCurso=service.totalAlumnosCurso(jlstCursos.getSelectedValue());
				
				JOptionPane.showMessageDialog(VentanaAlumnos.this, "Total de alumnos: "+alumnosCurso.size());
			}
		});
		jbtnTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jbtnTotal.setBounds(23, 309, 153, 51);
		contentPane.add(jbtnTotal);
		
		// Asignar el adaptador a la lista
				
		jlstCursos.setModel(new ListaAlumnosAdapter());
				
		
	}

}
