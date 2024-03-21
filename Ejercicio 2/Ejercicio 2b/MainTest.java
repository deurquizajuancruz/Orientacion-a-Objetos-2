package ejercicio2b;

public class MainTest {

	public static void main(String[] args) {
		Jugador jugador1, jugador2, jugador3, jugador4, jugador5;
		jugador1 = new Jugador("Numero 1", new Piedra());
		jugador2 = new Jugador("Numero 2", new Papel());
		jugador3 = new Jugador("Numero 3", new Tijera());
		jugador4 = new Jugador("Numero 4", new Lagarto());
		jugador5 = new Jugador("Numero 5", new Spock());
		System.out.println("JUGADOR 1:");
		System.out.println(new Juego(jugador1, jugador1).jugar()); // empate
		System.out.println(new Juego(jugador1, jugador2).jugar()); // 2
		System.out.println(new Juego(jugador1, jugador3).jugar()); // 1
		System.out.println(new Juego(jugador1, jugador4).jugar()); // 1
		System.out.println(new Juego(jugador1, jugador5).jugar()); // 5
		System.out.println("JUGADOR 2:");
		System.out.println(new Juego(jugador2, jugador1).jugar()); // 2
		System.out.println(new Juego(jugador2, jugador2).jugar()); // empate
		System.out.println(new Juego(jugador2, jugador3).jugar()); // 3
		System.out.println(new Juego(jugador2, jugador4).jugar()); // 4
		System.out.println(new Juego(jugador2, jugador5).jugar()); // 2
		System.out.println("JUGADOR 3:");
		System.out.println(new Juego(jugador3, jugador1).jugar()); // 1
		System.out.println(new Juego(jugador3, jugador2).jugar()); // 3
		System.out.println(new Juego(jugador3, jugador3).jugar()); // empate
		System.out.println(new Juego(jugador3, jugador4).jugar()); // 3
		System.out.println(new Juego(jugador3, jugador5).jugar()); // 5
		System.out.println("JUGADOR 4:");
		System.out.println(new Juego(jugador4, jugador1).jugar()); // 1
		System.out.println(new Juego(jugador4, jugador2).jugar()); // 4
		System.out.println(new Juego(jugador4, jugador3).jugar()); // 3
		System.out.println(new Juego(jugador4, jugador4).jugar()); // empate
		System.out.println(new Juego(jugador4, jugador5).jugar()); // 4
		System.out.println("JUGADOR 5:");
		System.out.println(new Juego(jugador5, jugador1).jugar()); // 5
		System.out.println(new Juego(jugador5, jugador2).jugar()); // 2
		System.out.println(new Juego(jugador5, jugador3).jugar()); // 5
		System.out.println(new Juego(jugador5, jugador4).jugar()); // 4
		System.out.println(new Juego(jugador5, jugador5).jugar()); // empate
	}

}
