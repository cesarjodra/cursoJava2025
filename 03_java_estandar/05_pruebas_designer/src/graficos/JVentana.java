package graficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class JVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVentana frame = new JVentana();
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
	public JVentana() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 870, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel jlblMsg = new JLabel("- - - - - - - - - - -");
		JButton jbtn1 = new JButton("PULSAR AQUÍ");
		jbtn1.setForeground(new Color(0, 0, 0));
		jbtn1.setBackground(new Color(192, 192, 192));
		jbtn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblMsg.setText("Lo hemos cambiado");
			}
		});
		jbtn1.setBounds(85, 49, 220, 72);
		contentPane.add(jbtn1);
		
		
		jlblMsg.setBounds(315, 49, 271, 72);
		contentPane.add(jlblMsg);
	}
}
