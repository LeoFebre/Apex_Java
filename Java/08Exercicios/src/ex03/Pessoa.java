package ex03;

public class Pessoa {
	
	// Atributos
	
	private String nome, situacao;
	double nota1, nota2, media;
	
	// Construtor
	public Pessoa(String nome, double nota1, double nota2, double media, String situacao) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
		this.situacao = situacao;
	}
	
	// Get e Set
	
	public String getNome() {
		return nome;
	}
	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	

	
	

}
