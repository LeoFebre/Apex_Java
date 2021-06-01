package ex01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Formulario extends JFrame {
	
	ArrayList<Pessoa> vetor = new ArrayList<Pessoa>();

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtCidade;
	private JTable tblPessoas;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome\r\n");
		lblNome.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblNome.setBounds(22, 21, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblIdade.setBounds(22, 46, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		lblCidade.setBounds(22, 77, 46, 14);
		contentPane.add(lblCidade);
		
		txtNome = new JTextField();
		txtNome.setBounds(78, 19, 311, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(78, 44, 311, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(78, 75, 311, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		DefaultTableModel dtm = new DefaultTableModel();
		tblPessoas = new JTable(dtm);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter dados
				String nome = txtNome.getText();
				int idade = Integer.parseInt(txtIdade.getText());
				String cidade = txtCidade.getText();
				
				// Criar objeto
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setIdade(idade);
				p.setCidade(cidade);
				
				// Adicionar ao Array
				vetor.add(p);
				
				// Limpar DefaultTableModel
				dtm.setRowCount(0);
				
				// Cadastrar dados no DefaultTableModel
				for(int i = 0; i< vetor.size(); i++) {
					dtm.addRow(new Object[] {
							vetor.get(i).getNome(),
							vetor.get(i).getIdade(),
							vetor.get(i).getCidade(),
					});
				}
				
				// Atualizar DefaultTableModel no componente JTable
				tblPessoas.setModel(dtm);
				
				//Exibir contagem de cadastros
				System.out.println(vetor.size());
				
				// Limpar campos
				txtNome.setText("");
				txtIdade.setText("");
				txtCidade.setText("");
			}
		});
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
		btnCadastrar.setBounds(157, 106, 108, 23);
		contentPane.add(btnCadastrar);
		
		
		dtm.addColumn("Nome");
		dtm.addColumn("Idade");
		dtm.addColumn("Cidade");
			
		
		JScrollPane scrlTabela = new JScrollPane();
		scrlTabela.setBounds(10, 140, 414, 110);
		contentPane.add(scrlTabela);
		
		scrlTabela.setViewportView(tblPessoas);
	}
}
