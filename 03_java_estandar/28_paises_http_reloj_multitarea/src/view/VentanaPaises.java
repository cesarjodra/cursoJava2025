package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import adapters.ListaContinentesAdapter;
import adapters.TablaPaisesAdapter;

public class VentanaPaises extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblReloj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPaises frame = new VentanaPaises();
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
	public VentanaPaises() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 838, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BÚSQUEDA DE PAÍSES");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(32, 23, 307, 54);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(32, 88, 175, 22);
		contentPane.add(comboBox);
		
		comboBox.setModel(new ListaContinentesAdapter());
		
		JButton btnPais = new JButton("Ver Países");
		btnPais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curso=comboBox.getSelectedItem().toString();
				table.setModel(new TablaPaisesAdapter(curso));
			}
		});
		btnPais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPais.setBounds(227, 88, 112, 23);
		contentPane.add(btnPais);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 143, 768, 312);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		lblReloj = new JLabel("00:00:00");
		lblReloj.setHorizontalAlignment(SwingConstants.CENTER);
		lblReloj.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblReloj.setBounds(619, 17, 181, 60);
		contentPane.add(lblReloj);
		
		// lanzar la tarea del reloj
		
		new Thread(this).start();
	}

	@Override
	public void run() {
		DateTimeFormatter formater=DateTimeFormatter.ofPattern("HH:mm:ss");
		while(true) {
			LocalTime lt = LocalTime.now();			
			lblReloj.setText(lt.format(formater));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
