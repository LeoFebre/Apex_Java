package exercicio02;

import javax.swing.JOptionPane;

import com.sun.java_cup.internal.runtime.Scanner;

public class principal {

	public static void main(String[] args) {
		
		//Obter números
		// int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		// int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número"));
		
		float fvalor1;
		float fvalor2;
		int ioperador;
		double dresultado = 0;
		int iopcao;

		    Scanner scn = new Scanner(System.in);
		    System.out.println("Calculadora em Java");
		    System.out.println("-------------------");
		    System.out.println("1- Adição");
		    System.out.println( "2- Subtração");
		    System.out.println("3- Multiplicação");
		    System.out.println("4- Divisão");
		    System.out.println("5- Sair");
		    System.out.println("-------------------");

		    System.out.println("Digite  a opção desejada para realizar o calculo:");
		        iopcao = scn.nextInt();
		    System.out.println("Digite o primeiro numero: ");
		        fvalor1 = scn.nextFloat();
		    System.out.println("Digite o segundo numero: ");
		        fvalor2 = scn.nextFloat();
		    
		     if (iopcao == 1){
		        dresultado = fvalor1 + fvalor2;
		        System.out.println(" o resultado da soma é: " + dresultado);
		        System.out.println("Precione Enter para voltar ao inicio");
		    }
		    if (iopcao == 2){
		        dresultado = fvalor1 - fvalor2;
		        System.out.println(" o resultado da subtração é: " + dresultado);
		        System.out.println("Precione Enter para voltar ao inicio");
		    }
		    if (iopcao == 3){
		        dresultado = fvalor1 * fvalor2;
		        System.out.println("O resultado da multiplicação é: " + dresultado);
		        System.out.println("Precione Enter para voltar ao inicio");
		    }
		    if (iopcao == 4){
		        dresultado = fvalor1 / fvalor2;
		        System.out.println("O resultado da divisão é: " + dresultado);
		        System.out.println("Precione Enter para voltar ao inicio");
		    }
		        if ((fvalor2 == 0) && (iopcao == 4)){
		        System.out.println("Opção inválida,não pode dividir um numero por zero");
		        System.out.println("Precione Enter para voltar ao inicio");
		    } 

	}

}
