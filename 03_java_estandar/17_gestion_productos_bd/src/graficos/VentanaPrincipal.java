package graficos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import utilidades.VentanaBorrar;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("APLICACIÓN GESTIÓN PRODUCTOS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTitulo.setBounds(10, 11, 501, 65);
		contentPane.add(lblTitulo);
		
		JButton btnNuevoProducto = new JButton("NUEVO PRODUCTO");
		btnNuevoProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentana(new VentanaAltaProducto());
			}
		});
		btnNuevoProducto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNuevoProducto.setBounds(89, 92, 318, 76);
		contentPane.add(btnNuevoProducto);
		
		JButton btnBuscarProducto = new JButton("BUSCAR PRODUCTO");
		btnBuscarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentana(new VentanaBuscar());
			}
		});
		btnBuscarProducto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuscarProducto.setBounds(89, 177, 318, 76);
		contentPane.add(btnBuscarProducto);
		
		JButton btnProductosPorCategoria = new JButton("PRODUCTOS POR CATEGORÍA");
		btnProductosPorCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentana(new VentanaCategoria());
			}
		});
		btnProductosPorCategoria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnProductosPorCategoria.setBounds(89, 264, 318, 76);
		contentPane.add(btnProductosPorCategoria);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(NORMAL);
			}
		});
		btnSalir.setForeground(new Color(255, 0, 0));
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSalir.setBounds(89, 469, 318, 76);
		contentPane.add(btnSalir);
		
		JButton btnEliminarPorCodigo = new JButton("ELIMINAR POR CÓDIGO");
		btnEliminarPorCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentana(new VentanaBorrar());
			}
		});
		btnEliminarPorCodigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEliminarPorCodigo.setBounds(89, 351, 318, 76);
		contentPane.add(btnEliminarPorCodigo);
	}
	
	// Para llamar a otras ventanas desde los botones
	
	private void mostrarVentana(JFrame frame) {
		frame.setVisible(true);
	}
}
