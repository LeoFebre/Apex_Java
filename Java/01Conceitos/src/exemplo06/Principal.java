package exemplo06;

public class Principal {

	public static void main(String[] args) {
		
		// Média
		double media = 7;
		
		// Condicional Simples
		/*if(media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}*/
		
		// Condicional Composta
		if(media >= 7) {
			System.out.println("Aprovado");
		}else if(media >= 5) {
			System.out.println("Em Exame");
		}else {
			System.out.println("Reprovado");
		}

	}

}


