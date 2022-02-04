package Capitulo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TesteCapitulo2 {
	public static void main(String[] args) {

		Usuario user1 = new Usuario("Constantino", 150);
		Usuario user2 = new Usuario("Fabiano", 120);
		Usuario user3 = new Usuario("Barreto", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		System.out.println("======Velho======");

		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}

		System.out.println("======Formas possiveis======");

		Mostrador m = new Mostrador();
		
		usuarios.forEach(m);

		System.out.println("======Forma mais inchuta comn Lambda======");
		Consumer<Usuario> motrando = (Usuario u) -> {
			System.out.println(u.getNome());
		};
		usuarios.forEach(motrando);
		
		System.out.println("======Forma mais inchuta sem atribuicao do Consumer======");
		usuarios.forEach(u -> System.out.println(u.getNome()));

	}

}
