package principal;

//No Java n�o h� Heran�a m�ltipla, sendo assim s� � poss�vel herdar uma classe

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
	
	// M�todo para listar dados
	private void listarPessoa() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
	}
	
	//
	

}
