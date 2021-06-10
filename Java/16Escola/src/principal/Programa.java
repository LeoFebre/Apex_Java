package principal;

import java.awt.EventQueue;

import InterfaceGrafica.Login;
import bd.Conexao;

public class Programa {
	
	public static void main(String[] args) {
		
		Conexao.iniciarConexao();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
