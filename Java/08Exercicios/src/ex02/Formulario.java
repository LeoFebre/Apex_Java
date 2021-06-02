package ex02;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTurma;
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
		
		// ArrayList - Alunos
				ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
	JComboBox cbxCurso = new JComboBox();
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnAlterar = new JButton("Alterar");
	JButton btnRemover = new JButton("Remover");
	JButton btnCancelar = new JButton("Cancelar");
	DefaultTableModel dtm = new DefaultTableModel();
	
	btnAlterar.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseReleased(MouseEvent e) {
			// Extrair nome do curso e valor (JComboBox)
			Cursos obj = (Cursos) cbxCurso.getSelectedItem();
			
			// Obter dados]
			String nome = txtNome.getText();
			String curso = obj.getNome();
			double valor = obj.getValor();
			String turma = txtTurma.getText();
			
			// Instanciar objeto da classe Aluno
			Aluno a = new Aluno(nome, curso, valor, turma);
			
			// Cadastrar no ArrayList
			alunos.set(indice,a);
			
			// Limpar os campos
			txtNome.setText("");
			cbxCurso.setSelectedIndex(0);
			txtTurma.setText("");
			
			// Cursor no campo nome
			txtNome.requestFocus();
			
			// Atualizar DefaultTableModel e JTable
			dtm.setRowCount(0);
			for(int i=0; i<alunos.size(); i++) {
				dtm.addRow(new Object[] {
						alunos.get(i).getNome(),
						alunos.get(i).getCurso(),
						alunos.get(i).getValor(),
						alunos.get(i).getTurma(),
						
				});
			}
			tabela.setModel(dtm);
			
			// Bot�es
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
			alunos.remove(indice);
			
			// Limpar os campos
			txtNome.setText("");
			cbxCurso.setSelectedIndex(0);
			txtTurma.setText("");
			
			// Cursor no campo nome
			txtNome.requestFocus();
			
			// Atualizar DefaultTableModel e JTable
			dtm.setRowCount(0);
			for(int i=0; i<alunos.size(); i++) {
				dtm.addRow(new Object[] {
						alunos.get(i).getNome(),
						alunos.get(i).getCurso(),
						alunos.get(i).getValor(),
						alunos.get(i).getTurma(),
						
				});
			}
			tabela.setModel(dtm);
			
			// Bot�es
						btnCadastrar.setEnabled(true);
						btnAlterar.setEnabled(false);
						btnRemover.setEnabled(false);
						btnCancelar.setEnabled(false);
		}
	});
	
	
	btnCancelar.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseReleased(MouseEvent e) {
			
			// Reset dos campos
			txtNome.setText("");
			cbxCurso.setSelectedIndex(0);
			txtTurma.setText("");
			
			// Bot�es
			btnCadastrar.setEnabled(true);
			btnAlterar.setEnabled(false);
			btnRemover.setEnabled(false);
			btnCancelar.setEnabled(false);
			
		}
	});
		
		// Carregar cursos
		Cursos c1 = new Cursos("Java", 5000);
		Cursos c2 = new Cursos("C#", 4800);
		Cursos c3 = new Cursos("Python", 3300);
		Cursos c4 = new Cursos("Front-End", 4500);
		Cursos c5 = new Cursos("PHP", 3500);
		
		//ArrayList
		ArrayList<Cursos> cursos = new ArrayList<Cursos>();
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		cursos.add(c4);
		cursos.add(c5);
		
		// Modelo ComboBox
		DefaultComboBoxModel<Cursos> dtc = new DefaultComboBoxModel<Cursos>();
		for(int i=0; i< cursos.size(); i++) {
			dtc.addElement(cursos.get(i));
		}
		
		
		dtm.addColumn("Nome");
		dtm.addColumn("Curso");
		dtm.addColumn("Valor");
		dtm.addColumn("Turma");
		
		JScrollPane barraRolagem = new JScrollPane();
		tabela = new JTable(dtm);
		
		tabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
			 indice = tabela.getSelectedRow();
				
			// Exibir os dados no formul�rio
			txtNome.setText(alunos.get(indice).getNome());
			txtTurma.setText(alunos.get(indice).getTurma());
			
					String cursoSelecionado = alunos.get(indice).getCurso();
			
			for(int i=0; i<cursos.size(); i++) {
			    if(cursoSelecionado.equals(cursos.get(indice).getNome())) {
			    	cbxCurso.setSelectedIndex(i);
			    	break;
			    }
			}
			
			// Habilitar e desabilitar bot�es
			btnCadastrar.setEnabled(false);
			btnAlterar.setEnabled(true);
			btnRemover.setEnabled(true);
			btnCancelar.setEnabled(true);
			
			}	
		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 24, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(10, 49, 46, 14);
		contentPane.add(lblCurso);
		
		JLabel lblTurma = new JLabel("Turma");
		lblTurma.setBounds(10, 74, 46, 14);
		contentPane.add(lblTurma);
		
		txtNome = new JTextField();
		txtNome.setBounds(66, 21, 334, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtTurma = new JTextField();
		txtTurma.setBounds(66, 71, 334, 20);
		contentPane.add(txtTurma);
		txtTurma.setColumns(10);
		
		
		cbxCurso.setBounds(66, 45, 334, 22);
		cbxCurso.setModel(dtc);
		contentPane.add(cbxCurso);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Extrair nome do curso e valor (JComboBox)
				Cursos obj = (Cursos) cbxCurso.getSelectedItem();
				
				// Obter dados]
				String nome = txtNome.getText();
				String curso = obj.getNome();
				double valor = obj.getValor();
				String turma = txtTurma.getText();
				
				// Instanciar objeto da classe Aluno
				Aluno a = new Aluno(nome, curso, valor, turma);
				
				// Cadastrar no ArrayList
				alunos.add(a);
				
				// Limpar os campos
				txtNome.setText("");
				cbxCurso.setSelectedIndex(0);
				txtTurma.setText("");
				
				// Cursor no campo nome
				txtNome.requestFocus();
				
				// Atualizar DefaultTableModel e JTable
				dtm.setRowCount(0);
				for(int i=0; i<alunos.size(); i++) {
					dtm.addRow(new Object[] {
							alunos.get(i).getNome(),
							alunos.get(i).getCurso(),
							alunos.get(i).getValor(),
							alunos.get(i).getTurma(),
							
					});
				}
				tabela.setModel(dtm);
				
			}
		});
		btnCadastrar.setBounds(10, 112, 89, 23);
		contentPane.add(btnCadastrar);
		
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(109, 112, 89, 23);
		contentPane.add(btnAlterar);
		
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(317, 112, 89, 23);
		contentPane.add(btnCancelar);
		
		btnRemover.setEnabled(false);
		btnRemover.setBounds(218, 112, 89, 23);
		contentPane.add(btnRemover);
		
		
		barraRolagem.setBounds(20, 146, 380, 104);
		contentPane.add(barraRolagem);
		
		barraRolagem.setViewportView(tabela);
	}
}
