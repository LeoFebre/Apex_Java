package ex03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ex02.Aluno;
import ex02.Cursos;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTable tabela;
	
	// Indice
	       int indice = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		// ArrayList - Pessoa
		   ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
		
		JButton btnCadastrar = new JButton("Cadastrar");
		JButton btnAlterar = new JButton("Alterar");
		JButton btnRemover = new JButton("Remover");
		JButton btnCancelar = new JButton("Cancelar");
		DefaultTableModel dtm = new DefaultTableModel();
		tabela = new JTable();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNome.setBounds(10, 22, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNota1.setBounds(10, 47, 46, 14);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNota2.setBounds(10, 72, 46, 14);
		contentPane.add(lblNota2);
		
		txtNome = new JTextField();
		txtNome.setBackground(Color.WHITE);
		txtNome.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtNome.setBounds(66, 20, 110, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtNota1.setBounds(66, 45, 46, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		txtNota2.setBounds(66, 70, 46, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter dados
				String nome = txtNome.getText();
				double nota1 = Double.parseDouble(txtNota1.getText());
				double nota2 = Double.parseDouble(txtNota2.getText());
				
				// Cálculo da média
				double media = (nota1 + nota2)/2;
				
				// Situação
				String situação;
				if(media >= 7) {
					situação = "Aprovado";
				}else {
					situação = "Reprovado";
				}
				
				// Instanciar objeto da classe Pessoa
				Pessoa p = new Pessoa(nome, nota1, nota2, media, situação);
				
				// Cadastrar
				pessoa.add(p);
				
				// Limpar os campos
				txtNome.setText("");
				txtNota1.setText("");
				txtNota2.setText("");
				
				// Cursor no campo nome
				txtNome.requestFocus();
				
				// Atualizar DefaultTableModel e JTable
				dtm.setRowCount(0);
				for(int i=0; i<pessoa.size(); i++) {
					dtm.addRow(new Object[] {
							pessoa.get(i).getNome(),
							pessoa.get(i).getNota1(),
							pessoa.get(i).getNota2(),
							pessoa.get(i).getMedia(),
							pessoa.get(i).getSituacao()
							
							
					});
				}
				tabela.setModel(dtm);
				
				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});
		
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				// Obter dados
				String nome = txtNome.getText();
				double nota1 = Double.parseDouble(txtNota1.getText());
				double nota2 = Double.parseDouble(txtNota2.getText());
				
				// Cálculo da média
				double media = (nota1 + nota2)/2;
				
				// Situação
				String situação;
				if(media >= 7) {
					situação = "Aprovado";
				}else {
					situação = "Reprovado";
				}
				
				// Instanciar objeto da classe Aluno
				Pessoa p = new Pessoa(nome, nota1, nota2, media, situação);
				
				// Cadastrar no ArrayList
				pessoa.set(indice,p);
				
				// Limpar os campos
				txtNome.setText("");
				txtNota1.setText("");
				txtNota2.setText("");
				
				// Cursor no campo nome
				txtNome.requestFocus();
				
				// Atualizar DefaultTableModel e JTable
				dtm.setRowCount(0);
				for(int i=0; i<pessoa.size(); i++) {
					dtm.addRow(new Object[] {
							pessoa.get(i).getNome(),
							pessoa.get(i).getNota1(),
							pessoa.get(i).getNota2(),
							pessoa.get(i).getMedia(),
							pessoa.get(i).getSituacao()
							
					});
				}
				tabela.setModel(dtm);
				
				// Botões
							btnCadastrar.setEnabled(true);
							btnAlterar.setEnabled(false);
							btnRemover.setEnabled(false);
							btnCancelar.setEnabled(false);
			}
		});
		
		btnRemover.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				// Remover do ArrayList
				pessoa.remove(indice);
				
				// Limpar os campos
				txtNome.setText("");
				txtNota1.setText("");
				txtNota2.setText("");
				
				// Cursor no campo nome
				txtNome.requestFocus();
				
				// Atualizar DefaultTableModel e JTable
				dtm.setRowCount(0);
				for(int i=0; i<pessoa.size(); i++) {
					dtm.addRow(new Object[] {
							pessoa.get(i).getNome(),
							pessoa.get(i).getNota1(),
							pessoa.get(i).getNota2(),
							pessoa.get(i).getMedia(),
							pessoa.get(i).getSituacao()
							
					});
				}
				tabela.setModel(dtm);
				
				// Botões
							btnCadastrar.setEnabled(true);
							btnAlterar.setEnabled(false);
							btnRemover.setEnabled(false);
							btnCancelar.setEnabled(false);
			}
		});
		
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				// Limpar os campos
				txtNome.setText("");
				txtNota1.setText("");
				txtNota2.setText("");
				
				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);
				
			}
		});
		
		// Adição de colunas na tabela
		dtm.addColumn("Nome");
		dtm.addColumn("Nota 1");
		dtm.addColumn("Nota 2");
		dtm.addColumn("Média");
		dtm.addColumn("Situação");
		
		btnCadastrar.setBackground(Color.LIGHT_GRAY);
		btnCadastrar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		btnCadastrar.setBounds(10, 120, 89, 23);
		contentPane.add(btnCadastrar);
		
		btnAlterar.setBackground(Color.LIGHT_GRAY);
		btnAlterar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		btnAlterar.setBounds(115, 120, 89, 23);
		contentPane.add(btnAlterar);
		
		btnRemover.setBackground(Color.LIGHT_GRAY);
		btnRemover.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		btnRemover.setBounds(214, 120, 89, 23);
		contentPane.add(btnRemover);
		
		btnCancelar.setBackground(Color.LIGHT_GRAY);
		btnCancelar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
		btnCancelar.setBounds(320, 120, 89, 23);
		contentPane.add(btnCancelar);
		
		JScrollPane barraRolagem = new JScrollPane();
		tabela = new JTable(dtm);
		
		tabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
			 indice = tabela.getSelectedRow();
				
			// Exibir os dados no formulário
			txtNome.setText(pessoa.get(indice).getNome());
			txtNota1.setText(String.valueOf(pessoa.get(indice).getNota1()));
			txtNota2.setText(String.valueOf(pessoa.get(indice).getNota2()));
			
			// Habilitar e desabilitar botões
			btnCadastrar.setEnabled(false);
			btnAlterar.setEnabled(true);
			btnRemover.setEnabled(true);
			btnCancelar.setEnabled(true);
			
			}	
		});
		
		barraRolagem.setBounds(10, 154, 399, 107);
		contentPane.add(barraRolagem);
		
		
		barraRolagem.setViewportView(tabela);
		
	}
}
