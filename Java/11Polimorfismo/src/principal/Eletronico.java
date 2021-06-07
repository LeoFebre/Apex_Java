package principal;

public class Eletronico extends Produto {
	
	// Imposto Federal
	public void ifd(double valor) {
		System.out.println("Imposto Federal - Eletrônicos R$"+(valor * 0.1));
	}

}
