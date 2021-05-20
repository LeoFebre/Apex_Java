package exemplo12;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		
		// Matriz
		String[][] dados = new String[3][2];
     
		// Laço
		for(int i=0; i<3; i++) {
			
			dados[i][0] = JOptionPane.showInputDialog("Informe o "+(i+1)+"º nome");
			dados[i][1] = JOptionPane.showInputDialog("Informe a "+(i+1)+"ª idade");
		}
		
		// Laço - listar
		String mensagem = "Dados informados:\n";
		for(int i=0; i<3; i++) {
			mensagem += dados[i][0] + " - " + dados[i][1] + "\n";
		}
		
		// Exibir lista
		JOptionPane.showMessageDialog(null, mensagem);
	}

}



