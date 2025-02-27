package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import adapters.ListaContinentesAdapter;
import adapters.TablaPaisesAdapter;

public class VentanaPaises extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

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
	}
}
