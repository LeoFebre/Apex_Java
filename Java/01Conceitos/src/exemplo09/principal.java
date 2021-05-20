package exemplo09;

public class principal {

	public static void main(String[] args) {
		
		// Índice
		int indice = 1;
		
		// Laço
		while(indice < 11) {
			
			if(indice % 2 == 0) {
				System.out.println(indice + " é par");
			}else {
				System.out.println(indice + " é ímpar");
			}
			
			indice++;
		}

	}

}
