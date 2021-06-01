package exemplo01;

import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		
		ArrayList<String> cursos = new ArrayList<String>();
		
		// Cadastrar cursos
		cursos.add("Lógica e Algoritmos");
		cursos.add("Banco de Dados");
		cursos.add("Java Fundamentos");
		cursos.add("Java Web");
		
		// Remover curso
		cursos.remove(1);
		
		// Alterar curso
		cursos.set(2, "Java - Spring");
		
		// Quantidade de cursos
		System.out.println("Quantidade de cursos cadastrados: "+cursos.size());
		
		// Listar
		for(String elemento : cursos) {
			System.out.println(elemento);
		}

	}

}
