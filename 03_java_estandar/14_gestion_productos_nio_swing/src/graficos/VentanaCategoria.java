package graficos;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import adapters.ListaCategoriasAdapter;
import adapters.TablaProductosAdapter;
import exceptions.CorruptDataException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class VentanaCategoria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tblListado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCategoria frame = new VentanaCategoria();
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
	public VentanaCategoria() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 767, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("LISTAR PRODUCTOS POR CATEGORÍA");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTitulo.setBounds(46, 27, 396, 45);
		contentPane.add(lblTitulo);
		
		JLabel lblCategoria = new JLabel("CATEGORÍA");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCategoria.setBounds(78, 95, 143, 22);
		contentPane.add(lblCategoria);
		
		JComboBox cmbCategorias = new JComboBox();
		cmbCategorias.setBounds(212, 98, 154, 22);
		contentPane.add(cmbCategorias);
		
		try {
			cmbCategorias.setModel(new ListaCategoriasAdapter());
		} catch (CorruptDataException e) {
			JOptionPane.showMessageDialog(VentanaCategoria.this, "Error en el almacenamiento de datos");
		}
		
		JButton btnCerrar = new JButton("SALIR");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCategoria.this.dispose();
			}
		});
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCerrar.setBounds(238, 439, 224, 54);
		contentPane.add(btnCerrar);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tblListado.setModel(new TablaProductosAdapter(cmbCategorias.getSelectedItem().toString()));
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBuscar.setBounds(392, 95, 143, 25);
		contentPane.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(81, 156, 611, 263);
		contentPane.add(scrollPane);
		
		tblListado = new JTable();
		scrollPane.setViewportView(tblListado);
		
		
		
		
	}
}
