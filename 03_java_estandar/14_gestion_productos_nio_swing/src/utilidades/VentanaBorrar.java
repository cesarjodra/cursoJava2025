package utilidades;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import graficos.VentanaCategoria;
import model.Producto;
import service.ProductoService;

public class VentanaBorrar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBorrar frame = new VentanaBorrar();
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
	public VentanaBorrar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 381, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("BORRAR PRODUCTO:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTitulo.setBounds(10, 11, 260, 40);
		contentPane.add(lblTitulo);
		
		tfCodigo = new JTextField();
		tfCodigo.setBounds(133, 80, 183, 28);
		contentPane.add(tfCodigo);
		tfCodigo.setColumns(10);
		
		JLabel lblCodigo = new JLabel("CÓDIGO:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCodigo.setBounds(31, 80, 135, 28);
		contentPane.add(lblCodigo);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var productoService = new ProductoService();
				productoService.eliminar(tfCodigo.getText());
				VentanaBorrar.this.dispose();
			}
		});
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnBorrar.setBounds(86, 151, 174, 40);
		contentPane.add(btnBorrar);
	}
}
