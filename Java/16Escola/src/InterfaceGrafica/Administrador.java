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

public class Administrador extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Administrador(UsuarioModelo um) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBoasVindas = new JLabel("Boa Noite "+um.getNome());
		lblBoasVindas.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblBoasVindas.setBounds(10, 25, 171, 14);
		contentPane.add(lblBoasVindas);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 85, 466, 147);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnCadastrar = new JButton("Cadastrar Usuários");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFRAME
				dispose();
				
				// Exibir o JFRAME Usuarios
				Usuarios u = new Usuarios(um);
				u.setVisible(true);
				
			}
		});
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\Apex02\\Desktop\\Leonardo\\Java\\16Escola\\Imagens\\iconfinder_403022_business man_male_user_avatar_profile_icon_64px.png"));
		btnCadastrar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		panel.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFRAME
				dispose();
				
				// Exibir o JFRAME Login
				Login l = new Login();
				l.setVisible(true);

				
				
			}
		});
		btnSair.setIcon(new ImageIcon("C:\\Users\\Apex02\\Desktop\\Leonardo\\Java\\16Escola\\Imagens\\iconfinder_1564505_close_delete_exit_remove_icon_64px.png"));
		btnSair.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		panel.add(btnSair);
	}
}
