package principal;

//No Java não há Herança múltipla, sendo assim só é possível herdar uma classe

public class Pessoa extends Cargo{
	
	// Atributos
	private String nome;
	private int idade;
	
	// Construtor
	public Pessoa(String nome, String cargo, int idade, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		
		listarPessoa();
		listarCargo();
	}
	
	// Método para listar dados
	private void listarPessoa() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
	}
	
	//
	

}
