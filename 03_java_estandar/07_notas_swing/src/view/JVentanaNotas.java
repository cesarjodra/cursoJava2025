package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import service.NotasService;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class JVentanaNotas extends JFrame {
	
	static NotasService notasService = new NotasService();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JVentanaNotas frame = new JVentanaNotas();
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
	public JVentanaNotas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 638, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jbtn1 = new JButton("INTRODUCIR NOTA");
		JButton jbtn2 = new JButton("VER MEDIA");		
		JButton jbtn3 = new JButton("VER APROBADOS");
		JButton jbtn4 = new JButton("VER NOTA MAS ALTA");
		jtf1 = new JTextField();
		JLabel jlbl1 = new JLabel("-");
		JLabel jlbl2 = new JLabel("-");
		JLabel jlbl3 = new JLabel("-");			
		
		jbtn1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jbtn1.setBounds(52, 74, 245, 79);
		contentPane.add(jbtn1);
		
		
		jbtn2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jbtn2.setBounds(52, 164, 245, 79);
		contentPane.add(jbtn2);		
		
		jbtn3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jbtn3.setBounds(52, 254, 245, 79);
		contentPane.add(jbtn3);		
		
		jbtn4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jbtn4.setBounds(52, 344, 245, 79);
		contentPane.add(jbtn4);		
		
		jtf1.setHorizontalAlignment(SwingConstants.RIGHT);
		jtf1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jtf1.setBounds(322, 74, 200, 79);
		contentPane.add(jtf1);
		jtf1.setColumns(10);		
		
		jlbl1.setHorizontalAlignment(SwingConstants.CENTER);
		jlbl1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbl1.setBounds(322, 164, 200, 79);
		contentPane.add(jlbl1);		
		
		jlbl2.setHorizontalAlignment(SwingConstants.CENTER);
		jlbl2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbl2.setBounds(322, 254, 200, 79);
		contentPane.add(jlbl2);		
		
		jlbl3.setHorizontalAlignment(SwingConstants.CENTER);
		jlbl3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jlbl3.setBounds(322, 344, 200, 79);
		contentPane.add(jlbl3);
		
		
		// EVENTOS
		
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				notasService.guardarNota( Double.parseDouble(jtf1.getText()) );	
				jtf1.requestFocus(); 
				jtf1.selectAll(); 
			}
		});
		
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlbl1.setText(""+notasService.media());				
			}
		});
		
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlbl2.setText(""+notasService.aprobados());				
			}
		});
		
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlbl3.setText(""+notasService.notaMax());				
			}
		});
		
		
	}

}
