package exemplo04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Exibir uma mensagem
		// JOptionPane.showMessageDialog(null, "Hello World!");

		// Obter um dado
		// String texto = JOptionPane.showInputDialog("Informe algo...");
		
		// Caixa de confirmação
		int opcao = JOptionPane.showConfirmDialog(null, "Gostando de Java?");
		JOptionPane.showMessageDialog(null, "O número da opção é " + opcao);
		
	}

}

