package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.UsuarioModelo;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Notas extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Notas(UsuarioModelo um) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbxTurmas = new JComboBox();
		cbxTurmas.setBounds(27, 98, 474, 22);
		contentPane.add(cbxTurmas);
		
		JComboBox cbxProvas = new JComboBox();
		cbxProvas.setBounds(27, 146, 474, 22);
		contentPane.add(cbxProvas);
		
		JLabel lblImagem = new JLabel("New label");
		lblImagem.setIcon(new ImageIcon("C:\\Users\\Apex02\\Desktop\\Leonardo\\Java\\16Escola\\Imagens\\iconfinder_2824443_pen_pencil_school_stationery_icon_64px.png"));
		lblImagem.setBounds(221, 11, 64, 64);
		contentPane.add(lblImagem);
		
		JButton btnSairNotas = new JButton("Sair");
		btnSairNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFRAME
				dispose();
				
				// Exibir o JFRAME Professor
				Professor p = new Professor(um);
				p.setVisible(true);
				
				
			}
		});
		btnSairNotas.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		btnSairNotas.setBounds(454, 11, 89, 23);
		contentPane.add(btnSairNotas);
	}

}
