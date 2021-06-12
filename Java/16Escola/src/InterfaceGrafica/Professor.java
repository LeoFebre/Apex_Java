package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.UsuarioModelo;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Professor extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Professor(UsuarioModelo um) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBoaNoiteProfessor = new JLabel("Boa Noite "+um.getNome());
		lblBoaNoiteProfessor.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblBoaNoiteProfessor.setBounds(10, 11, 171, 14);
		contentPane.add(lblBoaNoiteProfessor);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 63, 510, 206);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnCadastrarProva = new JButton("Cadastrar Prova");
		btnCadastrarProva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFRAME
				dispose();
				
				// Exibir o JFRAME Prova
				Prova p  = new Prova(um);
				p.setVisible(true);
				
				}
		});
		btnCadastrarProva.setIcon(new ImageIcon("C:\\Users\\Apex02\\Desktop\\Leonardo\\Java\\16Escola\\Imagens\\iconfinder_1622833_checkmark_done_exam_list_pencil_icon_64px.png"));
		btnCadastrarProva.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		panel.add(btnCadastrarProva);
		
		JButton btnNotas = new JButton("Notas");
		btnNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFRAME
				dispose();
				
				// Exibir o JFRAME Prova
				Notas n  = new Notas(um);
				n.setVisible(true);
				
			}
		});
		btnNotas.setIcon(new ImageIcon("C:\\Users\\Apex02\\Desktop\\Leonardo\\Java\\16Escola\\Imagens\\iconfinder_2824443_pen_pencil_school_stationery_icon_64px.png"));
		btnNotas.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		panel.add(btnNotas);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFRAME
				dispose();
				
				// Exibir o JFRAME Login
				Login l  = new Login();
				l.setVisible(true);
				
			}
		});
		btnSair.setIcon(new ImageIcon("C:\\Users\\Apex02\\Desktop\\Leonardo\\Java\\16Escola\\Imagens\\iconfinder_1564505_close_delete_exit_remove_icon_64px.png"));
		btnSair.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		panel.add(btnSair);
	}

}
