package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.UsuarioControle;
import modelo.UsuarioModelo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JPasswordField pswSenha;
	private JTextField txtRua;
	private JTextField txtComplemento;
	private JTextField txtEmail;
	private JTextField txtBairro;
	private JTextField txtNumero;
	private JTextField txtTelefone;

	/**
	 * Create the frame.
	 */
	public Usuarios(UsuarioModelo um) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblSenha.setBounds(10, 67, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblEmail.setBounds(307, 11, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblBairro.setBounds(307, 67, 46, 14);
		contentPane.add(lblBairro);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblRua.setBounds(10, 119, 46, 14);
		contentPane.add(lblRua);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblComplemento.setBounds(10, 175, 104, 14);
		contentPane.add(lblComplemento);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblTelefone.setBounds(307, 175, 69, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblNumero = new JLabel("N\u00FAmero");
		lblNumero.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNumero.setBounds(306, 119, 69, 14);
		contentPane.add(lblNumero);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 199, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		pswSenha = new JPasswordField();
		pswSenha.setBounds(10, 86, 199, 20);
		contentPane.add(pswSenha);
		
		txtRua = new JTextField();
		txtRua.setBounds(10, 142, 199, 20);
		contentPane.add(txtRua);
		txtRua.setColumns(10);
		
		txtComplemento = new JTextField();
		txtComplemento.setBounds(10, 200, 199, 20);
		contentPane.add(txtComplemento);
		txtComplemento.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(306, 36, 199, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(306, 86, 199, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(307, 146, 198, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(307, 200, 198, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JComboBox cbxTipo = new JComboBox<String>();
		cbxTipo.addItem("Tipo de conta");
		cbxTipo.addItem("Administrador");
		cbxTipo.addItem("Professor");
		cbxTipo.addItem("Aluno");
		cbxTipo.setBounds(10, 246, 495, 22);
		contentPane.add(cbxTipo);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Tentativa
				try {
				
				// Obter dados
				
				String nome = txtNome.getText();
				String email = txtEmail.getText(); 
				String senha = String.valueOf(pswSenha.getPassword()); 
				String bairro = txtBairro.getText();
				String rua = txtRua.getText(); 
				int numero = Integer.parseInt(txtNumero.getText());
				String complemento = txtComplemento.getText();
				String telefone = txtTelefone.getText(); 
				int tipo = cbxTipo.getSelectedIndex();
				
				// Criar objeto do tipo UsuarioModelo
				UsuarioModelo um = new UsuarioModelo(nome, senha, email, bairro, rua, numero, complemento, telefone, tipo);
				
				// Cadsatrar usuário
				boolean status = UsuarioControle.cadastrar(um);
				
				// Mensagem
				JOptionPane.showMessageDialog(null, status == true ? "Cadastro realizado com sucesso!" : "Falha ao cadastrar");
				
				// Limpar campos
				txtNome.setText("");
				txtEmail.setText("");
				pswSenha.setText("");
				txtBairro.setText("");
				txtRua.setText("");
				txtNumero.setText("");
				txtComplemento.setText("");
				txtTelefone.setText("");
				cbxTipo.setSelectedIndex(0);
				
				// Cursor no campo nome
				txtNome.requestFocus();
				
				}catch (Exception erro) {}
			}
		});
		btnCadastrar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		btnCadastrar.setBounds(82, 288, 104, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFRAME
				dispose();
				
				// Exibir o JFRAME Administrador
				Administrador a = new Administrador(um);
				a.setVisible(true);
				
			}
		});
		btnCancelar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		btnCancelar.setBounds(289, 288, 104, 23);
		contentPane.add(btnCancelar);
	}
}
