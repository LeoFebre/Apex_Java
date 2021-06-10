package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prova extends JFrame {

	private JPanel contentPane;
	private JTextField txtProva;

	/**
	 * Create the frame.
	 */
	public Prova() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProva = new JLabel("Prova");
		lblProva.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblProva.setBounds(10, 106, 46, 14);
		contentPane.add(lblProva);
		
		txtProva = new JTextField();
		txtProva.setBounds(75, 104, 420, 20);
		contentPane.add(txtProva);
		txtProva.setColumns(10);
		
		JButton btnCadastrarProva = new JButton("Cadastrar");
		btnCadastrarProva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCadastrarProva.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		btnCadastrarProva.setBounds(125, 181, 107, 23);
		contentPane.add(btnCadastrarProva);
		
		JButton btnCancelarProva = new JButton("Cancelar");
		btnCancelarProva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFRAME
				dispose();
				
				// Exibir o JFRAME Professor
				Professor p = new Professor();
				p.setVisible(true);
				
				
			}
		});
		btnCancelarProva.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		btnCancelarProva.setBounds(321, 181, 107, 23);
		contentPane.add(btnCancelarProva);
	}

}
