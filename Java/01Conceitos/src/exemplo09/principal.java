package exemplo09;

public class principal {

	public static void main(String[] args) {
		
		// �ndice
		int indice = 1;
		
		// La�o
		while(indice < 11) {
			
			if(indice % 2 == 0) {
				System.out.println(indice + " � par");
			}else {
				System.out.println(indice + " � �mpar");
			}
			
			indice++;
		}

	}

}
