package graficos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import adpaters.ListaCursosAdapter;
import service.AlumnosService;

public class JVentanaAlumnos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVentanaAlumnos frame = new JVentanaAlumnos();
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
	public JVentanaAlumnos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione curso:");
		lblNewLabel.setBounds(153, 29, 144, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(113, 54, 142, 31);
		contentPane.add(scrollPane);
		
		JComboBox<String> jcomboCursos = new JComboBox<>();
		scrollPane.setViewportView(jcomboCursos);
		
		JButton jbtnTotalAlumnos = new JButton("Total de alumnos");
		jbtnTotalAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var alumnosService=new AlumnosService();
				int totalAlumnos=alumnosService.alumnosCursos((String)jcomboCursos.getSelectedItem()).size();
				JOptionPane.showMessageDialog(JVentanaAlumnos.this, "El total de alumnos del curso "+jcomboCursos.getSelectedItem()+" es: "+totalAlumnos);
			}
		});
		jbtnTotalAlumnos.setBounds(113, 114, 159, 23);
		contentPane.add(jbtnTotalAlumnos);
		jcomboCursos.setModel(new ListaCursosAdapter());
	}
}
