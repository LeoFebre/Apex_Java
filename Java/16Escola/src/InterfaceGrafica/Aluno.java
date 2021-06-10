package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aluno extends JFrame {

	private JPanel contentPane;
	private JTable table;

/**
	 * Create the frame.
	 */
	public Aluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBoaNoiteAluno = new JLabel("Boa Noite Aluno");
		lblBoaNoiteAluno.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblBoaNoiteAluno.setBounds(10, 11, 171, 14);
		contentPane.add(lblBoaNoiteAluno);
		
		JButton btnSairAluno = new JButton("Sair");
		btnSairAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Fechar o JFRAME
				dispose();
				
				// Exibir o JFRAME Aluno
				Login l = new Login();
				l.setVisible(true);
			}
		});
		btnSairAluno.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		btnSairAluno.setBounds(448, 8, 89, 23);
		contentPane.add(btnSairAluno);
		
		DefaultTableModel dtm = new DefaultTableModel();
		dtm.addColumn("Prova");
		dtm.addColumn("Nota");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(19, 69, 506, 215);
		contentPane.add(scrollPane);
		
		table = new JTable(dtm);
		scrollPane.setViewportView(table);
	}
}
