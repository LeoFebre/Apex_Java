package exemplo03;

public class produto {

	// Atributos
	private String nome;
	private double valor;
	
	// Get e Set
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	// Met�do de mensagem
	public void mensagem() {
		System.out.println("O produto "+nome+" custa R$ "+valor);
	}
	
}
