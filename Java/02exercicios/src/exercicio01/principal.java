package exercicio01;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		
		// V�riavel Obter nome do produto
		String produto = JOptionPane.showInputDialog("Nome do produto");
		
		// Vari�vel Obter forma de pagamento
		String pagamento = JOptionPane.showInputDialog("Forma de pagamento?");
		
		// Vari�vel Obter um valor
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto"));
		
		// Condicional
		if(valor >= 500 && pagamento.equals("a vista")) {
			System.out.println("Haver� um desconto de 10% em cima do valor");
		}else {
			System.out.println("N�o haver� desconto");
		}
		
	
		 

	}

}
