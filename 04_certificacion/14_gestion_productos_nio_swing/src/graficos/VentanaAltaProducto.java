package graficos;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.Producto;
import service.ProductoService;

public class VentanaAltaProducto extends JFrame {	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfCodigo;
	private JTextField tfPrecio;
	private JTextField tfCategoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAltaProducto frame = new VentanaAltaProducto();
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
	public VentanaAltaProducto() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 549, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloAlta = new JLabel("ALTA DE PRODUCTOS");
		lblTituloAlta.setBounds(148, 33, 234, 29);
		lblTituloAlta.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloAlta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblTituloAlta);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(36, 130, 105, 20);
		contentPane.add(lblNombre);
		
		JLabel lblCodigo = new JLabel("CÓDIGO:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCodigo.setBounds(36, 197, 105, 20);
		contentPane.add(lblCodigo);
		
		JLabel lblPrecio = new JLabel("PRECIO:");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecio.setBounds(36, 267, 105, 20);
		contentPane.add(lblPrecio);
		
		JLabel lblCategoria = new JLabel("CATEGORÍA:");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCategoria.setBounds(36, 333, 105, 20);
		contentPane.add(lblCategoria);
		
		tfNombre = new JTextField();
		tfNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfNombre.setBounds(191, 125, 299, 34);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfCodigo = new JTextField();
		tfCodigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfCodigo.setColumns(10);
		tfCodigo.setBounds(191, 190, 299, 34);
		contentPane.add(tfCodigo);
		
		tfPrecio = new JTextField();
		tfPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfPrecio.setColumns(10);
		tfPrecio.setBounds(191, 260, 299, 34);
		contentPane.add(tfPrecio);
		
		tfCategoria = new JTextField();
		tfCategoria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfCategoria.setColumns(10);
		tfCategoria.setBounds(191, 326, 299, 34);
		contentPane.add(tfCategoria);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var productoService = new ProductoService();
				if(productoService.buscar(tfCodigo.getText())==null) {
					Producto producto = new Producto(tfNombre.getText(),
							tfCodigo.getText(),
							Double.parseDouble(tfPrecio.getText()),
							tfCategoria.getText());
					
					ProductoService productosService = new ProductoService();				
					productosService.guardar(producto);	
					
					tfNombre.setText("");
					tfCodigo.setText("");
					tfPrecio.setText("");
					tfCategoria.setText("");
				}
				else {
					JOptionPane.showMessageDialog(VentanaAltaProducto.this, "Ese código ya existe!!");
				}
				
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnGuardar.setBounds(47, 433, 194, 46);
		contentPane.add(btnGuardar);
		
		JButton btnCerrar = new JButton("CERRAR");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				VentanaAltaProducto.this.dispose();
			}
		});
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCerrar.setBounds(282, 433, 194, 46);
		contentPane.add(btnCerrar);
	}
}
