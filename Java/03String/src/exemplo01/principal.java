package exemplo01;

public class principal {

	public static void main(String[] args) {
		
		// 	Variável 
		String texto = "Quarta aula de JAVA Fundamentos";
		
		// 	Quantidade de caracteres
		System.out.println(texto.length());
		
		// Obter caractere
		for(int i=0; i<texto.length(); i++) {
		System.out.println("O "+(i+1)+" caratere é "+texto.charAt(i));

	}
	
	// Letras maiúsculas e minúsculas
	System.out.println(texto.toLowerCase());
	System.out.println(texto.toUpperCase());
	
	// Cortar caracteres
	System.out.println(texto.substring(15));
	System.out.println(texto.substring(15, 19));
	
	// Remover espaços no começo e no final da variável
	String nome = "             Luciano";
	System.out.println(nome.trim());
	
	// Verificar existência de um caractere
	String email = "ralf.lima@gmail.com";
	System.out.println(email.indexOf("@"));
	
	// Código ASCII / Identificar e retornar código das teclas (programa)
	char letra = 'L';
	System.out.println((int) letra);
	
	// Vetor de texto
	String cursos = "HTML;JavaScript;Java;MySQL;";
	
	String[] vetor = cursos.split(";");
	
	for(int i=0; i<vetor.length; i++) {
	System.out.println(vetor[i]);
	
	
	
	
	}
}
}
