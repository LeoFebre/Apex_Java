package exemplo01;

public class principal {

	public static void main(String[] args) {
		
		// 	Vari�vel 
		String texto = "Quarta aula de JAVA Fundamentos";
		
		// 	Quantidade de caracteres
		System.out.println(texto.length());
		
		// Obter caractere
		for(int i=0; i<texto.length(); i++) {
		System.out.println("O "+(i+1)+" caratere � "+texto.charAt(i));

	}
	
	// Letras mai�sculas e min�sculas
	System.out.println(texto.toLowerCase());
	System.out.println(texto.toUpperCase());
	
	// Cortar caracteres
	System.out.println(texto.substring(15));
	System.out.println(texto.substring(15, 19));
	
	// Remover espa�os no come�o e no final da vari�vel
	String nome = "             Luciano";
	System.out.println(nome.trim());
	
	// Verificar exist�ncia de um caractere
	String email = "ralf.lima@gmail.com";
	System.out.println(email.indexOf("@"));
	
	// C�digo ASCII / Identificar e retornar c�digo das teclas (programa)
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
