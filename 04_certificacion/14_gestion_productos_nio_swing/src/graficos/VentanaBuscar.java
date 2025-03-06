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
import javax.swing.border.EmptyBorder;

import model.Producto;
import service.ProductoService;

public class VentanaBuscar extends JFrame {

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
					VentanaBuscar frame = new VentanaBuscar();
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
	public VentanaBuscar() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 778, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("BUSCAR POR CÓDIGO");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTitulo.setBounds(27, 25, 269, 37);
		contentPane.add(lblTitulo);
		
		JLabel lblCodigo = new JLabel("CÓDIGO:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodigo.setBounds(57, 85, 92, 22);
		contentPane.add(lblCodigo);
		
		tfCodigo = new JTextField();
		tfCodigo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfCodigo.setBounds(159, 85, 203, 26);
		contentPane.add(tfCodigo);
		tfCodigo.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuscar.setBounds(372, 85, 136, 28);
		contentPane.add(btnBuscar);
		
		JLabel lblProd = new JLabel("- Producto");
		lblProd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProd.setBounds(112, 150, 308, 22);
		contentPane.add(lblProd);
		
		JLabel lblCod = new JLabel("- Código");
		lblCod.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCod.setBounds(112, 183, 308, 22);
		contentPane.add(lblCod);
		
		JLabel lblPre = new JLabel("- Precio");
		lblPre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPre.setBounds(112, 216, 308, 22);
		contentPane.add(lblPre);
		
		JLabel lblCat = new JLabel("- Categoría");
		lblCat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCat.setBounds(112, 250, 308, 22);
		contentPane.add(lblCat);
		
		JButton btnCerrar = new JButton("CERRAR");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaBuscar.this.dispose();
			}
		});
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCerrar.setBounds(568, 304, 153, 50);
		contentPane.add(btnCerrar);
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var productoService = new ProductoService();
				Producto producto = productoService.buscar(tfCodigo.getText());
				if(producto != null) {
					lblProd.setText("- "+producto.getNombre());
					lblCod.setText("- "+producto.getCodigo());
					lblPre.setText("- "+producto.getPrecio());
					lblCat.setText("- "+producto.getCategoria());
				}
				else {
					JOptionPane.showMessageDialog(VentanaBuscar.this, "Ese código NO existe!!");
					lblProd.setText("- Producto");
					lblCod.setText("- Código");
					lblPre.setText("- Precio");
					lblCat.setText("- Categoría");
				}
				
				
				
			}
		});
	}

}
