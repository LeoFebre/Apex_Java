package exercicio01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNota1.setBounds(31, 33, 46, 14);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNota2.setBounds(31, 58, 46, 20);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		lblNota3.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNota3.setBounds(31, 89, 46, 14);
		contentPane.add(lblNota3);
		
		txtNota1 = new JTextField();
		txtNota1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtNota1.setBounds(86, 30, 40, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtNota2.setBounds(86, 58, 40, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtNota3.setBounds(86, 86, 40, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					int nota1 = Integer.parseInt(txtNota1.getText());
					int nota2 = Integer.parseInt(txtNota2.getText());
					int nota3 = Integer.parseInt(txtNota3.getText());
					
					double media = (nota1 + nota2 + nota3 ) / 3;
					
					JOptionPane.showMessageDialog(null, media >= 7 ? "Aprovado com média "+media : "Reprovado com média "+media);
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Falha ao executar: "+e1.getMessage());
				}
		
				
				
				
			}
		});
		btnCalcular.setForeground(Color.BLUE);
		btnCalcular.setBackground(Color.CYAN);
		btnCalcular.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		btnCalcular.setBounds(31, 127, 89, 23);
		contentPane.add(btnCalcular);
		
		
	}
}
