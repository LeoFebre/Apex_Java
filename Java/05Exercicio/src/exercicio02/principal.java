package exercicio02;

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
	private JTextField txtPeso;
	private JTextField txtAltura;

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
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblPeso.setBounds(10, 11, 46, 14);
		contentPane.add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblAltura.setBounds(10, 36, 46, 14);
		contentPane.add(lblAltura);
		
		txtPeso = new JTextField();
		txtPeso.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtPeso.setBounds(65, 9, 46, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtAltura.setBounds(65, 34, 46, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double peso = Double.parseDouble(txtPeso.getText());
					double altura = Double.parseDouble(txtAltura.getText());
					
					double resultado = peso / (altura * altura);
					
					// Condicional Composta
					if(resultado < 18.5) {
						System.out.println("Abaixo do peso");
					}else if(resultado < 25) {
						System.out.println("Peso normal");
					}else if(resultado < 30) {
						System.out.println("Acima do peso");
					}else if(resultado >= 30) {
						System.out.println("Obesidade");
					}

					
					JOptionPane.showMessageDialog(null, "O cálculo do seu  ICM é "+resultado);
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Falha ao executar: "+e1.getMessage());
				}
			
				
			}
		});
				
		btnCalcular.setBackground(Color.CYAN);
		btnCalcular.setForeground(Color.BLACK);
		btnCalcular.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		btnCalcular.setBounds(22, 75, 89, 23);
		contentPane.add(btnCalcular);
			}
		}			

		