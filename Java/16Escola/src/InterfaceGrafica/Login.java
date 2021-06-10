package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField pswSenha;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(274, 146, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(274, 171, 46, 14);
		contentPane.add(lblSenha);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(323, 143, 159, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		pswSenha = new JPasswordField();
		pswSenha.setBounds(322, 168, 160, 20);
		contentPane.add(pswSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFRAME
				dispose();
				
				// Exibir o JFRAME Administrador
				Administrador a = new Administrador();
				a.setVisible(true);
				}
		});
		btnEntrar.setBounds(356, 210, 89, 23);
		contentPane.add(btnEntrar);
		
		JLabel lblImagem = new JLabel("Imagem");
		lblImagem.setIcon(new ImageIcon("C:\\Users\\Apex02\\Desktop\\Leonardo\\Java\\16Escola\\Imagens\\iconfinder_32708_book_dictionary_learn_school_read_icon_128px.png"));
		lblImagem.setBounds(69, 77, 128, 128);
		contentPane.add(lblImagem);
	}
}
