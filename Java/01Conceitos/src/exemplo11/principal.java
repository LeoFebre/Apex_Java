package exemplo11;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		
		// Vetor
		String[] nomes = new String[3];
		
		// Obter tr�s nomes
		for(int indice = 0; indice < 3; indice++) {
			nomes[indice] = JOptionPane.showInputDialog("Informe o "+(indice+1)+"� nome");
		}
	
		//ForEach (para cada)
		for(String linha : nomes) {
		    System.out.println(linha);
		}
	}

}

	