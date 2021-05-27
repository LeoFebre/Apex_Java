package exemplo04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal extends JFrame {

	private JPanel contentPane;

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
		
		JLabel lblimagem = new JLabel("imagem");
		lblimagem.setIcon(new ImageIcon("C:\\Users\\Apex02\\Desktop\\Leonardo\\Java\\04InterfaceGr\u00E1fica\\Imagens\\iconfinder_user_2561496.png"));
		lblimagem.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblimagem.setBounds(135, 21, 128, 128);
		contentPane.add(lblimagem);
		
		JCheckBox ckbFrontEnd = new JCheckBox("Front-End");
		ckbFrontEnd.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		ckbFrontEnd.setBounds(6, 157, 97, 23);
		contentPane.add(ckbFrontEnd);
		
		JCheckBox ckbDevJava = new JCheckBox("Dev. Java");
		ckbDevJava.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		ckbDevJava.setBounds(155, 157, 97, 23);
		contentPane.add(ckbDevJava);
		
		JCheckBox ckbDevCSharp = new JCheckBox("Dev. C#");
		ckbDevCSharp.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		ckbDevCSharp.setBounds(316, 157, 97, 23);
		contentPane.add(ckbDevCSharp);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Mensagem
				String mensagem = "Você selecionou:\n";
				
				//Verifica se houve seleção
				boolean checar = false;
				
				// Validar checkboxes
				if(ckbFrontEnd.isSelected()) {
					mensagem += "Front-End\n";
					checar = true;
				}
				if(ckbDevJava.isSelected()) {
					mensagem += "Dev. Java\n";
					checar = true;
				}	
				if(ckbDevCSharp.isSelected()) {
					mensagem += "Dev. C#\n";
					checar = true;
				}
				
				//Exibir mensagem
				JOptionPane.showMessageDialog(null, checar == true ? mensagem : "Selecione um cargo");
			}
		});
		btnEnviar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		btnEnviar.setBounds(155, 199, 89, 23);
		contentPane.add(btnEnviar);
	}
}
