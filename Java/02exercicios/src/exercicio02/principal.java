package exercicio02;

import javax.swing.JOptionPane;

import com.sun.java_cup.internal.runtime.Scanner;

public class principal {

	public static void main(String[] args) {
		
		//Obter n�meros
		// int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		// int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro n�mero"));
		
		float fvalor1;
		float fvalor2;
		int ioperador;
		double dresultado = 0;
		int iopcao;

		    Scanner scn = new Scanner(System.in);
		    System.out.println("Calculadora em Java");
		    System.out.println("-------------------");
		    System.out.println("1- Adi��o");
		    System.out.println( "2- Subtra��o");
		    System.out.println("3- Multiplica��o");
		    System.out.println("4- Divis�o");
		    System.out.println("5- Sair");
		    System.out.println("-------------------");

		    System.out.println("Digite  a op��o desejada para realizar o calculo:");
		        iopcao = scn.nextInt();
		    System.out.println("Digite o primeiro numero: ");
		        fvalor1 = scn.nextFloat();
		    System.out.println("Digite o segundo numero: ");
		        fvalor2 = scn.nextFloat();
		    
		     if (iopcao == 1){
		        dresultado = fvalor1 + fvalor2;
		        System.out.println(" o resultado da soma �: " + dresultado);
		        System.out.println("Precione Enter para voltar ao inicio");
		    }
		    if (iopcao == 2){
		        dresultado = fvalor1 - fvalor2;
		        System.out.println(" o resultado da subtra��o �: " + dresultado);
		        System.out.println("Precione Enter para voltar ao inicio");
		    }
		    if (iopcao == 3){
		        dresultado = fvalor1 * fvalor2;
		        System.out.println("O resultado da multiplica��o �: " + dresultado);
		        System.out.println("Precione Enter para voltar ao inicio");
		    }
		    if (iopcao == 4){
		        dresultado = fvalor1 / fvalor2;
		        System.out.println("O resultado da divis�o �: " + dresultado);
		        System.out.println("Precione Enter para voltar ao inicio");
		    }
		        if ((fvalor2 == 0) && (iopcao == 4)){
		        System.out.println("Op��o inv�lida,n�o pode dividir um numero por zero");
		        System.out.println("Precione Enter para voltar ao inicio");
		    } 

	}

}
